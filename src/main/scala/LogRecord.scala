package object DataStructures {
  type SessionId = Long

  case class LogRecord (
    sessionId: SessionId,
    name: String
  )

  // filters

    def hasName(names: Seq[String])(logRecord: LogRecord): Boolean = names contains logRecord.name
}
