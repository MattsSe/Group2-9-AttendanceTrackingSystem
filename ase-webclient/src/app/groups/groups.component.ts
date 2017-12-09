import {Component, OnInit} from '@angular/core';
import {Group, Student} from '../model';
import {AuthenticationService, LoggingService} from '../services';
import {GroupsService} from '../services/groups.service';

@Component({
  selector: 'app-groups',
  templateUrl: './groups.component.html',
  styleUrls: ['./groups.component.scss']
})
export class GroupsComponent implements OnInit {

  groups: Group[];
  student: Student;

  constructor(private log: LoggingService, private groupsService: GroupsService,
              private authService: AuthenticationService) {
  }

  ngOnInit() {
    this.student = this.authService.currentStudent();
    this.groupsService.groupsGet().then(v => this.groups = v);
  }

  isRegistered(group: Group): boolean {
    return group.students.includes(this.student.id);
  }
}
