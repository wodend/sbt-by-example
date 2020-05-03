ThisBuild / scalaVersion := "2.12.10"
ThisBuild / organization := "cc.estoff"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
val gigahorse = "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1"
val playJson  = "com.typesafe.play" %% "play-json" % "2.6.9"

lazy val sbtByExample = (project in file("."))
  .aggregate(sbtByExampleCore)
  .dependsOn(sbtByExampleCore)
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "sbt by example",
    libraryDependencies += scalaTest % Test,
  )

lazy val sbtByExampleCore = (project in file("core"))
  .settings(
    name := "sbt by example core",
    libraryDependencies ++= Seq(gigahorse, playJson),
    libraryDependencies += scalaTest % Test,
  )
