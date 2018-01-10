# swagger_client.StudentApi

All URIs are relative to *https://ase-2017-group-2-9-attendance.restlet.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groups_groupid_students_get**](StudentApi.md#groups_groupid_students_get) | **GET** /groups/{groupid}/students | Get the users in a group
[**groups_groupid_students_post**](StudentApi.md#groups_groupid_students_post) | **POST** /groups/{groupid}/students | Add a student to the group
[**groups_groupid_students_studentid_delete**](StudentApi.md#groups_groupid_students_studentid_delete) | **DELETE** /groups/{groupid}/students/{studentid} | Delete a user from the group
[**groups_groupid_students_studentid_get**](StudentApi.md#groups_groupid_students_studentid_get) | **GET** /groups/{groupid}/students/{studentid} | Get an individual user from the group
[**student_auth_post**](StudentApi.md#student_auth_post) | **POST** /student/auth | logs the student into the system


# **groups_groupid_students_get**
> list[Student] groups_groupid_students_get(groupid, sort=sort)

Get the users in a group

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.StudentApi()
groupid = 'groupid_example' # str | 
sort = 'firstname ASC' # str | Order in which to retrieve the results. Multiple sort criteria can be passed (optional)

try: 
    # Get the users in a group
    api_response = api_instance.groups_groupid_students_get(groupid, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StudentApi->groups_groupid_students_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupid** | **str**|  | 
 **sort** | **str**| Order in which to retrieve the results. Multiple sort criteria can be passed | [optional] 

### Return type

[**list[Student]**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_groupid_students_post**
> Student groups_groupid_students_post(groupid, body)

Add a student to the group

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
api_instance = swagger_client.StudentApi()
groupid = 'groupid_example' # str | 
body = swagger_client.Student() # Student | 

try: 
    # Add a student to the group
    api_response = api_instance.groups_groupid_students_post(groupid, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StudentApi->groups_groupid_students_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupid** | **str**|  | 
 **body** | [**Student**](Student.md)|  | 

### Return type

[**Student**](Student.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_groupid_students_studentid_delete**
> groups_groupid_students_studentid_delete(groupid, studentid)

Delete a user from the group

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
api_instance = swagger_client.StudentApi()
groupid = 'groupid_example' # str | 
studentid = 'studentid_example' # str | 

try: 
    # Delete a user from the group
    api_instance.groups_groupid_students_studentid_delete(groupid, studentid)
except ApiException as e:
    print("Exception when calling StudentApi->groups_groupid_students_studentid_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupid** | **str**|  | 
 **studentid** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_groupid_students_studentid_get**
> Student groups_groupid_students_studentid_get(groupid, studentid)

Get an individual user from the group

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.StudentApi()
groupid = 'groupid_example' # str | 
studentid = 'studentid_example' # str | 

try: 
    # Get an individual user from the group
    api_response = api_instance.groups_groupid_students_studentid_get(groupid, studentid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StudentApi->groups_groupid_students_studentid_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupid** | **str**|  | 
 **studentid** | **str**|  | 

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **student_auth_post**
> Student student_auth_post()

logs the student into the system

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
api_instance = swagger_client.StudentApi()

try: 
    # logs the student into the system
    api_response = api_instance.student_auth_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StudentApi->student_auth_post: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Student**](Student.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

