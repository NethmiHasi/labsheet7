package Tutorial7

object q2 {
  def calculageSquare(num: List[Int]): List[Int] = {
    num.map((x:Int) => x * x)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of numbers separated by spaces:")
    val input = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList
    println(calculageSquare(input))

  }


}
