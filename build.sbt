name := "spotify-converter"

version := "0.1"

scalaVersion := "2.13.3"

// web scraper
libraryDependencies += "org.jsoup" % "jsoup" % "1.13.1"

// config
libraryDependencies += "com.typesafe" % "config" % "1.4.0"

// http requests

// parser
resolvers += "Rally Health" at "https://dl.bintray.com/rallyhealth/maven"
libraryDependencies += "com.rallyhealth" %% "weepickle-v1" % "1.2.0"

libraryDependencies += "dev.zio" %% "zio" % "1.0.0"