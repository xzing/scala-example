package demo02

import java.util.stream.Collectors

object ListTest {


  def main(args: Array[java.lang.String]): Unit = {
    val list: java.util.List[Int] = new java.util.ArrayList[Int]()
    list.add(1)
    list.add(2)
    list.add(3)

    list.stream()
      .filter((s: Int) => s >= 2)
      .collect(Collectors.toList[Int]())
      .stream()
      .forEach(a => System.out.println(a))

    //println(ls2)


  }

}
