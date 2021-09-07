package lectures.part1basics

object ValuesVariablesTypes{
  def main: Unit =
    // val x: Int = 42
    // type inference
    val x = 42
    println(x)

    val aString: String = "Hello"
    val aChar: Char = 'a'
    val anInt: Int = x
    val aShort: Short = 4613
    val aLong: Long = 918237891323124L
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.141592

    // variables
    var aVariable: Int = 4
    println(aVariable)
    aVariable = 5
    println(aVariable)
  }
