import { Component, OnInit } from '@angular/core';

import { Student } from '../model/index';
import { StudentService } from '../services/index';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  currentStudent: Student;

  constructor(private userService: StudentService) {
    this.currentStudent = JSON.parse(localStorage.getItem('currentStudent'));
  }

  ngOnInit() {
    this.loadAllUsers();
  }

  deleteUser(_id: string) {
    // this.userService.delete(_id).subscribe(() => { this.loadAllUsers() });
  }

  private loadAllUsers() {
    // this.userService.getAll().subscribe(users => { this.users = users; });
  }
}
