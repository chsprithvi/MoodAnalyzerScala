object MoodAnalyzer extends App {

  def analyzeMood(message: String): String = if (message.contains("Sad")) "Sad"
  else "Happy"
}
