import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import 'rxjs/add/operator/map';
import {LoggingService} from './logging.service';
import {appConfig} from '../app.config';
import {environment} from '../../environments/environment';
import {Student, User, UserData} from '../model';

@Injectable()
export class AuthenticationService {

  private loginPath = appConfig.apiUrl + 'student/auth';

  constructor(private http: HttpClient, private log: LoggingService) {
  }

  async login(username: string, password: string) {
    // authenticate
    let headers = new HttpHeaders();
    headers = headers.append('Authorization', 'Basic ' + btoa(`${username}:${password}`));
    headers = headers.append('Content-Type', 'application/json');

    const response = await this.http.post(this.loginPath, '', {headers: headers}).toPromise();
    try {
      const student = response as Student;
      if (student) {
        // store user details and jwt token in local storage to keep user logged in between page refreshes
        localStorage.setItem('currentAuth', JSON.stringify({username: username, password: password}));
        localStorage.setItem('currentStudent', JSON.stringify(student));
      }
    } catch (err) {
      this.log.log('login failed', err.message);
      return err;
    }
  }

  logout() {
    // remove user from local storage to log user out
    localStorage.removeItem('currentStudent');
  }

  currentAuth(): UserData {
    const student = localStorage.getItem('currentStudent') as Student;
    const auth = localStorage.getItem('currentStudent') as User;

    if (student && auth) {
      return {
        email: student.email,
        firstName: student.firstName,
        lastName: student.lastName,
        id: student.id,
        password: auth.password
      };
    }
    if (!environment.production) {
      return {
        id: 6192449487634432,
        email: 'admin',
        firstName: 'admin',
        lastName: 'admin',
        password: 'admin'
      };
    }
    return null;
  }

  currentStudent(): Student {
    let student = localStorage.getItem('currentStudent') as Student;
    if (!environment.production) {
      student = {
        id: 6192449487634432,
        email: 'admin',
        firstName: 'admin',
        lastName: 'admin',
      };
    }
    return student;
  }

}
