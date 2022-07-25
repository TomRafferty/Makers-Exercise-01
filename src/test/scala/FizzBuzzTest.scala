// to fix this import in IntelliJ simply open the sbt
// workspace (right side of the window) and press the
// refresh button.
import org.scalatest.funsuite.AnyFunSuite
class FizzBuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(FizzBuzz.generate(1) === "1")
  }

  test("lists the numbers up to two") {
    assert(FizzBuzz.generate(2) === "1, 2")
  }

  //adding some more tests for fun: - want to see some more fizzing and buzzing :-)
  test("lists the numbers up to thirty six") {
    assert(FizzBuzz.generate(36) === "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz")
  }

  test("lists the numbers up to fifteen") {
    assert(FizzBuzz.generate(15) === "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz")
  }
}