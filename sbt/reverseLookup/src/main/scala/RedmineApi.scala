package main.scala

import dispatch._
import scala.xml._


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
