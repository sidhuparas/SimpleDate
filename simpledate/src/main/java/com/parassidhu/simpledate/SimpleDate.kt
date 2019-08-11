package com.parassidhu.simpledate

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    println(SimpleDate.DateTime.toStandardWithDay(Date()))
    println(SimpleDate.DateTime.toStandardWithoutDay(Date()))
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

    }

    private fun dateAsString(date: Date?): String {
        if (date != null)
            return simpleDateFormat.format(date)
        else
            throw NullPointerException("Date can't be null")
    }
}
