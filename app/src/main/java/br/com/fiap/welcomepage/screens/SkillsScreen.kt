package br.com.fiap.welcomepage.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.welcomepage.R
import br.com.fiap.welcomepage.ui.theme.Montserrat

@Composable
fun SkillsScreen(navController: NavController) {

    var running by remember {
        mutableStateOf(false)
    }

    var cycling by remember {
        mutableStateOf(false)
    }

    var swimming by remember {
        mutableStateOf(false)
    }

    var weightlifting by remember {
        mutableStateOf(false)
    }

    var hiit by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .background(colorResource(id = R.color.primary_color))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.runner),
                contentDescription = "Runner Image",
                modifier = Modifier
                    .padding(top = 60.dp)
            )
            Text(
                text = "Skills",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = Montserrat

            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp),
                shape = RoundedCornerShape(
                    topStart = 64.dp,
                    topEnd = 64.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(28.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.End
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        // CHECKBOX SKILLS
                        Text(
                            text = "Select your skills",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        // RUNNING
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Checkbox(
                                checked = running,
                                onCheckedChange = { isSelected ->
                                    running = isSelected
                                },
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF03A9F4),
                                    uncheckedColor = Color(0xFF4B4B4B),
                                    checkmarkColor = Color.White
                                )
                            )
                            Text(
                                text = "Running",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = Montserrat,
                            )
                        }
                        // CYCLING
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Checkbox(
                                checked = cycling,
                                onCheckedChange = { isSelected ->
                                    cycling = isSelected
                                },
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF03A9F4),
                                    uncheckedColor = Color(0xFF4B4B4B),
                                    checkmarkColor = Color.White
                                )
                            )
                            Text(
                                text = "Cycling",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = Montserrat,
                            )
                        }
                        // SWIMMING
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Checkbox(
                                checked = swimming,
                                onCheckedChange = { isSelected ->
                                    swimming = isSelected
                                },
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF03A9F4),
                                    uncheckedColor = Color(0xFF4B4B4B),
                                    checkmarkColor = Color.White
                                )
                            )
                            Text(
                                text = "Swimming",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = Montserrat,
                            )
                        }
                        // WEIGHTLIFTING
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Checkbox(
                                checked = weightlifting,
                                onCheckedChange = { isSelected ->
                                    weightlifting = isSelected
                                },
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF03A9F4),
                                    uncheckedColor = Color(0xFF4B4B4B),
                                    checkmarkColor = Color.White
                                )
                            )
                            Text(
                                text = "Weightlifting",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = Montserrat,
                            )
                        }
                        // HIIT
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Checkbox(
                                checked = hiit,
                                onCheckedChange = { isSelected ->
                                    hiit = isSelected
                                },
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF03A9F4),
                                    uncheckedColor = Color(0xFF4B4B4B),
                                    checkmarkColor = Color.White
                                )
                            )
                            Text(
                                text = "HIIT Workout",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = Montserrat,
                            )
                        }
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = {
                                navController.navigate("dashboard/Victor")
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5783AF))
                        ) {
                            Text("Next")
                        }
                    }
                }
            }
        }
    }
}

//
//@Preview(showSystemUi = true)
//@Composable
//private fun SkillsScreenPreview() {
//    SkillsScreen()
//}