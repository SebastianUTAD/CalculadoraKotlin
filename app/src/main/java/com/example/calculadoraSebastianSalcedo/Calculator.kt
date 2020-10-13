package com.example.calculadoraSebastianSalcedo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.calculadora.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)
        val objetoIntent: Intent = intent
        var user = objetoIntent.getStringExtra("user")
        setTitle("Bienvenido " + user);
    }

    fun buNumberEvent (view:View) {

        if (isNewOp==true){
            etResultadoNumeros.setText("")
        }
        isNewOp=false
        val buSelect= view as Button
        var buClickValue:String=etResultadoNumeros.text.toString()
        when(buSelect.id){
            bu1.id->{
                buClickValue+="1"
        }
            bu2.id->{
                buClickValue+="2"
            }
            bu3.id->{
                buClickValue+="3"
            }
            bu4.id->{
                buClickValue+="4"
            }
            bu5.id->{
                buClickValue+="5"
            }
            bu6.id->{
                buClickValue+="6"
            }
            bu7.id->{
                buClickValue+="7"
            }
            bu8.id->{
                buClickValue+="8"
            }
            bu9.id->{
                buClickValue+="9"
            }

            buPunto.id->{
                buClickValue+="."
            }
            bu0.id->{
                buClickValue+="0"
            }

        }
        etResultadoNumeros.setText(buClickValue)
    }

    var op="*"
    var oldNumbers=""
    var isNewOp=true
    fun buOpEvent(view:View){
        val buSelect= view as Button
        when(buSelect.id) {
            buMul.id -> {
                var op="*"
            }
            buDiv.id -> {
                var op="/"
            }
            buResta.id -> {
                var op="-"
            }
            buSuma.id -> {
                var op="+"
            }
        }
        oldNumbers=etResultadoNumeros.text.toString()
        isNewOp=true
    }
    fun buIgualEvent(view: View){
        val newNumber=etResultadoNumeros.text.toString()
        var numeroFinal:Double?=null
        when(op){
            "*"->{
                numeroFinal= oldNumbers.toDouble() *newNumber.toDouble()
            }
            "/"->{
                numeroFinal= oldNumbers.toDouble() /newNumber.toDouble()
            }
            "-"->{
                numeroFinal= oldNumbers.toDouble() -newNumber.toDouble()
            }
            "+"->{
                numeroFinal= oldNumbers.toDouble() +newNumber.toDouble()
            }
        }
        etResultadoNumeros.setText(numeroFinal.toString())
        isNewOp=true
    }
    fun buClean(view: View){
        etResultadoNumeros.setText("0")
        isNewOp=true
    }
}