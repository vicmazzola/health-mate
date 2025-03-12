package br.com.fiap.welcomepage.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var name by mutableStateOf("")
        private set

    var email by mutableStateOf("")
        private set

    var age by mutableStateOf("")
        private set


    fun onNameChange(newName: String) {
        name = newName
    }

    fun onEmailChange(newEmail: String) {
        email = newEmail
    }

    fun onAgeChange(newAge: String) {
        age = newAge
    }


}