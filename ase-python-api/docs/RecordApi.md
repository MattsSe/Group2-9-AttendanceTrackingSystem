# swagger_client.RecordApi

All URIs are relative to *https://ase-2017-group-2-9-attendance.restlet.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**records_attendanceid_get**](RecordApi.md#records_attendanceid_get) | **GET** /records/{attendanceid}/ | Get specific attendance record
[**records_attendanceid_put**](RecordApi.md#records_attendanceid_put) | **PUT** /records/{attendanceid}/ | Update a attendance record
[**records_get**](RecordApi.md#records_get) | **GET** /records/ | Get Attendance records
[**records_post**](RecordApi.md#records_post) | **POST** /records/ | Add Attendance Record


# **records_attendanceid_get**
> AttendanceRecord records_attendanceid_get(attendanceid)

Get specific attendance record

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
api_instance = swagger_client.RecordApi()
attendanceid = 'attendanceid_example' # str | 

try: 
    # Get specific attendance record
    api_response = api_instance.records_attendanceid_get(attendanceid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecordApi->records_attendanceid_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attendanceid** | **str**|  | 

### Return type

[**AttendanceRecord**](AttendanceRecord.md)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **records_attendanceid_put**
> records_attendanceid_put(attendanceid, body)

Update a attendance record

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
api_instance = swagger_client.RecordApi()
attendanceid = 'attendanceid_example' # str | 
body = swagger_client.AttendanceRecord() # AttendanceRecord | 

try: 
    # Update a attendance record
    api_instance.records_attendanceid_put(attendanceid, body)
except ApiException as e:
    print("Exception when calling RecordApi->records_attendanceid_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attendanceid** | **str**|  | 
 **body** | [**AttendanceRecord**](AttendanceRecord.md)|  | 

### Return type

void (empty response body)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **records_get**
> list[AttendanceRecord] records_get(size=size, week_id=week_id, sort=sort)

Get Attendance records

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RecordApi()
size = 56 # int | max number to return (optional)
week_id = 56 # int | filter by Week (optional)
sort = 'weekId asc' # str | sort by value (optional)

try: 
    # Get Attendance records
    api_response = api_instance.records_get(size=size, week_id=week_id, sort=sort)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecordApi->records_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **int**| max number to return | [optional] 
 **week_id** | **int**| filter by Week | [optional] 
 **sort** | **str**| sort by value | [optional] 

### Return type

[**list[AttendanceRecord]**](AttendanceRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **records_post**
> records_post(body)

Add Attendance Record

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
api_instance = swagger_client.RecordApi()
body = [swagger_client.AttendanceRecord()] # list[AttendanceRecord] | 

try: 
    # Add Attendance Record
    api_instance.records_post(body)
except ApiException as e:
    print("Exception when calling RecordApi->records_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[AttendanceRecord]**](AttendanceRecord.md)|  | 

### Return type

void (empty response body)

### Authorization

[HTTP_BASIC](../README.md#HTTP_BASIC)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

