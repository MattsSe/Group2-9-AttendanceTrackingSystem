import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {HttpHeaders, HttpResponse} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import {LoggingService} from './logging.service';
import {Student} from '../models/student';
import {User} from '../models/user';

@Injectable()
export class AuthenticationService {
  constructor(private http: HttpClient, private log: LoggingService) {
  }

  async login(username: string, password: string) {
    // authenticate
    const headers = new HttpHeaders();
    headers.append('Authorization', 'Basic ' + btoa(`${username}:${password}`));

    const response = await this.http.post('/students/login', {username: username, password: password}).toPromise();
    try {
      const user = response as User;
      if (user) {
        // store user details and jwt token in local storage to keep user logged in between page refreshes
        localStorage.setItem('currentStudent', JSON.stringify(user));
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
