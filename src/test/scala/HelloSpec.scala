import org.scalatest.FunSuite
import org.scalatest.DiagrammedAssertions

class HelloSpec extends FunSuite with DiagrammedAssertions {
  test("Hello should start with H") {
    assert("hello".startsWith("H"))
  }
}
