name := "Tracking Logs Analyzer"

version := "1.0"

scalaVersion := "2.11.0-M8"

resolvers ++= Seq(
    "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
  )

// http://stackoverflow.com/questions/13582995/why-does-sbt-give-object-scalacheck-is-not-a-member-of-package-org-after-succe
libraryDependencies ++= Seq(
    "org.scalacheck" %% "scalacheck" % "1.11.3"  //% "test"
  )


