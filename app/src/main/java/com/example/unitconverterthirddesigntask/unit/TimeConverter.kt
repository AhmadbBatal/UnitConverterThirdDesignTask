package com.example.unitconverterthirddesigntask.unit

import com.example.unitconverterthirddesigntask.enumclasses.TimeEnum

fun String.toSecond(int: Int): String {
    when (this) {
        TimeEnum.WEEK.name -> {
            return (int.toDouble() / 604800*1.0).toDouble().toString()
        }
        TimeEnum.DAY.name -> {
            return (int.toDouble() / 86400*1.0).toDouble().toString()
        }
        TimeEnum.MIN.name -> {
            return (int.toDouble() / 60*1.0).toDouble().toString()
        }
        TimeEnum.HOUR.name -> {
            return (int.toDouble() / 3600*1.0).toDouble().toString()
        }
        TimeEnum.SECOND.name -> {
            return int.toString()
        }
        else -> return ""
    }
}

fun String.toMin(int: Int): String {
    when (this) {
        TimeEnum.WEEK.name -> {
            return (int.toDouble() / 10080*1.0).toDouble().toString()
        }
        TimeEnum.DAY.name -> {
            return (int.toDouble() / 1440*1.0).toDouble().toString()
        }
        TimeEnum.MIN.name -> {
            return int.toString()
        }
        TimeEnum.HOUR.name -> {
            return (int.toDouble() / 60*1.0).toDouble().toString()
        }
        TimeEnum.SECOND.name -> {
            return (int * 60).toString()
        }
        else -> return ""
    }
}

fun String.toHour(int: Int): String {
    when (this) {
        TimeEnum.WEEK.name -> {
            return (int.toDouble() / 168*1.0).toDouble().toString()
        }
        TimeEnum.DAY.name -> {
            return (int.toDouble() / 24*1.0).toDouble().toString()
        }
        TimeEnum.MIN.name -> {
            return (int * 60).toString()
        }
        TimeEnum.HOUR.name -> {
            return int.toString()
        }
        TimeEnum.SECOND.name -> {
            return (int * 3600).toString()
        }
        else -> return ""
    }
}

fun String.toDay(int: Int): String {
    when (this) {
        TimeEnum.WEEK.name -> {
            return (int.toDouble() / 7*1.0).toDouble().toString()
        }
        TimeEnum.DAY.name -> {
            return int.toString()
        }
        TimeEnum.MIN.name -> {
            return (int * 1440).toString()
        }
        TimeEnum.HOUR.name -> {
            return (int * 24).toString()
        }
        TimeEnum.SECOND.name -> {
            return (int * 86400).toString()
        }
        else -> return ""
    }
}

fun String.toWeek(int: Int): String {
    when (this) {
        TimeEnum.WEEK.name -> {
            return int.toString()
        }
        TimeEnum.DAY.name -> {
            return (int * 7).toString()
        }
        TimeEnum.MIN.name -> {
            return (int * 10080).toString()
        }
        TimeEnum.HOUR.name -> {
            return (int * 168).toString()
        }
        TimeEnum.SECOND.name -> {
            return (int * 604800).toString()
        }
        else -> return ""
    }
}











