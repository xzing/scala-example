package com.zing.utils

import scala.util.matching.Regex

object RegexUtil {

  class RichRegex(underlying: Regex) {
    def matches(s: String):Boolean = underlying.pattern.matcher(s).matches
  }

  implicit def regexToRichRegex(r: Regex) = new RichRegex(r)
}
