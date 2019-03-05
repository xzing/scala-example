package demo02

import scala.collection.SortedMap

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

    val s = SortedMap(3 -> "喵", 2 -> "😡", 6 -> "")
    s.mapValues(println(_))
    s.keys.map(println(_))
    s.values.map(println(_))

    val immutableMap = scala.collection.immutable.ListMap(3 -> "喵", 2 -> "😡", 6 -> "")
    immutableMap.mapValues(println(_))
    immutableMap.keys.map(println(_))
    immutableMap.values.map(println(_))
    println("----------")
    immutableMap.updated(4, "samian")
    immutableMap.mapValues(println(_))
    immutableMap.keys.map(println(_))
    immutableMap.values.map(println(_))


    println("----------")
    val mutableMap = scala.collection.mutable.ListMap(3 -> "喵", 2 -> "😡", 6 -> "")
    mutableMap.mapValues(println(_))
    mutableMap.keys.map(println(_))
    mutableMap.values.map(println(_))
    println("----------")
    mutableMap.update(3, "sa")
    mutableMap.mapValues(println(_))
    mutableMap.keys.map(println(_))
    mutableMap.values.map(println(_))

    println(mutableMap.mkString("[", ",", "]"))


    mutableMap.put(3, "hi")
    println(mutableMap.mkString("[", ",", "]"))


    println(mutableMap.mkString("========================"))

    val nanana: collection.mutable.Map[String, Int] = collection.mutable.Map.empty[String, Int];
    nanana.+=(("1", 1))
    println(nanana.mkString("[", ",", "]"))

    nanana.+=(("2", 2))
    println(nanana.mkString("[", ",", "]"))

    nanana.+=(("1", 2))
    println(nanana.mkString("[", ",", "]"))

    nanana.put("1", 3)
    println(nanana.mkString("[", ",", "]"))

    nanana.update("1", 4)
    println(nanana.mkString("[", ",", "]"))


    val retainMap = scala.collection.mutable.ListMap(1 -> "ka", 2 -> "ki", 3 -> "ku")

    retainMap.filter {
      case (k: Int, v: String) => k > 1
    }.map(println)
    println(retainMap.mkString("[", ",", "]"))


  }

}
