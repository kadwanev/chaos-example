name := "chaos-example"

version := "0.1"

scalaVersion := "2.10.2"

mainClass in (Compile, run) := Some("Main")

resolvers += "Mesosphere Public Repo" at "http://downloads.mesosphere.io/maven"

libraryDependencies ++= Seq(
  "mesosphere" % "chaos" % "0.5.2",
  "com.sun.jersey" % "jersey-bundle" % "1.17.1"
)

net.virtualvoid.sbt.graph.Plugin.graphSettings
