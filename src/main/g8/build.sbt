name := "temp"
version := "0.0.0"
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")
scalaVersion := "2.12.8"

scalafmtOnCompile := true
