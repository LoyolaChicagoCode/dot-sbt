addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.1")

resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
    url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.2")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

//addSbtPlugin("com.hanhuy.sbt" % "android-sdk-plugin" % "1.3.5")
//
//addSbtPlugin("com.hanhuy.sbt" % "sbt-idea" % "1.7.0-SNAPSHOT")
//
//resolvers += Resolver.sbtPluginRepo("snapshots")
