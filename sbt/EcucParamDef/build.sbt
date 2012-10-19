name := "EcucParamDef"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
"org.scala-lang" % "scala-swing" % "2.9.1",
"junit" % "junit" % "4.8" % "test",
"org.slf4j" % "slf4j-api" % "1.6.4",
"ch.qos.logback" % "logback-classic" % "0.9.26",
"org.apache.velocity" % "velocity" % "1.6.2",
"se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.1.2",
"com.github.scala-incubator.io" %% "scala-io-core" % "0.4.1-seq",
"com.github.scala-incubator.io" %% "scala-io-file" % "0.4.1-seq"
)
