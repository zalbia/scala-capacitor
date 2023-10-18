import scala.sys.process.Process

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    name := "ScalaJS-Capacitor",
    version := "0.1.0",
    scalaVersion := "2.13.12",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    libraryDependencies ++= Seq(
      "com.raquo" %%% "laminar" % "16.0.0"
    ),
    externalNpm := {
      Process("npm", baseDirectory.value).!
      baseDirectory.value
    },
    stIgnore ++= List(
      "@capacitor/android",
      "@capacitor/cli",
      "@capacitor/core"
    )
  )
