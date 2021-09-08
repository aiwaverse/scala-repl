package lectures.part2oop

object OOBasics {
  @main def main(): Unit = 
    val aPerson = Person("Agatha", 22)
    println(aPerson)
    println(aPerson.age)

}

class Person(name: String, val age: Int){

}