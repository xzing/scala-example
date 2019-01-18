import scala.annotation.switch

import util.control.Breaks._

object FlowTests {

  def main(args: Array[String]): Unit = {

    //if 限定方式的For
    for (
      i <- 1 to 10
      if i > 3
      if i < 8
      if 0 == i % 3
    ) {
      println(i)
    }


    //产生新集合的方式
    val c = for (
      i <- 1 to 100
      if 0 != i % 3
      if 0 != i % 7
      if 0 == i % 13
    ) yield {
      i
    }
    println(c)



    //Scala 三元计算
    println(if (1 > 2) 3 else 4)

    val i = scala.util.Random.nextInt(3)
    (i: @switch) match {
      case 0 => println("dance")
      case 1 => println("music")
      case 2 => println(i)
      case _ => println(2)
    }


    (scala.util.Random.nextInt(3): @switch) match {
      case 0 | 2 => println("even")
      case 1 => println("odd")
      case _ => println(2)
    }



    //break  continue test
    breakable {
      for (i <- 0 to 100) {
        if (0 == i % 2) {
          println(i)
          break
        }
      }
    }


    for (i <- 0 to 100) {
      breakable {
        if (0 == i % 3) {
          break
        }
        println(i)
      }
    }


  }

}
