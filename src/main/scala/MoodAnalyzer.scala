object MoodAnalyzer extends App {
  def analyzeMood(message: String): String = {
    try {
      if (message.contains("Sad")) return "Sad"
      else if (message.contains("Happy")) "Happy"
      else " "
    }
    catch {
      case _: NullPointerException => "Happy"

    }
  }
}
