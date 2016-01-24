package fr.hervedarritchon.kata.exercises

import org.scalatest.FunSuite

/**
  * Created by Hervé Darritchon on 24/01/2016.
  *
  */
class Problem02Spec extends FunSuite {

  test("Find the last but one element of a list.") {
    val xs = List(1, 1, 2, 3, 5, 8)
    val problem: Problem02 = new Problem02()
    assert(problem.penultimate(xs).contains(5),"Last element of List(1, 1, 2, 3, 5, 8) should be 5")
  }
}
