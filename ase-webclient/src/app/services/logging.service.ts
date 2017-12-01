import {Injectable} from '@angular/core';
import {Subject} from 'rxjs/Subject';
import {Observable} from 'rxjs/Observable';
import {environment} from '../../environments/environment';

@Injectable()
export class LoggingService {
  private message = new Subject<string>();

  constructor() {
  }

  log(...args: any[]) {
    this.message.next(args.join(' '));
    if (!environment.production) {
      console.log(args.join(' '));
    }
  }

  messageObservable(): Observable<string> {
    return this.message.asObservable();
  }
}
