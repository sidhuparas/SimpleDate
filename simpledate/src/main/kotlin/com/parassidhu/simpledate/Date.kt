@file:JvmMultifileClass
@file:JvmName("SimpleDate")

package com.parassidhu.simpledate

import java.util.*


fun Date?.toDateStandard(): String {
  val pattern = "dd MMMM YYYY"
  return dateAsString(this, pattern)
}

fun Date?.toDateStandardConcise(): String {
  val pattern = "dd MMM yyyy"
  return dateAsString(this, pattern)
}

fun Date?.toDateStandardInDigits(): String {
  val pattern = "dd-MM-yyyy"
  return dateAsString(this, pattern)
}

fun Date?.toDateYY(): String {
  val pattern = "dd MMMM yy"
  return dateAsString(this, pattern)
}

fun Date?.toDateYYConcise(): String {
  val pattern = "dd MMM yy"
  return dateAsString(this, pattern)
}

fun Date?.toDateYYInDigits(): String {
  val pattern = "dd-MM-yy"
  return dateAsString(this, pattern)
}

fun Date?.toDateYMD(): String {
  val pattern = "yyyy MMMM dd"
  return dateAsString(this, pattern)
}

fun Date?.toDateYMDConcise(): String {
  val pattern = "yyyy MMM dd"
  return dateAsString(this, pattern)
}

fun Date?.toDateYMDInDigits(): String {
  val pattern = "yyyy-MM-dd"
  return dateAsString(this, pattern)
}

fun Date?.toDateEMd(): String {
  val pattern = "EEE, MMM dd"
  return dateAsString(this, pattern)
}

fun Date?.toDateEMYShort(): String {
  val pattern = "EEE, MMM YY"
  return dateAsString(this, pattern)
}

fun Date?.toDateEMY(): String {
  val pattern = "EEEE, MMMM YYYY"
  return dateAsString(this, pattern)
}