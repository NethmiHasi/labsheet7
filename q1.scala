package Tutorial7

object q1 {
  def filterEvenNumbers(num : List[Int]) : List[Int] = {
    num.filter((x:Int) => x %2 ==0 )
  }

  def main(args: Array[String]): Unit = {

    println("Enter a list of numbers separated by spaces:")
    val input = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList
    println(filterEvenNumbers(input))

  }

}
