import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders, HttpResponse} from '@angular/common/http';

import {Student} from '../models/index';

@Injectable()
export class StudentService {

  constructor(private http: HttpClient) { }

}
