import sbt._

object Dependencies {
  lazy val specs2Core = "org.specs2" %% "specs2-core" % specs2Version
  lazy val specs2Scalacheck = "org.specs2" %% "specs2-scalacheck" % specs2Version
  lazy val scalacheck = "org.scalacheck" %% "scalacheck" % scalacheckVersion

  val specs2Version = "$specs2_version$"
  val scalacheckVersion = "$scalacheck_version$"
  val kindProjectorVersion = "0.9.7"
}
