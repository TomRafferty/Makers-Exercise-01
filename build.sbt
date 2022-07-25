version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test

lazy val root = (project in file("."))
  .settings(
    name := "MakersExercise01"
  )
