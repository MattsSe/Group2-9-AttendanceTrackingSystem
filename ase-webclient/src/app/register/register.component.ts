import {Component, OnInit} from '@angular/core';
import {AlertService, AuthenticationService} from '../services';
import {Student} from '../model';
import {Router} from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  model: any = {};

  constructor(private alertService: AlertService,
              private authService: AuthenticationService,
              private router: Router) {
  }

  ngOnInit() {
  }

  protected login(): Promise<Student> {
    return this.authService.login(this.model.username, this.model.password).then(
      data => {
        const student = localStorage.getItem('currentStudent') as Student;
        return student;
      },
      error => {
        this.alertService.error(error.message);
        return null;
      });
  }

  async register() {

    // submit post request to register the the new student
  }

  async registerAndLogin() {

    this.register().then(v => this.login())
      .then(student => {
        if (student) {
          this.alertService.success('successfully registered.');
          setTimeout(() => this.router.navigate(['']), 200);
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
