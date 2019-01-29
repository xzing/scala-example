package demo02

object ClassAndObjectTest {

  class Test01(name: String) {

  }

  class Test02(private var name: String) {
    def getName(): String = {
      name
    }
  }

  /**
    * private 私有化构造函数
    * 可以用等号设置默认值
    *
    * @param name
    */
  class Test03 private(var name: String, var s: String = "defaultValue") {
    //辅助构造函数只能用this

    def this() {
      this("no")
    }


    def canEqual(other: Any): Boolean = other.isInstanceOf[Test03]

    /**
      * 覆写
      *
      * @param other
      * @return
      */
    override def equals(other: Any): Boolean = other match {
      case that: Test03 =>
        (that canEqual this) &&
          name == that.name
      case _ => false
    }

    override def hashCode(): Int = {
      val state = Seq(name)
      state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }
  }


  class Test04() {
    /**
      * 阻止m生成 getter 和 setter
      */
    var m: String = _
  }

  def main(args: Array[String]): Unit = {
    val t1 = new Test01("2333")
    val t2 = new Test02("2333")

    println(s"t1.name = ${t1}")
    //println(s"t1.name = ${t1.name}") // error
    //println(s"t1.name = ${t1.getName}") // error
    println(s"t1.name = ${t2}")
    //println(s"t1.name = ${t2.name}") // error
    println(s"t1.name = ${t2.getName}")

    println()
  }

}
