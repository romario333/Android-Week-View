package com.alamkanak.weekview

import java.util.Calendar

/**
 * Created by Raquib on 1/6/2015.
 */
interface DateTimeInterpreter {
    fun interpretDate(date: Calendar): String

    fun interpretTime(hour: Int, minutes: Int): String
}
