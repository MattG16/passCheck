package password_checker

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Password_Test extends AnyFunSpec with Matchers {
  describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords that are less than 6 characters") {
        val tooShort = "abcde"
        val longEnough = "abcdef"
        val evenLonger = "abcdefghi"
        Password.isValid(tooShort) shouldBe false
        Password.isValid(longEnough) shouldBe false
        Password.isValid(evenLonger) shouldBe false
      }
    }
    describe("makes sure it has a number in it") {
      it("rejects passwords with no number character in it") {
        val noNum = "abcde"
        val yesNum = "abcde1"
        val moreNum = "abcde123"
        Password.isValid(noNum) shouldBe false
        Password.isValid(yesNum) shouldBe true
        Password.isValid(moreNum) shouldBe true
      }
    }
  }
}
