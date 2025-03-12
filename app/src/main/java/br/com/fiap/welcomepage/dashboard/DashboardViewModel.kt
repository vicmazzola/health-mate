package br.com.fiap.welcomepage.ui.dashboard

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import br.com.fiap.welcomepage.bmiCalculate
import br.com.fiap.welcomepage.getBmiStatus

class DashboardViewModel : ViewModel() {

    var weight by mutableStateOf("")
        private set

    var height by mutableStateOf("")
        private set

    var bmi by mutableStateOf(0.0)
        private set

    var bmiStatus by mutableStateOf("")
        private set

    fun onWeightChange(newWeight: String) {
        weight = newWeight
    }

    fun onHeightChange(newHeight: String) {
        height = newHeight
    }

    fun calculateBmi() {
        val w = weight.toDoubleOrNull()
        val h = height.toDoubleOrNull()
        if (w != null && h != null) {
            bmi = bmiCalculate(w, h)
            bmiStatus = getBmiStatus(bmi)
        }
    }
}
