enablePlugins(ScalaJSPlugin)

name := "akka.js_chat_backend"

organization := "eu.unicredit"

scalaVersion  := "2.11.8"

scalacOptions := Seq("-feature", "-language:_", "-deprecation")

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "eu.unicredit" %%% "akkajsactor" % "0.1.2-SNAPSHOT"

scalaJSStage in Global := FastOptStage

scalaJSUseRhino in Global := false

scalaJSOutputWrapper := ("global.require = require;","eu.unicredit.Main.main();")
