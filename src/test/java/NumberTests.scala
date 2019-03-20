import java.math.BigInteger

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

    var x = 1;
    x += 1
    println(x)
    x.+=(2)
    println(x)

    val a = 0.3;
    val b = 0.1 + 0.2;
    println(a == b)
    println(a)
    println(b)


    val num = BigInt("2314123412341234123");
    println(num + 1)
    println(num.toLong)
    //是否可以转成Int
    println(num.isValidInt)

    println(BigDecimal("48957329845.23948"))

    //随机数
    println(scala.util.Random.nextInt())
    println(scala.util.Random.nextInt(50))
    val seedRandom = new scala.util.Random(1000L)
    println(seedRandom.nextInt())


    //array
    val 啊 = 1 to 10
    println(啊)
    for (i <- 啊) {
      println(i)
    }

    val 不 = 2 to 10 by 2
    println(不)
    for (i <- 不) {
      println(i)
    }

    val pi = scala.math.Pi
    println(f"$pi")
    //小数点后5位
    println(f"$pi%1.5f")
    //至少7位，其中小数后2位，不足前方补0
    println(f"$pi%07.2f")
    //至少两位，其中小数点后2位
    println(f"$pi%2.2f")
    println("---------------------")
    //println(2&7)

    bigIntegerTest()
  }

  def bigIntegerTest(): Unit = {
    val mmmya = new BigInteger(0x100, 16);
    println(mmmya.testBit(4))
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
