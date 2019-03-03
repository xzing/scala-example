package demo03

object ThreadTest {

  def main(args: Array[String]): Unit = {
    new Thread(() => {
      for (i <- 1 to 2000) {
        println(s"233333:$i")
      }
    }).start()
    try {
      Thread.sleep(1000)
    } catch {
      case t: Throwable => t.printStackTrace()
    }
  }
}
