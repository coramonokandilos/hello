package main.scala
import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.VelocityContext;
import java.io.StringWriter;
import java.lang.Exception;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.MethodInvocationException;
import java.io.File;
import scala.sys.process._

class VelocitySample{
	def doProcSample()={
		println("Process Command");
		Process("ls") run;  
		Process("ls -la")#> new java.io.File("ls_result.txt") run
	}

	def doSample()={
	  try{
	    val filename = "src/main/resources/order.vm"
	  Velocity.init();
	  var context = new VelocityContext();
	  context.put("visitor","kazuhiro shibuya");
	    val file = new File(filename);
	    println(file.getAbsolutePath());
 	  var template = Velocity.getTemplate(filename, "EUC-JP");
	  val sw = new StringWriter();
	  template.merge(context,sw);
	  System.out.println(sw.toString());
	  sw.flush();
	}catch{
	  case e: ResourceNotFoundException => println(e);
	     case  _ => 
	}
		
	}
}
