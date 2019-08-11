package com.parassidhu.simpledate

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    println(SimpleDate.DateTime.toStandardWithDay(Date()))
    println(SimpleDate.DateTime.toStandardWithoutDay(Date()))
    println(SimpleDate.DateTime.toDateTimeAndMonthInDigits(Date()))

    println(SimpleDate.Time.toStandardTime(Date()))
    println(SimpleDate.Time.toStandardTimeIn12Hours(Date()))

    println(SimpleDate.Time.toStandardTimeWithoutSeconds(Date()))
    println(SimpleDate.Time.toStandardTimeIn12HoursWithoutSeconds(Date()))

}

object SimpleDate {

    private lateinit var simpleDateFormat: SimpleDateFormat

    object DateTime {

        fun toStandardWithDay(date: Date?): String {
            val pattern = "EEEEE dd MMMMM yyyy HH:mm:ss"
            simpleDateFormat = SimpleDateFormat(pattern)

            return dateAsString(date)
        }

        fun toStandardWithoutDay(date: Date?): String {
            val pattern = "dd MMMMM yyyy HH:mm:ss"
            simpleDateFormat = SimpleDateFormat(pattern)

            return dateAsString(date)
        }

        fun toDateTimeAndMonthInDigits(date: Date?): String {
            val pattern = "dd-MM-yyyy HH:mm:ss"
            simpleDateFormat = SimpleDateFormat(pattern)

            return dateAsString(date)
        }
    }

    object Time {
        fun toStandardTime(date: Date?): String {
            val pattern = "HH:mm:ss"
            simpleDateFormat = SimpleDateFormat(pattern)

            return dateAsString(date)
        }

        fun toStandardTimeWithoutSeconds(date: Date?): String {
            val pattern = "HH:mm"
            simpleDateFormat = SimpleDateFormat(pattern)

            return dateAsString(date)
        }

        fun toStandardTimeIn12Hours(date: Date?): String {
            val pattern = "h:mm:ss"
            simpleDateFormat = SimpleDateFormat(pattern)

            return dateAsString(date)
        }

        fun toStandardTimeIn12HoursWithoutSeconds(date: Date?): String {
            val pattern = "h:mm"
            simpleDateFormat = SimpleDateFormat(pattern)

            return dateAsString(date)
        }
    }

    private fun dateAsString(date: Date?): String {
        if (date != null)
            return simpleDateFormat.format(date)
        else
            throw NullPointerException("Date can't be null")
    }
}
