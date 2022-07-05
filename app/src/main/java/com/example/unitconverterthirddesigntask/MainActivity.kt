package com.example.unitconverterthirddesigntask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unitconverterthirddesigntask.databinding.ActivityMainBinding
import com.example.unitconverterthirddesigntask.unit.Constant

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClickAnyButton()
    }

    fun onClickAnyButton(){
        val intent = Intent(this,MainActivity2::class.java)

        binding.apply {

            oneOne.setOnClickListener {
                intent.putExtra(Constant.Translate_Intent_Key,Constant.TIME)
                startActivity(intent)
            }

            oneTwo.setOnClickListener {
                intent.putExtra(Constant.Translate_Intent_Key,Constant.WEIGHT)
                startActivity(intent)
            }

            twoOne.setOnClickListener {
                intent.putExtra(Constant.Translate_Intent_Key,Constant.AREA)
                startActivity(intent)
            }

            twoTwo.setOnClickListener {
                intent.putExtra(Constant.Translate_Intent_Key,Constant.TEMPERATURE)
                startActivity(intent)
            }

            twoThree.setOnClickListener {
                intent.putExtra(Constant.Translate_Intent_Key,Constant.LENGTH)
                startActivity(intent)
            }

        }

    }

}