import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders, HttpResponse} from '@angular/common/http';

import {Student} from '../model/index';

@Injectable()
export class StudentService {

  constructor(private http: HttpClient) { }

}
