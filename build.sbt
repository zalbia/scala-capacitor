lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "ScalaJS-Capacitor",
    version := "0.1.0",
    scalaVersion := "2.13.12",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    libraryDependencies ++= Seq(
      "com.raquo" %%% "laminar" % "16.0.0"
    )
)