import com.zing.utils.HexUtil._


object MM {
  def main(args: Array[String]) = {
    val da: Array[Byte] = Array(1, 2, 3, 4,15,16);
    val s = toHex(da)
    val b = toBytes(s)

    println(s)
    println(toBytes("Dd102a40F10").mkString)
  }


}
