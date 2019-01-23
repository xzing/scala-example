package demo02

object MapTest {
  def main(args: Array[String]): Unit = {
    val aMap: Map[Int, String] = Map(1 -> "sd", 2 -> "250", 3 -> "love")

    aMap.map(s => {
      val k = s._1
      val v = s._2
      println(s"$k-> $v ")
    })

    aMap.values.map(println(_))
    println("----------")
    aMap.keys.map(println(_))


  }

}
