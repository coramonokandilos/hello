package test.scala

import org.junit._
import Assert._
import main.scala._
import dispatch._

class ScalaHttpTest{
	@Test
	def testHttp(){
		val h = new Http
		val contents = h(url("http://www.scala-lang.org/") as_str)
//		println(contents)
	}
}
	

