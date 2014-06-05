package main.scala

import dispatch._
import scala.xml._

object RedmineApp extends Application{
  override def main(args:Array[String])={
		val urlPath= "http://www.redmine.org/projects/redmine/issues.xml?assigned_to_id=1"
		val api = new RedmineApi(urlPath)
		val result=api.getRestData

    println(result)
  }
}
object TicketFactory{
	def createData(data:Node):TicketData={
		val subject = (data \\ "subject").text
		val id = (data \\ "id").text
		val author = (data  \\ "author" \ "@name").text
		val authorId = (data  \\ "author" \ "@id").text
		val ticket = TicketData(
			subject		
			,id
			,author
			,authorId
			)
		ticket
	}
}

case class TicketData(subject:String,id:String,author:String,authorId:String)

class RedmineApi(a0:String){
	val urlPath = a0

	def getRestData():Seq[TicketData]={
		val result = getElement
		(result \\ "issue" ).map{ node =>
			TicketFactory.createData(node)
		}
	}	

	def getElement():Elem={
		val h = new Http	
		val contents =h(url(urlPath) as_str)
		XML.loadString(contents)
	}
}
