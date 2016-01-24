package fr.hervedarritchon.kata.exercises

/**
  * Created by Hervé Darritchon on 24/01/2016.
  *
  */
class Problem01 {
  def last[T](xs: List[T]) : Option[T] = xs match  {
    case Nil => throw new NoSuchElementException("last from empty List is forbidden")
    case x :: Nil => Some(x)
    case x :: xs1 => last(xs1)
  }

}
