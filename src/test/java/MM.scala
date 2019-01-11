import com.zing.utils.ByteUtil._


object MM {
  def main(args: Array[String]) = {
    val da: Array[Byte] = Array(1, 2, 3, 4,15,16);
    val s = toHex(da)
    val b = hexStrToBytes(s)

    println(s)
    println(hexStrToBytes("Dd102a40F10").mkString)
  }


}
