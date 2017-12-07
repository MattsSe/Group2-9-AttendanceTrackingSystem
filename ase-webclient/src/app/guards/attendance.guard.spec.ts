import { TestBed, async, inject } from '@angular/core/testing';

import { AttendanceGuard } from './attendance.guard';

describe('AttendanceGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AttendanceGuard]
    });
  });

  it('should ...', inject([AttendanceGuard], (guard: AttendanceGuard) => {
    expect(guard).toBeTruthy();
  }));
});
