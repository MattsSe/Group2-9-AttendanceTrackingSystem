/**
 * ASE Attendance API
 * An API for keeping track of your contacts and the companies they work for.   Don't forget to take it for a spin by clicking on the **Try in Client** button next to each operation! All read operations are public and don't require authentication.  <div> <img src='https://thecontactsapi.apispark.net/v1/img/cropped-contact-img.png' width='90%'> <div>  <!-- ![](https://thecontactsapi.apispark.net/v1/img/cropped-contact-img.png) -->
 *
 * OpenAPI spec version: 1.2.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import * as models from './index';

export interface Student {
    /**
     * The first name of the student
     */
    firstName?: string;

    /**
     * The last name of the student
     */
    lastName?: string;

    /**
     * The user's email account
     */
    email?: string;

    /**
     * The Id of the user
     */
    id?: string;

}
