import com.zing.utils.HexUtil._


object StringTests {
  //  split
  def main(args: Array[String]): Unit = {
    val str: String = "monster"
    str.foreach(s => print(s + " "))
    str.foreach(println)

    println(str.charAt(3))

    println(str.filter(_ != 'm'))

    println(toHex("0".getBytes()))

    println(str.drop(2).take(2))

    println(str.capitalize)

    println(str)

    //true
    println(str == 'm' + "onster")
    // true
    println(str == "monster")

    //查找
    println(str.filter(_ > 's').groupBy(c => c.toByte).keys.mkString(","))

    "\\d+".r.findFirstIn("12dsafnsjk12") match {
      case Some(n) => println(n)
      case _ => println("nothing find")
    }

    "\\d".r.findAllIn("92dsafnsjk 121sd 523").foreach(f => println(f))

    //替换
    println("fuck".r.replaceAllIn("fuck U U fucker", "****"))
    println("hate".r.replaceFirstIn("I hate U but I like her", "love"))

  }


}
