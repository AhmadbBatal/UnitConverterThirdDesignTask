package com.example.unitconverterthirddesigntask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unitconverterthirddesigntask.databinding.ActivityMain2Binding
import com.example.unitconverterthirddesigntask.enumclasses.LengthEnum
import com.example.unitconverterthirddesigntask.enumclasses.TimeEnum
import com.example.unitconverterthirddesigntask.enumclasses.WeightEnum
import com.example.unitconverterthirddesigntask.unit.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    private var firstSpinnerItem = TimeEnum.SECOND.name
    private var secondSpinnerItem = TimeEnum.SECOND.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainIntent = Intent(this, MainActivity::class.java)

        binding.apply {

            backImg.setOnClickListener {
                startActivity(mainIntent)
            }

            val unitKind = intent.getStringExtra(Constant.Translate_Intent_Key) ?: "Time"
            txtTitle.text = unitKind

            unitInsideSpinner(unitKind)

            binConvert.setOnClickListener {
                onConverterClick(unitKind)
            }
        }
    }

    private fun unitInsideSpinner(unitKind: String) {
        binding.apply {
            when (unitKind) {
                Constant.TIME -> {
                    spinnerFirstConverter.setItems(timeList)
                    spinnerSecondConverter.setItems(timeList)
                    spinnerFirstConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        firstSpinnerItem = newItem
                    }

                    spinnerSecondConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        secondSpinnerItem = newItem
                    }
                }
                Constant.WEIGHT -> {
                    spinnerFirstConverter.setItems(weightList)
                    spinnerSecondConverter.setItems(weightList)
                    spinnerFirstConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        firstSpinnerItem = newItem
                    }

                    spinnerSecondConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        secondSpinnerItem = newItem
                    }
                }
                Constant.AREA -> {
                    spinnerFirstConverter.setItems(areaList)
                    spinnerSecondConverter.setItems(areaList)
                    spinnerFirstConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        firstSpinnerItem = newItem
                    }

                    spinnerSecondConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        secondSpinnerItem = newItem
                    }
                }
                Constant.LENGTH -> {
                    spinnerFirstConverter.setItems(lengthList)
                    spinnerSecondConverter.setItems(lengthList)
                    spinnerFirstConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        firstSpinnerItem = newItem
                    }

                    spinnerSecondConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        secondSpinnerItem = newItem
                    }
                }

                Constant.TEMPERATURE -> {
                    spinnerFirstConverter.setItems(temperatureList)
                    spinnerSecondConverter.setItems(temperatureList)
                    spinnerFirstConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        firstSpinnerItem = newItem
                    }

                    spinnerSecondConverter.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
                        secondSpinnerItem = newItem
                    }
                }
            }
        }
    }

    private fun onConverterClick(unitKind: String) {
        binding.apply {
            val getNumber = editNumber.text.toString().toInt()
            when (unitKind) {
                Constant.TIME -> {
                    when (firstSpinnerItem) {
                        TimeEnum.WEEK.name -> txtNumber.text = secondSpinnerItem.toWeek(getNumber)
                        TimeEnum.DAY.name -> txtNumber.text = secondSpinnerItem.toDay(getNumber)
                        TimeEnum.HOUR.name -> txtNumber.text = secondSpinnerItem.toHour(getNumber)
                        TimeEnum.MIN.name -> txtNumber.text = secondSpinnerItem.toMin(getNumber)
                        TimeEnum.SECOND.name -> txtNumber.text = secondSpinnerItem.toSecond(getNumber)
                    }
                }
                Constant.WEIGHT -> {
                    when (firstSpinnerItem) {
                        WeightEnum.KILOGRAM.name -> txtNumber.text = secondSpinnerItem.toKilogram(getNumber)
                        WeightEnum.POUND.name -> txtNumber.text = secondSpinnerItem.toPound(getNumber)
                        WeightEnum.MILLIGRAM.name -> txtNumber.text = secondSpinnerItem.toMilligram(getNumber)
                        WeightEnum.GRAM.name -> txtNumber.text = secondSpinnerItem.toGram(getNumber)
                    }
                }
                Constant.AREA -> {

                }
                Constant.LENGTH -> {
                    when (secondSpinnerItem) {
                        LengthEnum.MILE.name -> txtNumber.text = firstSpinnerItem.toMile(getNumber)
                        LengthEnum.KILOMETER.name -> txtNumber.text = firstSpinnerItem.toKilometer(getNumber)
                        LengthEnum.METER.name -> txtNumber.text = firstSpinnerItem.toMeter(getNumber)
                        LengthEnum.YARD.name -> txtNumber.text = firstSpinnerItem.toYard(getNumber)
                        LengthEnum.CENTIMETER.name -> txtNumber.text = firstSpinnerItem.toCentimeter(getNumber)
                    }
                }
                Constant.TEMPERATURE -> {

                }
            }
        }
    }
}