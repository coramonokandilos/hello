name := "redmineApp"

version := "1.0"

scalaVersion := "2.9.0-1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
"junit" % "junit" % "4.8" % "test",
"com.novocode" % "junit-interface" % "0.10-M2" % "test",
"org.slf4j" % "slf4j-api" % "1.6.4",
"ch.qos.logback" % "logback-classic" % "0.9.26",
"org.apache.velocity" % "velocity" % "1.6.2",
"se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.1.2",
"com.github.scala-incubator.io" % "scala-io-core_2.9.2" % "0.4.1",
"com.github.scala-incubator.io" % "scala-io-file_2.9.2" % "0.4.1",
"net.databinder" %% "dispatch-http" % "0.8.8",
"javax.mail" % "mail" % "1.4.1",
"org.tmatesoft.svnkit" % "svnkit" % "1.7.11"
)

// "test" is test->compile
