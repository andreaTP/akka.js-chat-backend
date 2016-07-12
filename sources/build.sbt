enablePlugins(ScalaJSPlugin)

name := "akka.js_chat_backend"

organization := "eu.unicredit"

scalaVersion  := "2.11.8"

scalacOptions := Seq("-feature", "-language:_", "-deprecation")

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "eu.unicredit" %%% "akkajsactor" % "0.1.2-SNAPSHOT"

scalaJSStage := FastOptStage

scalaJSUseRhino := false

scalaJSOutputWrapper := ("global.require = require;","""((typeof global === "object" && global && global["Object"] === Object) ? global : this)["eu"]["unicredit"]["Main"]().main();""")
