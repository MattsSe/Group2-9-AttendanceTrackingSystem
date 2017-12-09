import {Injectable} from '@angular/core';
import {appConfig} from '../app.config';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import 'rxjs/add/operator/map';
import {LoggingService} from './logging.service';
import {Group} from '../model';

@Injectable()
export class GroupsService {

  basePath = appConfig.apiUrl;
  defaultHeaders: HttpHeaders = new HttpHeaders();

  constructor(private http: HttpClient, private log: LoggingService) {
  }

  /**
   * Loads a list of Groups
   * @summary Get the list of Groups
   * @param $Size Size of the page to retrieve.
   * @param $Page Number of the page to retrieve.
   * @param $Sort Order in which to retrieve the results. Multiple sort criteria can be passed.
   * @param free Allows to filter the collections of groups whether they are free
   */
  public async groupsGet($Size?: number, $Page?: number, $Sort?: string, free?: boolean, extraHttpRequestParams?: any): Promise<Array<Group>> {
    return await this.groupsGetWithHttpInfo($Size, $Page, $Sort, free, extraHttpRequestParams).then(v => v as Array<Group>);
  }


  /**
   * Get the list of Groups
   * Loads a list of Groups
   * @param $Size Size of the page to retrieve.
   * @param $Page Number of the page to retrieve.
   * @param $Sort Order in which to retrieve the results. Multiple sort criteria can be passed.
   * @param free Allows to filter the collections of groups whether they are free
   */
  public async groupsGetWithHttpInfo($Size?: number, $Page?: number, $Sort?: string, free?: boolean, extraHttpRequestParams?: any): Promise<Object> {
    const path = this.basePath + '/groups/';

    const queryParameters = new HttpParams();
    const headers = new HttpHeaders();
    if ($Size !== undefined) {
      queryParameters.set('$size', <any>$Size);
    }

    if ($Page !== undefined) {
      queryParameters.set('$page', <any>$Page);
    }

    if ($Sort !== undefined) {
      queryParameters.set('$sort', <any>$Sort);
    }

    if (free !== undefined) {
      queryParameters.set('free', <any>free);
    }
    return this.http.get(path, {
      headers: headers,
      params: queryParameters
    }).toPromise();
  }
}
