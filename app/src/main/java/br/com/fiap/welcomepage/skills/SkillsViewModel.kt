package br.com.fiap.welcomepage.skills

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SkillsViewModel : ViewModel() {

    var running by mutableStateOf(false)
        private set


    var cycling by mutableStateOf(false)
        private set

    var swimming by mutableStateOf(false)
        private set

    var weightlifting by mutableStateOf(false)
        private set

    var hiit by mutableStateOf(false)
        private set

    fun onRunningChange(isSelected: Boolean) {
        running = isSelected
    }

    fun onCyclingChange(isSelected: Boolean) {
        cycling = isSelected
    }

    fun onSwimmingChange(isSelected: Boolean) {
        swimming = isSelected
    }

    fun onWeightliftingChange(isSelected: Boolean) {
        weightlifting = isSelected
    }

    fun onHiitChange(isSelected: Boolean) {
        hiit = isSelected
    }


}