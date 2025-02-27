package br.com.fiap.welcomepage

import kotlin.math.pow


fun bmiCalculate(weightUser: Double, heightUser: Double): Double{
    var bmi = weightUser / (heightUser / 100).pow(2)
    return bmi
}