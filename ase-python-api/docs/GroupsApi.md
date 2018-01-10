# swagger_client.GroupsApi

All URIs are relative to *https://ase-2017-group-2-9-attendance.restlet.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groups_find_by_student_get**](GroupsApi.md#groups_find_by_student_get) | **GET** /groups/findByStudent | Finds Groups by Student
[**groups_get**](GroupsApi.md#groups_get) | **GET** /groups/ | Get the list of Groups
[**groups_groupid_delete**](GroupsApi.md#groups_groupid_delete) | **DELETE** /groups/{groupid} | Delete a Group
[**groups_groupid_get**](GroupsApi.md#groups_groupid_get) | **GET** /groups/{groupid} | Load an individual Group
[**groups_groupid_put**](GroupsApi.md#groups_groupid_put) | **PUT** /groups/{groupid} | Update a Group
[**groups_groupid_students_get**](GroupsApi.md#groups_groupid_students_get) | **GET** /groups/{groupid}/students | Get the users in a group
[**groups_groupid_students_post**](GroupsApi.md#groups_groupid_students_post) | **POST** /groups/{groupid}/students | Add a student to the group
[**groups_groupid_students_studentid_delete**](GroupsApi.md#groups_groupid_students_studentid_delete) | **DELETE** /groups/{groupid}/students/{studentid} | Delete a user from the group
[**groups_groupid_students_studentid_get**](GroupsApi.md#groups_groupid_students_studentid_get) | **GET** /groups/{groupid}/students/{studentid} | Get an individual user from the group
[**groups_post**](GroupsApi.md#groups_post) | **POST** /groups/ | Create a Group


# **groups_find_by_student_get**
> list[Group] groups_find_by_student_get()

Finds Groups by Student

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupsApi()

try: 
    # Finds Groups by Student
    api_response = api_instance.groups_find_by_student_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_find_by_student_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Group]**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_get**
> list[Group] groups_get(size=size, page=page, sort=sort, free=free)

Get the list of Groups

Loads a list of Groups

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupsApi()
size = 10 # int | Size of the page to retrieve. (optional)
page = 1 # int | Number of the page to retrieve. (optional)
sort = 'name DESC' # str | Order in which to retrieve the results. Multiple sort criteria can be passed. (optional)
free = true # bool | Allows to filter the collections of groups whether they are free (optional)

try: 
    # Get the list of Groups
    api_response = api_instance.groups_get(size=size, page=page, sort=sort, free=free)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **int**| Size of the page to retrieve. | [optional] 
 **page** | **int**| Number of the page to retrieve. | [optional] 
 **sort** | **str**| Order in which to retrieve the results. Multiple sort criteria can be passed. | [optional] 
 **free** | **bool**| Allows to filter the collections of groups whether they are free | [optional] 

### Return type

[**list[Group]**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_groupid_delete**
> groups_groupid_delete(groupid)

Delete a Group

Deletes a Group

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
api_instance = swagger_client.GroupsApi()
groupid = '0e8dd830-ad98-11e6-bf2e-47644ada7c0f' # str | Identifier of the Contact

try: 
    # Delete a Group
    api_instance.groups_groupid_delete(groupid)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_groupid_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupid** | **str**| Identifier of the Contact | 

### Return type

void (empty response body)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_groupid_get**
> Group groups_groupid_get(groupid)

Load an individual Group

Loads a Group

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupsApi()
groupid = '0e8dd830-ad98-11e6-bf2e-47644ada7c0f' # str | Identifier of the Contact

try: 
    # Load an individual Group
    api_response = api_instance.groups_groupid_get(groupid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_groupid_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupid** | **str**| Identifier of the Contact | 

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_groupid_put**
> Group groups_groupid_put(groupid, body)

Update a Group

Stores a Group

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
api_instance = swagger_client.GroupsApi()
groupid = '0e8dd830-ad98-11e6-bf2e-47644ada7c0f' # str | Identifier of the Contact
body = swagger_client.Group() # Group | 

try: 
    # Update a Group
    api_response = api_instance.groups_groupid_put(groupid, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_groupid_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupid** | **str**| Identifier of the Contact | 
 **body** | [**Group**](Group.md)|  | 

### Return type

[**Group**](Group.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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
api_instance = swagger_client.GroupsApi()
groupid = 'groupid_example' # str | 
sort = 'firstname ASC' # str | Order in which to retrieve the results. Multiple sort criteria can be passed (optional)

try: 
    # Get the users in a group
    api_response = api_instance.groups_groupid_students_get(groupid, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_groupid_students_get: %s\n" % e)
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
api_instance = swagger_client.GroupsApi()
groupid = 'groupid_example' # str | 
body = swagger_client.Student() # Student | 

try: 
    # Add a student to the group
    api_response = api_instance.groups_groupid_students_post(groupid, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_groupid_students_post: %s\n" % e)
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
api_instance = swagger_client.GroupsApi()
groupid = 'groupid_example' # str | 
studentid = 'studentid_example' # str | 

try: 
    # Delete a user from the group
    api_instance.groups_groupid_students_studentid_delete(groupid, studentid)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_groupid_students_studentid_delete: %s\n" % e)
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
api_instance = swagger_client.GroupsApi()
groupid = 'groupid_example' # str | 
studentid = 'studentid_example' # str | 

try: 
    # Get an individual user from the group
    api_response = api_instance.groups_groupid_students_studentid_get(groupid, studentid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_groupid_students_studentid_get: %s\n" % e)
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

# **groups_post**
> Group groups_post(body)

Create a Group

Adds a Contact

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
api_instance = swagger_client.GroupsApi()
body = swagger_client.Group() # Group | 

try: 
    # Create a Group
    api_response = api_instance.groups_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->groups_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)|  | 

### Return type

[**Group**](Group.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

