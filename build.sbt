name := "reflection"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
)
