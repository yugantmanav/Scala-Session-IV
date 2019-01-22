package acadgild.Task4

object CourseDetails {
  def main(args: Array[String]){
    println(matchTest("Android App Development"))
    println(matchTest("Data Science"))
    println(matchTest("Big Date Hadoop & Spark Developer"))
    println(matchTest("BlockChain Certification"))
    println(matchTest("Java Development"))
  }
  def matchTest(x:Any): Any = x match{
    case "Android App Development" => "14,999 INR"
    case "Data Science" => "49,999 INR"
    case "Big Date Hadoop & Spark Developer" => "24,999 INR"
    case "BlockChain Certification" => "49,999 INR"
    case _ => "Details not found!"
  }
}