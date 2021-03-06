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


class Error(object):
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
        'code': 'int',
        'description': 'str',
        'reason_phrase': 'str'
    }

    attribute_map = {
        'code': 'code',
        'description': 'description',
        'reason_phrase': 'reasonPhrase'
    }

    def __init__(self, code=None, description=None, reason_phrase=None):
        """
        Error - a model defined in Swagger
        """

        self._code = None
        self._description = None
        self._reason_phrase = None

        self.code = code
        if description is not None:
          self.description = description
        if reason_phrase is not None:
          self.reason_phrase = reason_phrase

    @property
    def code(self):
        """
        Gets the code of this Error.

        :return: The code of this Error.
        :rtype: int
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this Error.

        :param code: The code of this Error.
        :type: int
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")
        if code is not None and code > 599:
            raise ValueError("Invalid value for `code`, must be a value less than or equal to `599`")
        if code is not None and code < 400:
            raise ValueError("Invalid value for `code`, must be a value greater than or equal to `400`")

        self._code = code

    @property
    def description(self):
        """
        Gets the description of this Error.

        :return: The description of this Error.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Error.

        :param description: The description of this Error.
        :type: str
        """

        self._description = description

    @property
    def reason_phrase(self):
        """
        Gets the reason_phrase of this Error.

        :return: The reason_phrase of this Error.
        :rtype: str
        """
        return self._reason_phrase

    @reason_phrase.setter
    def reason_phrase(self, reason_phrase):
        """
        Sets the reason_phrase of this Error.

        :param reason_phrase: The reason_phrase of this Error.
        :type: str
        """

        self._reason_phrase = reason_phrase

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
        if not isinstance(other, Error):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
