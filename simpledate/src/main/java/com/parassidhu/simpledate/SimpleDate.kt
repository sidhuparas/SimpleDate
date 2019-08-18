package com.parassidhu.simpledate

import java.text.SimpleDateFormat
import java.util.*

private lateinit var simpleDateFormat: SimpleDateFormat

fun main() {
    val date = Date()

    /*println(SimpleDate.DateTime.toStandard(date))
    println(SimpleDate.DateTime.toStandardIn12Hours(date))
    println(SimpleDate.DateTime.toStandardInDigits(date))
    println(SimpleDate.DateTime.toStandardInDigitsAnd12Hours(date))
    println(SimpleDate.DateTime.toStandardConcise(date))
    println(SimpleDate.DateTime.toStandardConciseIn12Hours(date))
    println(SimpleDate.DateTime.toYY(date))
    println(SimpleDate.DateTime.toYYIn12Hours(date))
    println(SimpleDate.DateTime.toYYInDigits(date))
    println(SimpleDate.DateTime.toYYInDigitsAnd12Hours(date))
    println(SimpleDate.DateTime.toYYConcise(date))
    println(SimpleDate.DateTime.toYYConciseIn12Hours(date))
    println("-----------------------------------------")
    println(SimpleDate.Time.toStandard(date))
    println(SimpleDate.Time.toStandardWithoutSeconds(date))
    println(SimpleDate.Time.toStandardIn12Hours(date))
    println(SimpleDate.Time.toStandardIn12HoursWithoutSeconds(date))
    println("-----------------------------------------")
    println(SimpleDate.Date.toStandard(date))
    println(SimpleDate.Date.toStandardConcise(date))
    println(SimpleDate.Date.toStandardInDigits(date))
    println(SimpleDate.Date.toYY(date))
    println(SimpleDate.Date.toYYConcise(date))
    println(SimpleDate.Date.toYYInDigits(date))
    println("-----------------------------------------")
    println(SimpleDate.Day.toDay(date))*/
}

// -------------------------- DateTime --------------------------

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

// -------------------------- Time --------------------------

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

// -------------------------- Date --------------------------

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

// -------------------------- Day --------------------------

fun toDay(date: Date?): String {
    val pattern = "EEEE"
    return dateAsString(date, pattern)
}
// ---------------------------------------------------------

private fun dateAsString(date: Date?, pattern: String): String {
    simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
    if (date != null)
        return simpleDateFormat.format(date)
    else
        throw NullPointerException("Date can't be null")
}