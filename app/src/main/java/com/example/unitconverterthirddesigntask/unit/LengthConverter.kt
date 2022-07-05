package com.example.unitconverterthirddesigntask.unit

import com.example.unitconverterthirddesigntask.enumclasses.LengthEnum

fun String.toKilometer(number:Int) : String{
    when(this)
    {
        LengthEnum.KILOMETER.name ->{
            return number.toString()
        }
        LengthEnum.METER.name -> {
            return (number.toDouble() / 1000).toDouble().toString()
        }
        LengthEnum.CENTIMETER.name -> {
            return (number.toDouble() / 100000).toDouble().toString()
        }
        LengthEnum.MILE.name -> {
            return (number.toDouble() * 0.6213).toDouble().toString()
        }
        LengthEnum.YARD.name -> {
            return (number.toDouble() / 0.0009144).toDouble().toString()
        }else ->return "NotingToShows"
    }
}
fun String.toMeter(number:Int) : String{
    when(this)
    {
        LengthEnum.KILOMETER.name ->{
            return (number.toDouble() * 1000).toDouble().toString()
        }
        LengthEnum.METER.name -> {
            return number.toString()
        }
        LengthEnum.CENTIMETER.name -> {
            return (number.toDouble() / 0.01).toDouble().toString()
        }
        LengthEnum.MILE.name -> {
            return (number.toDouble() / 1609.35).toDouble().toString()
        }
        LengthEnum.YARD.name -> {
            return (number.toDouble() / 0.9144).toDouble().toString()
        }else ->return "NotingToShows"
    }
}
fun String.toCentimeter(number:Int) : String{
    when(this)
    {
        LengthEnum.KILOMETER.name ->{
            return (number.toDouble() * 100000).toDouble().toString()
        }
        LengthEnum.METER.name -> {
            return (number.toDouble() * 100).toDouble().toString()
        }
        LengthEnum.CENTIMETER.name -> {
            return number.toString()
        }
        LengthEnum.MILE.name -> {
            return (number.toDouble() * 160935).toDouble().toString()
        }
        LengthEnum.YARD.name -> {
            return (number.toDouble() * 91.44).toDouble().toString()
        }else ->return "NotingToShows"
    }
}
fun String.toMile(number:Int) : String{
    when(this)
    {
        LengthEnum.KILOMETER.name ->{
            return (number.toDouble() / 0.6213688756).toDouble().toString()
        }
        LengthEnum.METER.name -> {
            return (number.toDouble() / 0.0006213689).toDouble().toString()
        }
        LengthEnum.CENTIMETER.name -> {
            return (number.toDouble() / 0.0000062137).toDouble().toString()
        }
        LengthEnum.MILE.name -> {
            return number.toString()
        }
        LengthEnum.YARD.name -> {
            return (number.toDouble() / 0.0005681797).toDouble().toString()
        }else ->return "NotingToShows"
    }
}
fun String.toYard(number:Int) : String{
    when(this)
    {
        LengthEnum.KILOMETER.name ->{
            return (number.toDouble() * 1093.61).toDouble().toString()
        }
        LengthEnum.METER.name -> {
            return (number.toDouble() * 1.0936).toDouble().toString()
        }
        LengthEnum.CENTIMETER.name -> {
            return (number.toDouble() / 0.010936).toDouble().toString()
        }
        LengthEnum.MILE.name -> {
            return (number.toDouble() * 1760.006).toDouble().toString()
        }
        LengthEnum.YARD.name -> {
            return number.toString()
        }else ->return "NotingToShows"
    }
}