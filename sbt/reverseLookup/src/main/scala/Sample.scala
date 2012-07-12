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

object Sample extends Application{
	val sample = (new VelocitySample())
	sample.doSample()
/*
	sample.doProcSample()
*/

	(new DiskChecker()).check()
/*
	val mail = new MailTransfer()
	mail.sendMail("","","","")
*/

}
