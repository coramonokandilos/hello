package main.scala

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane



class LoginDemo extends Application{
	override def start(stage:Stage)={
		stage.setTitle("Login Demo")
		val root = FXMLLoader.load(getClass().getResource("src/main/scala/LoginForm.fxml"))
		val scene = new Scene(root)
		stage.setScene(scene)
		stage.show
	}
}


object LoginDemo{
  def main(args: Array[String]) = Application.launch(classOf[LoginDemo], args:_*)
}
