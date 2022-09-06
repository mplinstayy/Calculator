package com.example.calculatorintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    private lateinit var btnPlus:Button
    private lateinit var btnMinus:Button
    private lateinit var btnMultiply:Button
    private lateinit var btnDivide:Button
    private lateinit var btnRoot:Button

    private lateinit var firstNum:EditText
    private lateinit var secondNum:EditText
    private lateinit var calc:Calculate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlus = findViewById(R.id.buttonPlus)
        btnMinus = findViewById(R.id.buttonMinus)
        btnMultiply = findViewById(R.id.buttonMultiply)
        btnDivide = findViewById(R.id.buttonDivide)
        btnRoot = findViewById(R.id.buttonRoot)

        firstNum = findViewById(R.id.editTextNumber)
        secondNum = findViewById(R.id.editTextNumber2)


        btnPlus.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)

            val fNumFloat:Float = firstNum.text.toString().toFloat()
            val sNumFloat:Float = secondNum.text.toString().toFloat()

            val add = fNumFloat + sNumFloat
            intent.putExtra("data", add.toString())
            startActivity(intent)
        }

        btnMinus.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            val fNumFloat = firstNum.text.toString().toFloat()
            val sNumFloat = secondNum.text.toString().toFloat()

            val subtract = fNumFloat - sNumFloat
            intent.putExtra("data", subtract.toString())
            startActivity(intent)
        }
        btnMultiply.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            val fNumFloat = firstNum.text.toString().toFloat()
            val sNumFloat = secondNum.text.toString().toFloat()

            val multiply = fNumFloat*sNumFloat
            intent.putExtra("data", multiply.toString())
            startActivity(intent)
        }
        btnDivide.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            val fNumFloat = firstNum.text.toString().toFloat()
            val sNumFloat = secondNum.text.toString().toFloat()

            val divide = fNumFloat/sNumFloat
            intent.putExtra("data", divide.toString())
            startActivity(intent)
        }
        btnRoot.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            val fNumDouble = firstNum.text.toString().toDouble()
            val sNumDouble = secondNum.text.toString().toDouble()

            val root = fNumDouble.pow(1 / sNumDouble)
            intent.putExtra("data", root.toString())
            startActivity(intent)
        }
    }
}