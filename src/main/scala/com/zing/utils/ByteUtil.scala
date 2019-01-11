package com.zing.utils

import java.math.BigInteger
import com.zing.utils.RegexUtil._

object ByteUtil {
  val HEX_PATEN = "^(\\d|a|b|c|d|e|f|A|B|C|E|F)*?$"

  def toHex(bytes: Array[Byte]): String = bytes.map("%02X".format(_)).mkString

  def hexStrToBytes(hex: String): Array[Byte] = {
    new BigInteger(hex, 16).toByteArray
//    hex match {
//      case s if isNotHex(s) => throw new RuntimeException("Not Hex String")
//      case _ => new BigInteger(hex, 16).toByteArray
//    }
  }

  def isNotHex(hex: String): Boolean = {
    hex.isEmpty ^ !(HEX_PATEN.r matches hex)
  }
}
