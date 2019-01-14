package com.zing.utils

import java.math.BigInteger
import com.zing.utils.RegexUtil._

object HexUtil {
  val HEX_PATEN = "^([0-9A-Fa-f]{2})+$"

  def toHex(bytes: Array[Byte]): String = bytes.map("%02x".format(_)).mkString

  def toHexUpCase(bytes: Array[Byte]): String = bytes.map("%02X".format(_)).mkString

  def toBytes(hex: String): Array[Byte] = new BigInteger(hex, 16).toByteArray

  def isNotHex(hex: String): Boolean = hex.isEmpty || !(HEX_PATEN.r matches hex)

  def isHex(hex: String): Boolean = !hex.isEmpty || (HEX_PATEN.r matches hex)

  def printBytes(bytes: Array[Byte]): String = {
    val hex = toHex(bytes)
    println(hex)
    hex
  }


}
