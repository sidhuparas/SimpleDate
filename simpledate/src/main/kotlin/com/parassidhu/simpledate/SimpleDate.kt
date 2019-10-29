package com.parassidhu.simpledate

import java.text.SimpleDateFormat
import java.util.*

private lateinit var simpleDateFormat: SimpleDateFormat

/*fun main() {
    val date = Date()

    println(date.toDateTimeStandard())
    println(date.toDateTimeStandardIn12Hours())
    println(date.toDateTimeStandardInDigits())
    println(date.toDateTimeStandardInDigitsAnd12Hours())
    println(date.toDateTimeStandardConcise())
    println(date.toDateTimeStandardConciseIn12Hours())
    println(date.toDateTimeYY())
    println(date.toDateTimeYYIn12Hours())
    println(date.toDateTimeYYInDigits())
    println(date.toDateTimeYYInDigitsAnd12Hours())
    println(date.toDateTimeYYConcise())
    println(date.toDateTimeYYConciseIn12Hours())
    println(date.toZuluFormat())
    println("-----------------------------------------")
    println(date.toTimeStandard())
    println(date.toTimeStandardWithoutSeconds())
    println(date.toTimeStandardIn12Hours())
    println(date.toTimeStandardIn12HoursWithoutSeconds())
    println("-----------------------------------------")
    println(date.toDateStandard())
    println(date.toDateStandardConcise())
    println(date.toDateStandardInDigits())
    println(date.toDateYY())
    println(date.toDateYYConcise())
    println(date.toDateYYInDigits())
    println(date.toDateYMD())
    println(date.toDateYMDConcise())
    println(date.toDateYMDInDigits())
    println(date.toDateEMd())
    println(date.toDateEMYShort())
    println(date.toDateEMY())
    println("-----------------------------------------")
    println(date.toDay())
}*/

internal fun dateAsString(date: Date?, pattern: String): String {
    simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
    if (date != null)
        return simpleDateFormat.format(date)
    else
        throw NullPointerException("Date can't be null")
}
