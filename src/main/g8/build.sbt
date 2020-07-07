name := "temp"
version := "0.0.0"
javacOptions ++= Seq("-source", "14", "-target", "14")
scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")
scalaVersion := "2.13.3"
assemblyJarName := "temp.jar"
scalafmtOnCompile := true

libraryDependencies ++= Seq()
