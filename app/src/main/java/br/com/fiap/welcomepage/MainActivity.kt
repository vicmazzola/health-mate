package br.com.fiap.welcomepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
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
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "welcome"
                ) {
                    composable(
                        route = "welcome",
                        enterTransition = {
                            slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = tween(500)) +
                                    fadeIn(animationSpec = tween(500))
                        },
                        exitTransition = {
                            slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = tween(500)) +
                                    fadeOut(animationSpec = tween(500))
                        }
                    ) {
                        WelcomeScreen(navController)
                    }

                    composable(
                        route = "home",
                        enterTransition = {
                            slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = tween(500)) +
                                    fadeIn(animationSpec = tween(500))
                        },
                        exitTransition = {
                            slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = tween(500)) +
                                    fadeOut(animationSpec = tween(500))
                        }
                    ) {
                        HomeScreen(navController)
                    }

                    composable(
                        route = "skills",
                        enterTransition = {
                            slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = tween(500)) +
                                    fadeIn(animationSpec = tween(500))
                        },
                        exitTransition = {
                            slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = tween(500)) +
                                    fadeOut(animationSpec = tween(500))
                        }
                    ) {
                        SkillsScreen(navController)
                    }

                    composable(
                        route = "dashboard/{name}",
                        enterTransition = {
                            slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = tween(500)) +
                                    fadeIn(animationSpec = tween(500))
                        },
                        exitTransition = {
                            slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = tween(500)) +
                                    fadeOut(animationSpec = tween(500))
                        }
                    ) {
                        val name = it.arguments?.getString("name") ?: "Guest"
                        DashboardScreen(navController, name)
                    }
                }
            }
        }
    }
}
