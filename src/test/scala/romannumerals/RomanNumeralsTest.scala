package romannumerals

import org.scalatest.{FunSuite, Matchers}

class RomanNumeralsTest extends FunSuite with Matchers {

  test("convert arabic to roman, small numbers") {
    assertRoman(1, "I")
    assertRoman(2, "II")
    assertRoman(3, "III")
    assertRoman(4, "IV")
    assertRoman(5, "V")
    assertRoman(6, "VI")
    assertRoman(7, "VII")
    assertRoman(8, "VIII")
    assertRoman(9, "IX")
    assertRoman(10, "X")
  }

  test("convert arabic to roman, big numbers") {
    assertRoman(20, "XX")
    assertRoman(40, "XL")
    assertRoman(50, "L")
    assertRoman(90, "XC")
    assertRoman(100, "C")
    assertRoman(400, "CD")
    assertRoman(500, "D")
    assertRoman(900, "CM")
    assertRoman(1000, "M")
    assertRoman(4999, "MMMMCMXCIX")
  }

  def assertRoman(arabic: Int, roman: String) {
    RomanNumerals.arabicToRoman(arabic) should be(roman)
  }

}
