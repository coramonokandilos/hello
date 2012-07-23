#!/usr/bin/env python
# -*- coding: utf-8 -*-

import threading
import time

class SerialReader(threading.Thread):
	dataList=[]
	def __init__(self):
		threading.Thread.__init__(self)
		self.i = 0
		self.setDaemon(True)
	def run(self):
		print "serial start"
		while True:
			time.sleep(1)
			self.i +=1 
			print "serial reading....."
			self.dataList.append("serial reading..."+str(self.i))

	def getData(self):
		return self.dataList

class CubeSuiteCommand(threading.Thread):
	def __init__(self):
	"""
		_init
	"""
		threading.Thread.__init__(self)
	def run(self):
		for i in range(1,5):
			print self.__class__.__name__
			time.sleep(5)
if __name__ == "__main__":
	cubesuite= CubeSuiteCommand()
	t = SerialReader()
	t.start()
	cubesuite.start()
	cubesuite.join()
	print t.getData()
