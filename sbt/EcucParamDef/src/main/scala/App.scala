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
        println("App Start")
		val resource = Path("EcucParamDef.log")
		resource.write("########\n")
    	val ecucParamDefPath="src/main/resources/R4.0/AUTOSAR_MOD_ECUConfigurationParameters.arxml"
    	//val ecucParamDefPath="src/main/resources/AUTOSAR_EcucParamDef.arxml"
		//val resource = Resource.fromFile("EcucParamDef.log")
        val xml= parseXml(ecucParamDefPath)
		//(new EcucParamParse(resource)).parseParamDef(xml)
		(new EcucParamParseR40(resource)).parseParamDef(xml)
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
