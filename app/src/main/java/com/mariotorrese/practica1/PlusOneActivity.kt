package com.mariotorrese.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariotorrese.practica1.databinding.ActivityPlusOneBinding
import com.mariotorrese.practica1.databinding.ActivitySumarBinding

class PlusOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlusOneBinding
    val datosArray = mutableListOf(1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_plus_one)

        binding = ActivityPlusOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnResultado.setOnClickListener{
            val num1 = binding.txtOne.text.toString().toInt()
            val num2 = binding.txtTwo.text.toString().toInt()
            val num3 = binding.txtThree.text.toString().toInt()
            val num4 = binding.txtFour.text.toString().toInt()
            val num5 = binding.txtFive.text.toString().toInt()
            datosArray.clear()
            datosArray.add(num1)
            datosArray.add(num2)
            datosArray.add(num3)
            datosArray.add(num4)
            datosArray.add(num5)
            if (datosArray.last() < 9){
                datosArray[datosArray.lastIndex] = datosArray.last() + 1
                binding.txrResultado.text = datosArray.toString()
            }
            for (i in datosArray.lastIndex downTo 0) {
                datosArray[i]++
                if(datosArray[i] >= 10) {
                    datosArray[i] = 0
                } else {
                    binding.txrResultado.text = datosArray.toString()
                }
            }
        }
    }
}