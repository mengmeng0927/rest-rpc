lazy val plugins = project in file(".") dependsOn `sbt-rest-rpc`

lazy val `sbt-rest-rpc` = project

logLevel := Level.Warn