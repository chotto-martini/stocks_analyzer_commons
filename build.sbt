// General

organization := "com.stocks_analyzer"

name := """stocks_analyzer_commons"""

version := "1.0.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.slf4j"                % "slf4j-api"            % "1.7.22",
  "ch.qos.logback"           % "logback-classic"      % "1.1.10",
  "ch.qos.logback"           % "logback-core"         % "1.1.10",
  "org.apache.maven.plugins" % "maven-javadoc-plugin" % "2.10.4",
  "junit"                    % "junit"                % "4.12",
  "com.novocode"             % "junit-interface"      % "0.11"
)

publishTo := Some(Resolver.file("stocks_analyzer_commons",file("./repository/"))(Patterns(true, Resolver.mavenStyleBasePattern)))

javacOptions ++= Seq("-encoding", "UTF-8")