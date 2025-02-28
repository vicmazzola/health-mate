package br.com.fiap.welcomepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.fiap.welcomepage.screens.DashboardScreen
import br.com.fiap.welcomepage.screens.HomeScreen
import br.com.fiap.welcomepage.screens.SkillsScreen
import br.com.fiap.welcomepage.ui.theme.WelcomePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomePageTheme {
                DashboardScreen()
                HomeScreen()
                SkillsScreen()
            }
        }
    }
}

