package com.parassidhu.simpledate

import java.text.SimpleDateFormat
import java.util.*

/*
fun main() {
    val date = Date()
    println(SimpleDate.DateTime.toStandard(date))
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
    println(SimpleDate.Day.toDay(date))
}
*/

object SimpleDate {

    private lateinit var simpleDateFormat: SimpleDateFormat

    object DateTime {

        fun toStandard(date: java.util.Date?): String {
            val pattern = "dd MMMMM yyyy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        fun toStandardIn12Hours(date: java.util.Date?): String {
            val pattern = "dd MMMMM yyyy h:mm:ss a"
            return dateAsString(date, pattern)
        }

        fun toStandardInDigits(date: java.util.Date?): String {
            val pattern = "dd-MM-yyyy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        fun toStandardInDigitsAnd12Hours(date: java.util.Date?): String {
            val pattern = "dd-MM-yyyy h:mm:ss a"
            return dateAsString(date, pattern)
        }

        fun toStandardConcise(date: java.util.Date?): String {
            val pattern = "dd MMM yyyy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        fun toStandardConciseIn12Hours(date: java.util.Date?): String {
            val pattern = "dd MMM yyyy h:mm:ss a"
            return dateAsString(date, pattern)
        }

        fun toYY(date: java.util.Date?): String {
            val pattern = "dd MMMMM yy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        fun toYYIn12Hours(date: java.util.Date?): String {
            val pattern = "dd MMMMM yy h:mm:ss a"
            return dateAsString(date, pattern)
        }

        fun toYYInDigits(date: java.util.Date?): String {
            val pattern = "dd-MM-yy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        fun toYYInDigitsAnd12Hours(date: java.util.Date?): String {
            val pattern = "dd-MM-yy h:mm:ss a"
            return dateAsString(date, pattern)
        }

        fun toYYConcise(date: java.util.Date?): String {
            val pattern = "dd MMM yy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        fun toYYConciseIn12Hours(date: java.util.Date?): String {
            val pattern = "dd MMM yy h:mm:ss a"
            return dateAsString(date, pattern)
        }
    }

    object Time {
        fun toStandard(date: java.util.Date?): String {
            val pattern = "HH:mm:ss"
            return dateAsString(date, pattern)
        }

        fun toStandardWithoutSeconds(date: java.util.Date?): String {
            val pattern = "HH:mm"
            return dateAsString(date, pattern)
        }

        fun toStandardIn12Hours(date: java.util.Date?): String {
            val pattern = "h:mm:ss a"
            return dateAsString(date, pattern)
        }

        fun toStandardIn12HoursWithoutSeconds(date: java.util.Date?): String {
            val pattern = "h:mm a"
            return dateAsString(date, pattern)
        }
    }

    object Date {
        fun toStandard(date: java.util.Date?): String {
            val pattern = "dd MMMMM YYYY"
            return dateAsString(date, pattern)
        }

        fun toStandardConcise(date: java.util.Date?): String {
            val pattern = "dd MMM yyyy"
            return dateAsString(date, pattern)
        }

        fun toStandardInDigits(date: java.util.Date?): String {
            val pattern = "dd-MM-yyyy"
            return dateAsString(date, pattern)
        }

        fun toYY(date: java.util.Date?): String {
            val pattern = "dd MMMMM yy"
            return dateAsString(date, pattern)
        }

        fun toYYConcise(date: java.util.Date?): String {
            val pattern = "dd MMM yy"
            return dateAsString(date, pattern)
        }

        fun toYYInDigits(date: java.util.Date?): String {
            val pattern = "dd-MM-yy"
            return dateAsString(date, pattern)
        }
    }

    object Day {
        fun toDay(date: java.util.Date?): String {
            val pattern = "EEEEE"
            return dateAsString(date, pattern)
        }
    }

    private fun dateAsString(date: java.util.Date?, pattern: String): String {
        simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
        if (date != null)
            return simpleDateFormat.format(date)
        else
            throw NullPointerException("Date can't be null")
    }
}
