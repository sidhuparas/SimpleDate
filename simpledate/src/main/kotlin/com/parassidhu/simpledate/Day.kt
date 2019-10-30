@file:JvmMultifileClass
@file:JvmName("SimpleDate")

package com.parassidhu.simpledate

import java.util.*

fun Date?.toDay(): String {
  val pattern = "EEEE"
  return dateAsString(this, pattern)
}