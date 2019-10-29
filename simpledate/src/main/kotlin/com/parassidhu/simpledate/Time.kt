package com.parassidhu.simpledate

import java.util.*

fun Date?.toTimeStandard(): String {
  val pattern = "HH:mm:ss"
  return dateAsString(this, pattern)
}

fun Date?.toTimeStandardWithoutSeconds(): String {
  val pattern = "HH:mm"
  return dateAsString(this, pattern)
}

fun Date?.toTimeStandardIn12Hours(): String {
  val pattern = "h:mm:ss a"
  return dateAsString(this, pattern)
}

fun Date?.toTimeStandardIn12HoursWithoutSeconds(): String {
  val pattern = "h:mm a"
  return dateAsString(this, pattern)
}