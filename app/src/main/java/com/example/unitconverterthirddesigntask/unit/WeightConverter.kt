package com.example.unitconverterthirddesigntask.unit

import com.example.unitconverterthirddesigntask.enumclasses.LengthEnum
import com.example.unitconverterthirddesigntask.enumclasses.WeightEnum


fun String.toKilogram(number:Int):String{
    return when(this)
    {
        WeightEnum.KILOGRAM.name ->{
            number.toString()
        }
        WeightEnum.GRAM.name -> {
            (number.toDouble() * 1000).toDouble().toString()
        }
        WeightEnum.MILLIGRAM.name -> {
            (number.toDouble() * 1000000).toDouble().toString()
        }
        WeightEnum.POUND.name -> {
            (number.toDouble() * 0.453592).toDouble().toString()
        }else -> "NotingToShows"
    }
}
fun String.toGram(number:Int):String{
    return when(this)
    {
        WeightEnum.KILOGRAM.name ->{
            (number.toDouble() / 1000).toDouble().toString()
        }
        WeightEnum.GRAM.name -> {
            number.toString()
        }
        WeightEnum.MILLIGRAM.name -> {
            (number.toDouble() * 1000).toDouble().toString()
        }
        WeightEnum.POUND.name -> {
            (number.toDouble() / 453.592).toDouble().toString()
        }else -> "NotingToShows"
    }
}
fun String.toMilligram(number:Int):String{
    return when(this)
    {
        WeightEnum.KILOGRAM.name ->{
            (number.toDouble() / 1000000).toDouble().toString()
        }
        WeightEnum.GRAM.name -> {
            (number.toDouble() / 1000).toDouble().toString()
        }
        WeightEnum.MILLIGRAM.name -> {
            number.toString()
        }
        WeightEnum.POUND.name -> {
            (number.toDouble() / 453592).toDouble().toString()
        }else -> "NotingToShows"
    }
}
fun String.toPound(number:Int):String{
    return when(this)
    {
        WeightEnum.KILOGRAM.name ->{
            (number.toDouble() * 2.2046).toDouble().toString()
        }
        WeightEnum.GRAM.name -> {
            (number.toDouble() / 0.002204).toDouble().toString()
        }
        WeightEnum.MILLIGRAM.name -> {
            (number.toDouble() / 0.00000220).toDouble().toString()
        }
        WeightEnum.POUND.name -> {
            number.toString()
        }else -> "NotingToShows"
    }
}