ThisBuild / scalaVersion := "2.12.10"
ThisBuild / organization := "cc.estoff"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.9",
    libraryDependencies += "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1",
    libraryDependencies += scalaTest % Test,
  )

lazy val helloCore = (project in file("core"))
  .settings(
    name := "Hello Core",
    libraryDependencies += scalaTest % Test,
  )
