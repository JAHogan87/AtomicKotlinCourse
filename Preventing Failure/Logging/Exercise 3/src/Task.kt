// Logging/LoggingSoln3.kt
package loggingExercise3
import atomictest.eq
import checkinstructions.DataFile
import loggingExercise3.Level.*

enum class Level {
  // TODO: add values
}

var debugLevel: Level = TODO()

class Logger(fileName: String) {
  val logFile = DataFile(fileName).reset()
  private fun log(type: String, msg: String) =
    logFile.appendText("$type: $msg\n")
  fun trace(msg: String) = log("Trace", msg)
  fun debug(msg: String) = log("Debug", msg)
  fun info(msg: String) = log("Info", msg)
  fun warn(msg: String) = log("Warn", msg)
  fun error(msg: String) = log("Error", msg)
  fun report(msg: String) {
    trace(msg)
    debug(msg)
    info(msg)
    warn(msg)
    error(msg)
  }
}

private val logger = Logger("LoggingSoln3.txt")

fun main() {
  Level.values().toList().forEach {
    debugLevel = it
    logger.report("debugLevel($debugLevel)")
  }
  logger.logFile.readText() eq
  """
  Trace: debugLevel(Trace)
  Debug: debugLevel(Trace)
  Info: debugLevel(Trace)
  Warn: debugLevel(Trace)
  Error: debugLevel(Trace)
  Debug: debugLevel(Debug)
  Info: debugLevel(Debug)
  Warn: debugLevel(Debug)
  Error: debugLevel(Debug)
  Info: debugLevel(Info)
  Warn: debugLevel(Info)
  Error: debugLevel(Info)
  Warn: debugLevel(Warn)
  Error: debugLevel(Warn)
  Error: debugLevel(Error)
  """
}