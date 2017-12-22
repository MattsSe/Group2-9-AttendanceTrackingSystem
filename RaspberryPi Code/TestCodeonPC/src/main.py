#!/usr/bin/env python
#-*- coding: UTF-8 -*-
'''
Hauptprogramm
'''

import qrcode

while (True):
    print "1: Scan Qrcode"
    print "2: exit"
    select=int(raw_input("Please select a choice "))
    if select == 1:
        result=qrcode.read().strip()
        print result
    elif select == 3:
        print "Exiting the program..."
        break
