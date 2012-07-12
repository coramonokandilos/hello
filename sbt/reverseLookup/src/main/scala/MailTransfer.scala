package main.scala
import java.util.Properties
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 



class MailTransfer{
	def sendMail(from:String,to:String,title:String,body:String)={
		val prop:Properties = new Properties();
		val smtpServer = "localhost"
		prop.put("mail.smtp.host",smtpServer)
		prop.put("mail.host",smtpServer)	
		val session:Session = Session.getDefaultInstance(prop,null)
		val msg:MimeMessage = new MimeMessage(session);
		msg.setRecipients(Message.RecipientType.TO,to);
		val fromAddr:InternetAddress  = new InternetAddress(from,from);
		msg.setFrom(fromAddr)
		msg.setSubject("HelloWorld","ISO-2022-JP")
		msg.setText("HelloWorld","ISO-2022-JP")
		Transport.send(msg)
	}
}

