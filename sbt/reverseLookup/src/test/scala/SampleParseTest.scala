package test.scala

import org.junit._
import Assert._
import scala.io.Source


class SampleParseTest {
	@Test
	def sample(){
		val file = "src/test/resources/svn_external.txt"
		var source = Source.fromFile(file)
		source.getLines.foreach(
			t=>{
				dumpData(splitLine(t))
			}
		)
	}
	def dumpData(lines:Array[String])={
		if(lines.size >2){
//			println(lines(2))
		}
	}
	
	def splitLine(line:String):Array[String]={
		val lines = line split "[\\s]+"
		lines	
	}
}

