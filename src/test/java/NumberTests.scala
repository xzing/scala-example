import java.math.BigInteger

import scala.collection.mutable
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

    println("---------------------")
    testBigValue()


    println("---------------------")
    testStep()

    println("_______________________")
    testRandomStep()
  }

  def testStep(): Unit = {
    val num = 54
    val stepBits: BigInteger = new BigInteger(num, 10)
    val mmmya = new BigInteger(0xA76BFE87, 10)
    val stepRange = mmmya.mod(BigInteger.valueOf(stepBits.bitCount())).intValue()


    println((num + stepRange) % stepBits.bitCount())

  }

  def testBigValue(): Unit = {
    val mmmya = new BigInteger(0x110, 10);
    println(mmmya.toString)

  }


  def bigIntegerTest(): Unit = {
    val mmmya = new BigInteger(0x110, 10);

    //查看2进制的时候到某一位（入参）的时候是不是1
    println(mmmya.testBit(8))


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

  def testRandomStep(): Unit = {
    val mmap = new mutable.HashMap[Int, Int]()
    val num = Array(1, 20, 83, 34, 91, 46, 12, 45)
    val indexs = num.sorted.map(s => {
      println(s)
      s
    }).toList

    val miner = 20
    val self = 83

    val (min, max) = if (self > miner) {
      (miner, self)
    } else {
      (self, miner)
    }

    var step = 0;

    for (index <- indexs) {
      if (index >= min && index < max) {
        step += 1
      }
    }


    println(s"\n${step}")
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
