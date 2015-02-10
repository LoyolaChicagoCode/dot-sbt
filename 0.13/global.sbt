import scalariform.formatter.preferences._

// This enables manual formatting:

defaultScalariformSettings

// To enable automatic formatting, include 
//   scalariformSettings
// in your project-specific build file.

ScalariformKeys.preferences := FormattingPreferences()
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(CompactControlReadability, true)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PreserveDanglingCloseParenthesis, true)
  .setPreference(PreserveSpaceBeforeArguments, true)

net.virtualvoid.sbt.graph.Plugin.graphSettings

net.virtualvoid.sbt.graph.Plugin.graphSettings
