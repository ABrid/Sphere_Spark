lazy val sparkVersion = "2.2.0"

name := "SphereSpark"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.mongodb.spark" %% "mongo-spark-connector" % sparkVersion,
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.6"
libraryDependencies += "joda-time" % "joda-time" % "2.9.3"