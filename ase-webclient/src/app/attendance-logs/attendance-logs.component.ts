import {Component, OnDestroy, OnInit} from '@angular/core';
import {AttendanceRecord, Group, Student} from '../model';
import {ActivatedRoute, Router} from '@angular/router';
import {AuthenticationService} from '../services';

@Component({
  selector: 'app-attendance-logs',
  templateUrl: './attendance-logs.component.html',
  styleUrls: ['./attendance-logs.component.scss']
})
export class AttendanceLogsComponent implements OnInit, OnDestroy {


  groupId: number;
  userId: number;
  title: string;
  private sub: any;
  group: Group;
  attendanceRecords: AttendanceRecord[];
  currentIndex = 1;

  constructor(private route: ActivatedRoute, private router: Router, private auth : AuthenticationService) {
  }

  private addDummyData() {
    this.attendanceRecords = [];

    for (let i = 0; i < 45; i++) {
      this.attendanceRecords.push({
        attendanceId: 'att id' + i,
        studentId: 'student ' + i,
        tutorialGroupId: 'tut ' + i,
        weekId: 'week ' + i,
        presented: i % 4 === 0,
      });
    }
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.groupId = +params['groupId']; // (+) converts string 'id' to a number
      this.userId = +params['userId'];

      if (!this.groupId && !this.userId) {
        const student = this.auth.currentStudent();
        if (student) {
          this.userId = student.id;
        } else {
          this.router.navigate(['/unauthorized']);
        }
      }
      this.title = this.groupId ? `Group ${this.groupId}` : `User ${this.userId}`;

      // TODO
      this.addDummyData();
      // fetch all  logs for this groups

      // In a real app: dispatch action to load the details here.
    });
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }


  itemsPerSite(): number {
    return 20;
  }

  pageItems(): number[] {
    const size = Math.floor(this.attendanceRecords.length / this.itemsPerSite());
    const items = [];
    for (let i = 1; i <= size; i++) {
      items.push(i + 1);
    }
    return items;
  }

  displayItems(index: number) {
    console.log('displayed ' + index);
    this.currentIndex = index;
  }


  getAttendanceRecords() {
    const records = [];
    const start = (this.currentIndex - 1) * this.itemsPerSite();
    for (let i = start; i < start + this.itemsPerSite(); i++) {
      if (i >= this.attendanceRecords.length) {
        break;
      }
      records.push(this.attendanceRecords[i]);
    }
    return records;
  }


}
