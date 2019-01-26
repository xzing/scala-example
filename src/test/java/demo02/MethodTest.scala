package demo02


object MethodTest {

  def main(args: Array[String]): Unit = {
    Option.apply("23333") match {
      case Some(h) => println(h)
      case _ => println("null")
    }


    Option.apply(null) match {
      case Some(h) => println(h)
      case _ => println("null")
    }

    printAll("a", "b", "ahaha")
  }

  def printAll(s: String*) = {
    s.foreach(println)
  }

  /**
    * '*'参数只能出现在方法的结尾
    */
  //def printAll( me:Any, s: String*, fuck:Int) = {
  //  s.foreach(println)
  //}
}
