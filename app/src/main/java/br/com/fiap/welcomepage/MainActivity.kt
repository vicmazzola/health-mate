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
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomePageTheme {
            }
            val navController = rememberAnimatedNavController()
            AnimatedNavHost(
                navController = navController,
                startDestination = "welcome") {
                composable(route = "welcome") {
                    WelcomeScreen(navController)
                }
                composable(route = "home") {
                    HomeScreen(navController)
                }
                composable(route = "skills") {
                    SkillsScreen(navController)
                }
                composable(route = "dashboard/{name}") {
                    val name = it.arguments?.getString("name")
                    DashboardScreen(navController, name!!)
                }
            }
        }
    }
}

