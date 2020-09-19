name := "reflection"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  "org.json4s" %% "json4s-jackson" % "3.5.2",
  "org.rogach" %% "scallop" % "3.1.0",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
)
