#!/usr/bin/env python
#-*- coding: UTF-8 -*-
'''
creates and reads QR-Codes
'''
import os, signal, subprocess

    
def read():
    zbarcam=subprocess.Popen("zbarcam --raw --nodisplay /dev/video0", stdout=subprocess.PIPE, shell=True, preexec_fn=os.setsid)
    print "zbarcam has successfully started..."
    
    while True:
        qrcodetext=zbarcam.stdout.readline()
        if qrcodetext!="":
            print "success"
            break
        
    os.killpg(zbarcam.pid, signal.SIGTERM)  # stop the process
    print "zbarcam has successfully stopped"
    return qrcodetext
