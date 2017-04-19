package discgolf

import org.scalatest.{FunSuite, Matchers}

class ScalaDiscGolfGameTest extends FunSuite with Matchers {

  test("should compute score") {
    ScalaDiscGolfGame.score(15, 12) shouldBe "+3"
    ScalaDiscGolfGame.score(21, 23) shouldBe "-2"
  }

  test("should score game") {

    val holes = List(
      new Hole(1,4, 5),
      new Hole(2,3,5),
      new Hole(3,5,7)
    )

    ScalaDiscGolfGame.scoreGame(holes) shouldBe "+5"

  }

}
