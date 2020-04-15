import sbt._
import sbtcrossproject.CrossPlugin.autoImport._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import Keys._

object Dependencies {
  object versions {
    val grpc                    = "1.28.1"
    val protobuf                = "3.11.4"
    val utest                   = "0.7.4"
    val fastparse               = "2.2.4"
    val silencer                = "1.6.0"
    val collectionCompat        = "2.1.5"
    val coursier                = "2.0.0-RC6-12"
    val mockito                 = "3.2.0"
    val protocBridge            = "0.8.1"
    val protocJar               = "3.11.4"
    val protobufRuntimeScala    = "0.8.5"
    val commonsCodec            = "1.14"
    val scalaTest               = "3.1.1"
    val scalaTestPlusScalaCheck = "3.1.1.1"
    val scalaTestPlusMockito    = "3.1.0.0"
    val annotationApi           = "1.3.2"
  }

  val Scala212 = "2.12.10"

  val Scala213 = "2.13.1"

  val silencer = Seq(
    sbt.compilerPlugin(
      "com.github.ghik" % "silencer-plugin" % versions.silencer cross CrossVersion.full
    ),
    "com.github.ghik" % "silencer-lib" % versions.silencer % Provided cross CrossVersion.full
  )

  val protobufJava = "com.google.protobuf" % "protobuf-java" % versions.protobuf
  val fastparse    = Def.setting { "com.lihaoyi" %%% "fastparse" % versions.fastparse }
  val scalaCollectionCompat = Def.setting {
    "org.scala-lang.modules" %%% "scala-collection-compat" % versions.collectionCompat
  }
  val protobufRuntimeScala = Def.setting {
    "com.thesamet.scalapb" %%% "protobuf-runtime-scala" % versions.protobufRuntimeScala
  }

  val protocJar        = "com.github.os72"      % "protoc-jar"         % versions.protocJar
  val coursier         = "io.get-coursier"      %% "coursier"          % versions.coursier
  val protocBridge     = "com.thesamet.scalapb" %% "protoc-bridge"     % versions.protocBridge
  val protobufJavaUtil = "com.google.protobuf"  % "protobuf-java-util" % versions.protobuf

  // grpc
  val grpcStub      = "io.grpc" % "grpc-stub"            % versions.grpc
  val grpcProtobuf  = "io.grpc" % "grpc-protobuf"        % versions.grpc
  val grpcNetty     = "io.grpc" % "grpc-netty"           % versions.grpc
  val grpcServices  = "io.grpc" % "grpc-services"        % versions.grpc
  val grpcProtocGen = "io.grpc" % "protoc-gen-grpc-java" % versions.grpc

  // testing
  val scalaTest = "org.scalatest" %% "scalatest" % versions.scalaTest
  val scalaTestPlusScalaCheck =
    "org.scalatestplus" %% "scalacheck-1-14" % versions.scalaTestPlusScalaCheck
  val scalaTestPlusMockito = "org.scalatestplus" %% "mockito-1-10" % versions.scalaTestPlusMockito
  val utest                = Def.setting { "com.lihaoyi" %%% "utest" % versions.utest }
  val mockitoCore          = "org.mockito" % "mockito-core" % versions.mockito
  val commonsCodec         = "commons-codec" % "commons-codec" % versions.commonsCodec

  val annotationApi =
    "javax.annotation" % "javax.annotation-api" % versions.annotationApi // needed for grpc-java on JDK9
}
