package main.scala

import scala.sys.process._

class DiskChecker extends PerformCheck{
	
	def check()={
		val result = Process("df -k").lines.toList
		//val result = Process("df -k")!! 
		println( result )
		true
	}

}
