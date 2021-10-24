package com.mariotorrese.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mariotorrese.practica1.databinding.ActivitySumarBinding

class SumarActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySumarBinding
    val datosArray = mutableListOf(1)
    var target = 0
    var datos = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sumar)
        binding = ActivitySumarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSumar.setOnClickListener {
            val num1: Int = binding.txtUno.text.toString().toInt()
            val num2 = binding.txtDos.text.toString().toInt()
            val num3 = binding.txtTres.text.toString().toInt()
            val num4 = binding.txtCuatro.text.toString().toInt()
            val num5 = binding.txtCinco.text.toString().toInt()
            target = binding.txtTarget.text.toString().toInt()
            datosArray.clear()
            datosArray.add(num1)
            datosArray.add(num2)
            datosArray.add(num3)
            datosArray.add(num4)
            datosArray.add(num5)
            for(i in datosArray.indices){
                for(j in i+1 until datosArray.size){
                    if(datosArray[i] + datosArray[j] == target){
                        binding.txtResU.text = datosArray.elementAt(i).toString()
                        binding.txtResD.text = datosArray.elementAt(j).toString()
                        binding.txtPos1.text = i.toString()
                        binding.txtPos2.text = j.toString()
                        Toast.makeText(this, "${datosArray.elementAt(i)} ${datosArray.elementAt(j)}", Toast.LENGTH_SHORT).show()
                    }
                        //datos = intArrayOf(i, j).toString()
                            //return intArrayOf(i, j)
                }
            }
            //val datos = datosArray.toString()
            //binding.lblResultado.text = datos
        }
    }


}