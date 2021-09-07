package lectures.part1basics

import scala.annotation.tailrec

object Functions {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aRepeatedFunction(s: String, n: Int): String =
    if (n == 1) then s else s"$s ${aRepeatedFunction(s, n - 1)}"

  def greeting(name: String, age: Int): String =
    if (age == 1) then s"Hi, my name is $name and I am $age year old"
    else s"Hi, my name is $name and I am $age years old"

  def factorial(n: Int): Int =
    if (n == 0) then 1 else n * factorial(n - 1)

  def fibonacci(n: Int): Int =
    if (n == 2 || n == 1) then 1 else fibonacci(n - 1) + fibonacci(n - 2)

  def isPrime(n: Int): Boolean =
    def isPrimeAux(m: Int): Boolean =
      if n == m then true
      else (n % m != 0) && isPrimeAux(m + 1)
    isPrimeAux(2)

  @main def main: Unit =
    println(greeting("Agatha", 1))
    println(factorial(5))
    println(fibonacci(20))
    println(isPrime(37))
    println(isPrime(2003))
    println(isPrime(37 * 17))
}
