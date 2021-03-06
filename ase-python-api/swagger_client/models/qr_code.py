# coding: utf-8

"""
    ASE Attendance API

    An API for keeping track of your contacts and the companies they work for.   Don't forget to take it for a spin by clicking on the **Try in Client** button next to each operation! All read operations are public and don't require authentication.  <div> <img src='https://thecontactsapi.apispark.net/v1/img/cropped-contact-img.png' width='90%'> <div>  <!-- ![](https://thecontactsapi.apispark.net/v1/img/cropped-contact-img.png) -->  

    OpenAPI spec version: 1.2.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class QrCode(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """


    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'content': 'str'
    }

    attribute_map = {
        'content': 'content'
    }

    def __init__(self, content=None):
        """
        QrCode - a model defined in Swagger
        """

        self._content = None

        if content is not None:
          self.content = content

    @property
    def content(self):
        """
        Gets the content of this QrCode.

        :return: The content of this QrCode.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this QrCode.

        :param content: The content of this QrCode.
        :type: str
        """

        self._content = content

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, QrCode):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
