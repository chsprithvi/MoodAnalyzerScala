import org.scalatest.FunSuite

class MoodAnalyzerTest extends FunSuite{
  test("GivenMessage_WhenSad_ReturnSad") {
    assert(MoodAnalyzer.analyzeMood("this is Sad")==="Sad")
  }

  test("GivenMessage_WhenNotSad_ReturnHappy") {
    assert(MoodAnalyzer.analyzeMood("this is Happy")==="Happy")
  }
}