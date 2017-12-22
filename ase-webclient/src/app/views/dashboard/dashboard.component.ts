import {Component} from '@angular/core';
import {AuthenticationService} from '../../services';
import {Student} from '../../model';

@Component({
  templateUrl: 'dashboard.component.html'
})
export class DashboardComponent {

  student: Student;

  constructor(private authService: AuthenticationService) {
    this.student = this.authService.currentStudent();
  }

}
