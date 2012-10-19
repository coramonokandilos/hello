package main.scala

import scala.xml.XML
import scala.xml.Node
import scalax.file.Path
import scalax.io.Resource


/** */

object App extends Application{

	/** execute */
    run

    /** */
    def run:Unit={
    	val ecucParamDefPath="src/main/resources/AUTOSAR_EcucParamDef.arxml"
		val resource = Path("EcucParamDef.log")
		//val resource = Resource.fromFile("EcucParamDef.log")
		resource.write("########\n")
        println("App Start")
        val xml= parseXml(ecucParamDefPath)
        for (bs <- xml \\ "MODULE-DEF" ){
            for( <SHORT-NAME>{h}</SHORT-NAME> <- bs.child  )
            {
				(new EcucParamParse(resource)).parseModule(bs,0)
            }
      }
        println("App End")
    }

	/** */
    def parseXml(path:String)={
        import java.io.File
        val f = new File(path)
        val xml = XML.loadFile(f)
        xml
    }
}
