import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.12.10",
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
    addCompilerPlugin("org.spire-math" % "kind-projector" % kindProjectorVersion cross CrossVersion.binary),
    git.useGitDescribe := true
  )
  .enablePlugins(GitVersioning)
