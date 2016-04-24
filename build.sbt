name := "SBTSample"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "2.2.6",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.10",
  "org.slf4j" % "slf4j-log4j12" % "1.7.10",
  //"log4j" % "log4j" % "1.2.17",
  "com.typesafe" % "config" % "1.3.0",


  "joda-time" % "joda-time" % "2.9.3",
  "com.mchange" % "c3p0" % "0.9.5.2"

)