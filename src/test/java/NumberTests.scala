import scala.language.implicitConversions


object NumberTests {

  implicit def int2Str(a: Int): String = {
    a.toString
  }

  def main(args: Array[String]): Unit = {

    println(1 + 2)
    println(1 + "2")
    println("1" + "2")


    plus(1, 2);
    println(plus(1, 2))


    println(plus("1", "2"))
  }


  def plus(a: Int, b: Int) = {
    a + b
  }

  def plus(a: Option[Int], b: Option[Int]) = {
    a match {
      case Some(m) => b match {
        case Some(n) => m + n
        case _ => 0
      }
      case _ => 0
    }
  }


  //def plus(a: String, b: String): String = {
  //  a + b;
  //}

  implicit def toInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: Exception => {
        e.printStackTrace()
        None
      }
    }
  }


}
