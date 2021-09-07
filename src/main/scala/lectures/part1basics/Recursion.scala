package lectures.part1basics

import scala.annotation.tailrec

object Recursion {
  @main def main(): Unit =
    println(fibonacci(8))

  def factorial(n: Int): BigInt = 
    def factHelper(x: Int, accumulator: BigInt): BigInt = 
      if x <= 1 then accumulator else factHelper(x - 1, x * accumulator)
    factHelper(n,  1)

  def stringNTimes(s: String, n: Int): String = 
    @tailrec
    def aux(n: Int, acc: String): String = 
      if n == 0 then acc
      else aux(n - 1, s + " " + acc)
    aux(n, "")

  def isPrime(n: Int): Boolean = 
    @tailrec
    def aux(m: Int, acc: Boolean): Boolean = 
      if (m <= 1 || !acc) then acc
      else aux(m - 1, (n % m != 0) && acc)
    aux(n / 2, true)

  def fibonacci(n: Int): Int = 
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = 
      if (i >= n) then last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) then 1
    else fiboTailrec(2, 1, 1)
}
