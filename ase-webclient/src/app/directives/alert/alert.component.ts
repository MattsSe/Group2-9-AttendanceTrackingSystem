/**
 * Created by Matthias on 30.11.17.
 */
import { Component, OnInit } from '@angular/core';

import { AlertService } from '../../services/index';

@Component({
  moduleId: module.id,
  // tslint:disable-next-line
  selector: 'alert',
  templateUrl: 'alert.component.html'
})

export class AlertComponent implements  OnInit {
  message: any;

  constructor(private alertService: AlertService) { }

  ngOnInit() {
    this.alertService.getMessage().subscribe(message => { this.message = message; });
  }
}
