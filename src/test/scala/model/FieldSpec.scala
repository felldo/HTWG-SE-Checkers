package model

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FieldSpec extends AnyWordSpec with Matchers {
  "A Field" when {
    "constructed should be given the length of its edge as size" should {
      val smallfield = Field(2)
      "have a total field size of 4" in {
        smallfield.totalFieldSize should be(4)
      }
    }
    "filled" in {
      val field = Field(10)
      field.matrix.cell(0, 1).get.value should be(1)
      field.matrix.cell(0, 0) shouldBe None
      field.matrix.cell(1, 0).get.value should be(1)
      field.matrix.cell(1, 1) shouldBe None
    }
  }
  "made a string" in {
    val smallfield = Field(10)
    smallfield.toString shouldBe "     0   1   2   3   4   5   6   7   8   9\n0  ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐\n1  ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐   ▐\n2  ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐   ▐ 1 ▐\n3  ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐\n4  ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐\n5  ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐\n6  ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐   ▐\n7  ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐\n8  ▐   ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐\n9  ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐ 3 ▐   ▐\n"
  }
  "A FieldMatrix" when {
    "created" should {
      val matrix = new FieldMatrix[Cell](1, Cell(0))
      "have a size of 1" in {
        matrix.size should be(1)
      }
      matrix.replaceCell(0, 0, Cell(1))
      "have replaceable Cells" in {
        matrix.cell(0, 0).toString should be("▐   ▐")
      }
      matrix.fill(Cell(1))
      "be fillable" in {
        matrix.cell(0, 0).toString should be("▐   ▐")
      }
      "look like" in {
        println(matrix.toString)
        matrix.toString shouldBe "Vector(Vector(▐   ▐))"
      }*/
    }
  }
  "A big field " when {
    "built" should {
      val bigField = Field(7)
      val fieldMatrix = new FieldMatrix[Cell](7, Cell(0))
      "have Cell(0)" in {
        fieldMatrix.cell(4, 0) shouldBe None
      }
    }
  }
}
