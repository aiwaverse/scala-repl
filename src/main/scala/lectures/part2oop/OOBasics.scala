package lectures.part2oop

object OOBasics {
  @main def main(): Unit =
    val aPerson = Person("Agatha", 22)
    aPerson.greet("Luna")
    val w = Writer("Agatha", "Lenz", 1999)
    println(w.fullName)
    val n = Novel("Gay Stuff", 2021, w)
    println(n.authorAge)
    println(n.isWrittenBy(w))
    val newNovel = n.copy(2022)
    println(newNovel.name)
    println(n == newNovel)

}

class Person(name: String, val age: Int) {
  val x = 2
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name!")

}

class Writer(
    val firstName: String,
    val surname: String,
    val yearOfBirth: Int
) {
  def fullName: String = firstName + " " + surname
}

class Novel(val name: String, val yearOfRelease: Int, author: Writer){
  def authorAge = yearOfRelease - author.yearOfBirth 
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int) = Novel(name, newYear, author)
}

class Counter(val c: Int){
  def inc() = Counter(c + 1)
  def inc(n: Int) = Counter(c + n)
  def dec() = Counter(c - 1)
  def dec(n: Int) = Counter(c - n)
}
