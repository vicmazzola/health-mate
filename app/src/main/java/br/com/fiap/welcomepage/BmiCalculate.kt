package br.com.fiap.welcomepage

import kotlin.math.pow


fun bmiCalculate(weightUser: Double, heightUser: Double): Double{
    var bmi = weightUser / (heightUser / 100).pow(2)
    return bmi
}

fun getBmiStatus(userBmi: Double): String {
    return if (userBmi < 18.5) {
        "Underweight"
    } else if (userBmi >= 18.5 && userBmi < 25.0) {
        "Ideal Weight"
    } else if (userBmi >= 25.0 && userBmi < 30.0) {
        "Slightly Overweight"
    } else if (userBmi >= 30.0 && userBmi < 35.0) {
        "Obesity Grade I"
    } else if (userBmi >= 35.0 && userBmi < 40.0) {
        "Obesity Grade II"
    } else {
        "Obesity Grade III"
    }
}
