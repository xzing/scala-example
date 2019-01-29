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
  }

}