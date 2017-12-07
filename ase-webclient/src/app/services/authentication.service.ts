import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {HttpHeaders, HttpResponse} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import {LoggingService} from './logging.service';
import {Student} from '../model/student';
import {User} from '../model/user';
import {appConfig} from '../app.config';

@Injectable()
export class AuthenticationService {

  private loginPath = appConfig.apiUrl + 'student/login';

  constructor(private http: HttpClient, private log: LoggingService) {
  }

  async login(username: string, password: string) {
    // authenticate
    const headers = new HttpHeaders();
    headers.append('Authorization', 'Basic ' + btoa(`${username}:${password}`));

    const response = await this.http.post(this.loginPath, null, {headers: headers}).toPromise();
    try {
      const student = response as Student;
      if (student) {
        // store user details and jwt token in local storage to keep user logged in between page refreshes
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
}
