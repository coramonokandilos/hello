package test.scala

import org.junit._
import Assert._
import dispatch._
import scala.xml._
import main.scala._


class RedmineApiTest {
	@Test
	def testRedmine(){
		val urlPath= "http://www.redmine.org/projects/redmine/issues.xml?assigned_to_id=1"
		val api = new RedmineApi(urlPath)
		val result=api.getRestData
	
	}

}


