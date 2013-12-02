addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.+")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.+")

resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
    url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.+")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.2")
