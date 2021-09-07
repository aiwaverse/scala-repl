val scala3Version = "2.12.14"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-rock-the-jvm",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
