import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT",
      organizationName := "$organizationName$",
      startYear := Some($startYear$),
      licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))
    )),
    name := "$name;format="norm"$",
    libraryDependencies ++= Seq(
      specs2Core % Test,
      specs2Scalacheck % Test,
      scalacheck % Test
      
    ),
    addCompilerPlugin("org.spire-math" % "kind-projector" % kindProjectorVersion cross CrossVersion.binary)
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",       // yes, this is 2 args
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-language:implicitConversions",
      "-unchecked",
      "-Xfatal-warnings",
      "-Xlint",
      "-Yno-adapted-args",
      "-Ywarn-dead-code",        // N.B. doesn't work well with the ??? hole
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Xfuture",
      "-Ywarn-unused-import",     // 2.11 only
      "-Ypartial-unification"
      ),
    scalacOptions in (Compile, console) --= Seq(
      "-Ywarn-unused-import",
      "-Xfatal-warnings"
    ),
    git.useGitDescribe := true
  )
  .enablePlugins(GitVersioning)
