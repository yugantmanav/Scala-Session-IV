package acadgild.Task3

object PartialFunctions {
  def main(args: Array[String]){
    val inputNumber1 = 1
    val inputNumber2 = 2
    val result = getSquare(inputNumber1,inputNumber2)
    println("Square of given numbers : "+ result)
  }
  
  val addNumbers: PartialFunction[(Int,Int),Int] = {
    case(x,y) => x+y+2
  }
  
  def getSquare(num1: Int, num2: Int): Int = {
    val res = addNumbers(num1,num2)
    res*res
  }
}