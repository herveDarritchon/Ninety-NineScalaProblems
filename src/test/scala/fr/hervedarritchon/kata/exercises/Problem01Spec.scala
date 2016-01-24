package fr.hervedarritchon.kata.exercises

import org.scalatest.FunSuite

/**
  * Created by Hervé Darritchon on 24/01/2016.
  *
  */
class Problem01Spec extends FunSuite {

  test("Find the last element of a list") {
    val xs = List(1, 1, 2, 3, 5, 8)
    val problem: Problem01 = new Problem01()
    assert(problem.last(xs).contains(8),"Last element of List(1, 1, 2, 3, 5, 8) should be 8")
  }
}
