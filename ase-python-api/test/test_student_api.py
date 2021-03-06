# coding: utf-8

"""
    ASE Attendance API

    An API for keeping track of your contacts and the companies they work for.   Don't forget to take it for a spin by clicking on the **Try in Client** button next to each operation! All read operations are public and don't require authentication.  <div> <img src='https://thecontactsapi.apispark.net/v1/img/cropped-contact-img.png' width='90%'> <div>  <!-- ![](https://thecontactsapi.apispark.net/v1/img/cropped-contact-img.png) -->  

    OpenAPI spec version: 1.2.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.student_api import StudentApi


class TestStudentApi(unittest.TestCase):
    """ StudentApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.student_api.StudentApi()

    def tearDown(self):
        pass

    def test_groups_groupid_students_get(self):
        """
        Test case for groups_groupid_students_get

        Get the users in a group
        """
        pass

    def test_groups_groupid_students_post(self):
        """
        Test case for groups_groupid_students_post

        Add a student to the group
        """
        pass

    def test_groups_groupid_students_studentid_delete(self):
        """
        Test case for groups_groupid_students_studentid_delete

        Delete a user from the group
        """
        pass

    def test_groups_groupid_students_studentid_get(self):
        """
        Test case for groups_groupid_students_studentid_get

        Get an individual user from the group
        """
        pass

    def test_student_auth_post(self):
        """
        Test case for student_auth_post

        logs the student into the system
        """
        pass


if __name__ == '__main__':
    unittest.main()
