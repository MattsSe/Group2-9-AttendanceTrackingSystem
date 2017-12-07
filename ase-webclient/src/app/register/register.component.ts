import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  model: any = {};

  constructor() {
  }

  ngOnInit() {
  }


  register() {
    console.log('registered');
  }

  isPasswordConfirmed(submitted): boolean {
    if (this.model.password && submitted) {
      return this.model.password === this.model.confirm;
    }
    return !submitted;
  }
}
