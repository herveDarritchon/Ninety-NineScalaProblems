package fr.hervedarritchon.kata.exercises

/**
  * Created by Hervé Darritchon on 24/01/2016.
  *
  */
class Problem02 {
  def penultimate[T](xs: List[T]) : Option[T] = xs match {
    case Nil =>  throw new Error("penultimate from empty List is forbidden")
    case x :: Nil =>  throw new Error("penultimate from List with only 1 elem is forbidden")
    case x :: y :: Nil => Some(x)
    case x :: y :: xs1 => penultimate(y :: xs1)
  }

}
