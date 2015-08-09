import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

name := "mqtt-loadtest"

version := "0.1-SNAPSHOT"

organization := "io.m2m.mqtt"

scalaVersion := "2.11.7"

scalacOptions += "-deprecation"

resolvers ++= Seq(
	"Maven Repository" at "http://repo1.maven.org/maven2/",
	"Typsafe" at "http://repo.typesafe.com/typesafe/releases",
	"sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases",
	"Eclipse" at "https://repo.eclipse.org/content/repositories/paho-releases/",
	"scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"
)

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % "2.3.12",
        "com.typesafe.akka" %% "akka-remote" % "2.3.12",
	"com.typesafe" % "config" % "1.3.0",
	"org.scala-lang" % "scala-reflect" % "2.11.7",
	"org.joda" % "joda-convert" % "1.7",
	"joda-time" % "joda-time" % "2.8.1",
	"org.fusesource.mqtt-client" % "mqtt-client" % "1.10",
	"org.json4s" %% "json4s-native" % "3.2.11",
	"org.scalatest" %% "scalatest" % "3.0.0-SNAP5" % "test",
	"org.mashupbots.socko" %% "socko-webserver" % "0.6.0",
	"net.databinder.dispatch" %% "dispatch-core" % "0.11.3",
	"ch.qos.logback" % "logback-classic" %"1.1.3",
	"org.apache.kafka" %% "kafka" % "0.8.2.1" exclude("com.sun.jdmk", "jmxtools") exclude("com.sun.jmx", "jmxri"),
	"net.sf.xenqtt" % "xenqtt" % "0.9.7"
)

