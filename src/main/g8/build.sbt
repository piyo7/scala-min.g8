name := "temp"
version := "0.0.0"
javacOptions ++= Seq("-source", "11", "-target", "11")
scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")
scalaVersion := "2.12.8"
assemblyJarName := "temp.jar"
scalafmtOnCompile := true

libraryDependencies ++= Seq()
