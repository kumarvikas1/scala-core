name := "scala-core"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

organization := "com.kumarvikas1.core"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.53.0" exclude("com.google.guava", "guava"),
  "com.google.guava" % "guava" % "18.0",
  "org.scalatest" % "scalatest_2.11" % "3.0.1",
  "org.scalacheck" %% "scalacheck" % "1.12.4",
  "org.pegdown" % "pegdown" % "1.1.0",
  "com.relevantcodes" % "extentreports" % "2.41.2"
)