package dev.bugorz

/**
  * P02 (*) Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
object P02 {
  def lastButOne[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: Nil => throw new NoSuchElementException
    case head :: result :: Nil => head
    case head :: tail => lastButOne(tail)
  }
}
