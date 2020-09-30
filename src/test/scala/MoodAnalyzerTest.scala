import MoodAnalyzerException._
import org.scalatest.FunSuite

class MoodAnalyzerTest extends FunSuite {
  test("GivenMessage_WhenSad_ReturnSad") {
    assert(MoodAnalyzer.analyzeMood("this is Sad") == "Sad")
  }

  test("GivenMessage_WhenNotSad_ReturnHappy") {
    assert(MoodAnalyzer.analyzeMood("this is Happy") == "Happy")
  }

  test("givenMessage_WhenNull_shouldReturnHappyMood") {
    assert(MoodAnalyzer.analyzeMood(null) == "Happy")
  }

  test("givenMessage_whenEmpty_shouldThrowException") {
    assert(MoodAnalyzer.analyzeMood("  ") == ExceptionType.EMPTY )

  }

}