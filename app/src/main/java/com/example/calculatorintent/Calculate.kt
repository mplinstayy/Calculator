package com.example.calculatorintent

import kotlin.math.pow
import kotlin.math.sqrt

class Calculate {
    fun add (first_num:Float, second_num:Float):Float{
        return first_num+second_num
    }
    fun subtract (first_num:Float, second_num:Float):Float{
        return first_num-second_num
    }
    fun multiply (first_num:Float, second_num:Float):Float{
        return first_num*second_num
    }
    fun divide (first_num:Float, second_num:Float):Float{
        return first_num/second_num
    }
    fun root (first_num:Double, second_num:Double):Double{
        return first_num.pow(1 / second_num)
    }
}