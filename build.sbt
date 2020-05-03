ThisBuild / scalaVersion := "2.12.10"
ThisBuild / organization := "cc.estoff"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )
