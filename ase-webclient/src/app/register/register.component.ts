import {Component, OnInit} from '@angular/core';
import {AlertService, AuthenticationService} from '../services';
import {Student, UserData} from '../model';
import {Router} from '@angular/router';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {appConfig} from '../app.config';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  private registerPath = appConfig.apiUrl + 'student/register';

  model: any = {};

  constructor(private alertService: AlertService,
              private authService: AuthenticationService,
              private router: Router,
              private http: HttpClient) {
  }

  ngOnInit() {
  }

  protected login(): Promise<Student> {
    return this.authService.login(this.model.email, this.model.password).then(
      data => {
        const student = localStorage.getItem('currentStudent') as Student;
        return student;
      },
      error => {
        this.alertService.error(error.message);
        return null;
      });
  }

  /**
   * submit post request to register the the new student
   */
  async register() {
    const data = {
      firstName: this.model.firstName,
      lastName: this.model.lastName,
      email: this.model.email,
      password: this.model.password,
    } as UserData;
    const body = JSON.stringify(data);
    let headers = new HttpHeaders();
    headers = headers.append('Content-Type', 'application/json');
    return this.http.post(this.registerPath, body, {headers: headers}).toPromise();
  }

  async registerAndLogin() {

    this.register().then(v => {
      console.log(v);
      return this.login();
    })
      .then(student => {
        if (student) {
          this.alertService.success('successfully registered.');
          setTimeout(() => this.router.navigate(['']), 500);
        }
      });
  }

  isPasswordConfirmed(submitted): boolean {
    if (this.model.password && submitted) {
      return this.model.password === this.model.confirm;
    }
    return !submitted;
  }
}
