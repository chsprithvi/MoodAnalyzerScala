object MoodAnalyzer extends App {
  def analyzeMood(message: String): String = {
    try {
      if (message.contains("Sad")) "Sad"
      else "Happy"
    }
    catch {
      case _: NullPointerException =>
        "Happy"
    }
  }
}
