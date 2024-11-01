val x = 5
def func(n1: Int): Int = {
  val n2 = n1 + x
  return n2
}
val z = func(2)
println(s"The output is $z")

class Parent {
  val ageN = 47
  def age() = println(s"The age is $ageN")
}
class Child extends Parent {
//println(s"ageN")
  override def age() = println(s"Whoohoo  + $ageN")
}

val ch = new Child
println(ch.ageN)
ch.age()

val aMappedList = List(1, 2, 3, 4).map(x => x * 2)
val aMappedList1 = List(1, 2, 3, 4).map(_ * 2)

val aFlatMappedList = List(1, 2, 3, 4).flatMap(x => List(x, x * 2))

val aFilteredList = List(1, 2, 3, 4, 5).filter(x => x <= 3)
val aFilteredList1 = List(1, 2, 3, 4, 5).filter(_ <= 3)

val allPairs = List(1, 2, 3).flatMap(number => List("a", "b", "c").map(letter => s"$number $letter"))
println(allPairs)

val allPairs1 = for{
    number <- List(1,2,3)
    letter <- List("a","b","c")
}yield s"$number $letter"

val aRange = 1 to 1000
val twoByTwo = aRange.map(_*2).toList

val aTuple = ("Dream Theater","rocks")
val ObjectMatch = aTuple match{
    case(noun,verb) => println(s"$noun $verb")
    case _ => "Sorry"
}