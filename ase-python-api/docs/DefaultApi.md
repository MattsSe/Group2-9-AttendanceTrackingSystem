# swagger_client.DefaultApi

All URIs are relative to *https://ase-2017-group-2-9-attendance.restlet.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groups_students_get**](DefaultApi.md#groups_students_get) | **GET** /groups/students | Get registered users in any groups
[**records_attendanceid_delete**](DefaultApi.md#records_attendanceid_delete) | **DELETE** /records/{attendanceid}/ | Remove a specific attendane record
[**records_groups_group_id_get**](DefaultApi.md#records_groups_group_id_get) | **GET** /records/groups/{groupId} | Get All records of a group
[**records_qr_student_id_get**](DefaultApi.md#records_qr_student_id_get) | **GET** /records/qr/{studentId}/ | Get a personalized qr code as base64 string
[**records_students_student_id_get**](DefaultApi.md#records_students_student_id_get) | **GET** /records/students/{studentId} | Get all records for a student
[**student_logout_delete**](DefaultApi.md#student_logout_delete) | **DELETE** /student/logout | Logs out the current logged in student session
[**student_register_post**](DefaultApi.md#student_register_post) | **POST** /student/register | Register a new Student
[**student_register_put**](DefaultApi.md#student_register_put) | **PUT** /student/register | Update a Student
[**student_studentid_qr_get**](DefaultApi.md#student_studentid_qr_get) | **GET** /student/{studentid}/qr | Get the student QR Code


# **groups_students_get**
> list[Student] groups_students_get(size=size, page=page, sort=sort, x_page_count=x_page_count, x_page_number=x_page_number, x_page_size=x_page_size, x_total_count=x_total_count)

Get registered users in any groups

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
size = 56 # int | Size of the page to retrieve. (optional)
page = 56 # int | Number of the page to retrieve. (optional)
sort = 'firstname DESC' # str | Order in which to retrieve the results. Multiple sort criteria can be passed. (optional)
x_page_count = 1 # int |  (optional)
x_page_number = 56 # int | 1 (optional)
x_page_size = '25' # str |  (optional)
x_total_count = 2 # int |  (optional)

try: 
    # Get registered users in any groups
    api_response = api_instance.groups_students_get(size=size, page=page, sort=sort, x_page_count=x_page_count, x_page_number=x_page_number, x_page_size=x_page_size, x_total_count=x_total_count)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->groups_students_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **int**| Size of the page to retrieve. | [optional] 
 **page** | **int**| Number of the page to retrieve. | [optional] 
 **sort** | **str**| Order in which to retrieve the results. Multiple sort criteria can be passed. | [optional] 
 **x_page_count** | **int**|  | [optional] 
 **x_page_number** | **int**| 1 | [optional] 
 **x_page_size** | **str**|  | [optional] 
 **x_total_count** | **int**|  | [optional] 

### Return type

[**list[Student]**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **records_attendanceid_delete**
> records_attendanceid_delete(attendanceid)

Remove a specific attendane record

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: HTTP_BASIC
swagger_client.configuration.username = 'YOUR_USERNAME'
swagger_client.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
attendanceid = 'attendanceid_example' # str | 

try: 
    # Remove a specific attendane record
    api_instance.records_attendanceid_delete(attendanceid)
except ApiException as e:
    print("Exception when calling DefaultApi->records_attendanceid_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attendanceid** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **records_groups_group_id_get**
> list[AttendanceRecord] records_groups_group_id_get(group_id, size=size, pages=pages, sort=sort, filter=filter)

Get All records of a group

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: HTTP_BASIC
swagger_client.configuration.username = 'YOUR_USERNAME'
swagger_client.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
group_id = 'group_id_example' # str | 
size = 56 # int |  (optional)
pages = 56 # int | number of pages (optional)
sort = 'week ASC' # str | Sort by attribute (optional)
filter = 'weekId=value' # str | Filter by attribute (optional)

try: 
    # Get All records of a group
    api_response = api_instance.records_groups_group_id_get(group_id, size=size, pages=pages, sort=sort, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->records_groups_group_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**|  | 
 **size** | **int**|  | [optional] 
 **pages** | **int**| number of pages | [optional] 
 **sort** | **str**| Sort by attribute | [optional] 
 **filter** | **str**| Filter by attribute | [optional] 

### Return type

[**list[AttendanceRecord]**](AttendanceRecord.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **records_qr_student_id_get**
> QrCode records_qr_student_id_get(student_id, width=width, height=height, size=size)

Get a personalized qr code as base64 string

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: HTTP_BASIC
swagger_client.configuration.username = 'YOUR_USERNAME'
swagger_client.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
student_id = 'student_id_example' # str | 
width = 56 # int | the desired with in pixels (optional)
height = 56 # int | the desired with in pixels (optional)
size = 'size_example' # str | (width/height) (optional)

try: 
    # Get a personalized qr code as base64 string
    api_response = api_instance.records_qr_student_id_get(student_id, width=width, height=height, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->records_qr_student_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student_id** | **str**|  | 
 **width** | **int**| the desired with in pixels | [optional] 
 **height** | **int**| the desired with in pixels | [optional] 
 **size** | **str**| (width/height) | [optional] 

### Return type

[**QrCode**](QrCode.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **records_students_student_id_get**
> list[AttendanceRecord] records_students_student_id_get(student_id, size=size, sort=sort, filter=filter)

Get all records for a student

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: HTTP_BASIC
swagger_client.configuration.username = 'YOUR_USERNAME'
swagger_client.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
student_id = 'student_id_example' # str | 
size = 56 # int | max elements (optional)
sort = weekId ASC # int | Sort by atrribute (optional)
filter = 'weekId = value' # str | filter by attribute value (optional)

try: 
    # Get all records for a student
    api_response = api_instance.records_students_student_id_get(student_id, size=size, sort=sort, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->records_students_student_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student_id** | **str**|  | 
 **size** | **int**| max elements | [optional] 
 **sort** | **int**| Sort by atrribute | [optional] 
 **filter** | **str**| filter by attribute value | [optional] 

### Return type

[**list[AttendanceRecord]**](AttendanceRecord.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **student_logout_delete**
> student_logout_delete()

Logs out the current logged in student session

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: HTTP_BASIC
swagger_client.configuration.username = 'YOUR_USERNAME'
swagger_client.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()

try: 
    # Logs out the current logged in student session
    api_instance.student_logout_delete()
except ApiException as e:
    print("Exception when calling DefaultApi->student_logout_delete: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **student_register_post**
> Student student_register_post(body)

Register a new Student

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
body = swagger_client.UserData() # UserData | 

try: 
    # Register a new Student
    api_response = api_instance.student_register_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->student_register_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserData**](UserData.md)|  | 

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **student_register_put**
> Student student_register_put(body)

Update a Student

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: HTTP_BASIC
swagger_client.configuration.username = 'YOUR_USERNAME'
swagger_client.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
body = swagger_client.Student() # Student | 

try: 
    # Update a Student
    api_response = api_instance.student_register_put(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->student_register_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Student**](Student.md)|  | 

### Return type

[**Student**](Student.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **student_studentid_qr_get**
> QrCode student_studentid_qr_get(studentid)

Get the student QR Code

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: HTTP_BASIC
swagger_client.configuration.username = 'YOUR_USERNAME'
swagger_client.configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
studentid = 'studentid_example' # str | 

try: 
    # Get the student QR Code
    api_response = api_instance.student_studentid_qr_get(studentid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->student_studentid_qr_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentid** | **str**|  | 

### Return type

[**QrCode**](QrCode.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

