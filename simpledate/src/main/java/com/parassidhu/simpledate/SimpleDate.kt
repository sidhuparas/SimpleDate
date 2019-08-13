package com.parassidhu.simpledate

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val date = Date()

    println(SimpleDate.Date.toStandard(date))
    println(SimpleDate.Date.toStandardConcise(date))
    println(SimpleDate.Date.toStandardInDigits(date))

    println(SimpleDate.DateTime.toStandardIn12Hours(date))

/* println(SimpleDate.DateTime.toStandardIn12Hours(date))
println(SimpleDate.DateTime.toStandardInDigitsAnd12Hours(date))
println(SimpleDate.DateTime.toStandardConciseIn12Hours(date))*/
}

object SimpleDate {

    private lateinit var simpleDateFormat: SimpleDateFormat

    object DateTime {

        // Output: 13 August 2019 13:12:15
        fun toStandard(date: java.util.Date?): String {
            val pattern = "dd MMMMM yyyy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        //13 August 2019 1:34:19
        fun toStandardIn12Hours(date: java.util.Date?): String {
            val pattern = "dd MMMMM yyyy h:mm:ss a"
            return dateAsString(date, pattern)
        }

        // Output: 13-08-2019 13:12:43
        fun toStandardInDigits(date: java.util.Date?): String {
            val pattern = "dd-MM-yyyy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        // 13-08-2019 1:34:19
        fun toStandardInDigitsAnd12Hours(date: java.util.Date?): String {
            val pattern = "dd-MM-yyyy h:mm:ss a"
            return dateAsString(date, pattern)
        }

        // Output: 13 Aug 2019 13:15:00
        fun toStandardConcise(date: java.util.Date?): String {
            val pattern = "dd MMM yyyy HH:mm:ss"
            return dateAsString(date, pattern)
        }

        // 13 Aug 2019 1:34:19
        fun toStandardConciseIn12Hours(date: java.util.Date?): String {
            val pattern = "dd MMM yyyy h:mm:ss a"
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
