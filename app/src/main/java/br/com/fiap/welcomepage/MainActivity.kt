package br.com.fiap.welcomepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.welcomepage.screens.DashboardScreen
import br.com.fiap.welcomepage.screens.HomeScreen
import br.com.fiap.welcomepage.screens.SkillsScreen
import br.com.fiap.welcomepage.screens.WelcomeScreen
import br.com.fiap.welcomepage.ui.theme.WelcomePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomePageTheme {
            }
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "welcome") {
                composable(route = "welcome") {
                    WelcomeScreen(navController)
                }
                composable(route = "home") {
                    HomeScreen(navController)
                }
                composable(route = "dashboard") {
                    DashboardScreen(navController)
                }
                composable(route = "skills") {
                    SkillsScreen(navController)
                }
            }
        }
    }
}

