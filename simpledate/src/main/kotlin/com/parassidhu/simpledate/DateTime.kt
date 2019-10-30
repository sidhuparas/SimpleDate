@file:JvmMultifileClass
@file:JvmName("SimpleDate")

package com.parassidhu.simpledate

import java.util.*

fun Date?.toDateTimeStandard(): String {
  val pattern = "dd MMMM yyyy HH:mm:ss"

  return dateAsString(this, pattern)
}

fun Date?.toDateTimeStandardIn12Hours(): String {
  val pattern = "dd MMMM yyyy h:mm:ss a"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeStandardInDigits(): String {
  val pattern = "dd-MM-yyyy HH:mm:ss"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeStandardInDigitsAnd12Hours(): String {
  val pattern = "dd-MM-yyyy h:mm:ss a"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeStandardConcise(): String {
  val pattern = "dd MMM yyyy HH:mm:ss"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeStandardConciseIn12Hours(): String {
  val pattern = "dd MMM yyyy h:mm:ss a"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeYY(): String {
  val pattern = "dd MMMM yy HH:mm:ss"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeYYIn12Hours(): String {
  val pattern = "dd MMMM yy h:mm:ss a"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeYYInDigits(): String {
  val pattern = "dd-MM-yy HH:mm:ss"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeYYInDigitsAnd12Hours(): String {
  val pattern = "dd-MM-yy h:mm:ss a"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeYYConcise(): String {
  val pattern = "dd MMM yy HH:mm:ss"
  return dateAsString(this, pattern)
}

fun Date?.toDateTimeYYConciseIn12Hours(): String {
  val pattern = "dd MMM yy h:mm:ss a"
  return dateAsString(this, pattern)
}

fun Date?.toZuluFormat(): String {
  val pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
  return dateAsString(this, pattern)
}