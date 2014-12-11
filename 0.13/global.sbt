import scalariform.formatter.preferences._

// Plugin is global but should be enabled on a per-project basis.
//
//scalariformSettings

ScalariformKeys.preferences := FormattingPreferences()
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(CompactControlReadability, true)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PreserveDanglingCloseParenthesis, true)
  .setPreference(PreserveSpaceBeforeArguments, true)

net.virtualvoid.sbt.graph.Plugin.graphSettings

net.virtualvoid.sbt.graph.Plugin.graphSettings
