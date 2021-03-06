/**
 * Created by Matthias on 30.11.17.
 */
import {Injectable} from '@angular/core';
import {
  HttpBackend, HttpXhrBackend, HttpHandler, HttpRequest, HttpResponse, HttpClient, HttpHeaders,
  HttpParams
} from '@angular/common/http';
import {environment} from '../../environments/environment';

import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';

@Injectable()
export class CustomHttp extends HttpClient {
  constructor(handler: HttpHandler) {
    super(handler);
  }

  // post(url: string, body: any | null, options?: {
  //   headers?: HttpHeaders | {
  //     [header: string]: string | string[];
  //   };
  //   observe?: 'body';
  //   params?: HttpParams | {
  //     [param: string]: string | string[];
  //   };
  //   reportProgress?: boolean;
  //   responseType?: 'json';
  //   withCredentials?: boolean;
  // }): Observable<Object>{
  //   return super.post(url, body, options);
  // }

  // get(url: string, options?: RequestOptionsArgs): Observable<Response> {
  //   return super.get(appConfig.apiUrl + url, this.addJwt(options)).catch(this.handleError);
  // }
  //
  // post(url: string, body: string, options?: RequestOptionsArgs): Observable<Response> {
  //   return super.post(appConfig.apiUrl + url, body, this.addJwt(options)).catch(this.handleError);
  // }
  //
  // put(url: string, body: string, options?: RequestOptionsArgs): Observable<Response> {
  //   return super.put(appConfig.apiUrl + url, body, this.addJwt(options)).catch(this.handleError);
  // }
  //
  // delete(url: string, options?: RequestOptionsArgs): Observable<Response> {
  //   return super.delete(appConfig.apiUrl + url, this.addJwt(options)).catch(this.handleError);
  // }

  // private helper methods

  // private addJwt(options?: RequestOptionsArgs): RequestOptionsArgs {
  //   // ensure request options and headers are not null
  //   options = options || new RequestOptions();
  //   options.headers = options.headers || new Headers();
  //
  //   // add authorization header with jwt token
  //   const currentStudent = JSON.parse(localStorage.getItem('currentStudent'));
  //   if (currentStudent && currentStudent.token) {
  //     options.headers.append('Authorization', 'Bearer ' + currentStudent.token);
  //   }
  //
  //   return options;
  // }

  private handleError(error: any) {
    if (error.status === 401) {
      // 401 unauthorized response so log user out of client
      window.location.href = '/login';
    }

    return Observable.throw(error._body);
  }
}

export function customHttpFactory(handler: HttpHandler): HttpClient {
  return new CustomHttp(handler);
}

export let customHttpProvider = {
  provide: HttpClient,
  useFactory: customHttpFactory,
  deps: [HttpHandler]
};
