package lectures.part1basics

object Expressions{
  def main: Unit =
    val x = 1 + 2 // expression
    println(x)
    println(2 + 3 * 4)
    // + - * / & | ^ << >> >>> (rght shift with zero extension)
    
    println(1 == x)
    // == != > >= < <=

    println(!(1 == x))
    // ! && ||

    var aVariable = 2
    aVariable += 3 // also works with -= *= /= (side effects)
    println(aVariable)

    val aCondition: Boolean = true
    val aConditionedValue = if aCondition then 5 else 3 // if expression
    println(aConditionedValue)

    val aWeirdValue = (aVariable = 3)
    println(aWeirdValue)
  }
