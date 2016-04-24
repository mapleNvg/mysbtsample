package sample

import org.scalatest.Assertions._

/**
  * Created by zhoufeng on 16/4/17.
  */
class SampleSuite extends UnitFunSuite{
  /**
    * http://www.scalatest.org/user_guide/using_assertions
    */

  assert(1 + 1 === 2, "this is a clue")
  assertResult(2, "this is a clue") { 1 + 1 }


  test("test sample"){
    val sa = Samples()
    println(sa.dt2)
  }


}
