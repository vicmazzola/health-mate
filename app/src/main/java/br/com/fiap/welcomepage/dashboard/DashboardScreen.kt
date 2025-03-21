package br.com.fiap.welcomepage.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import br.com.fiap.welcomepage.R
import br.com.fiap.welcomepage.components.TextInput
import br.com.fiap.welcomepage.ui.theme.Montserrat
import br.com.fiap.welcomepage.ui.dashboard.DashboardViewModel
import java.util.Locale

@Composable
fun DashboardScreen(
    navController: NavController?,
    name: String?,
    dashboardViewModel: DashboardViewModel = viewModel()
) {
    // Observe ViewModel states
    val weight = dashboardViewModel.weight
    val height = dashboardViewModel.height
    val bmi = dashboardViewModel.bmi
    val bmiStatus = dashboardViewModel.bmiStatus

    Box(
        modifier = Modifier
            .background(colorResource(id = R.color.primary_color))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.runner),
                contentDescription = "Runner Image",
                modifier = Modifier.padding(top = 60.dp)
            )
            Text(
                text = stringResource(R.string.dashboard_title),
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = Montserrat
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp),
                shape = RoundedCornerShape(topStart = 64.dp, topEnd = 64.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(28.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = stringResource(R.string.dashboard_weight_label),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat
                        )
                        TextInput(
                            value = weight,
                            onValueChange = { dashboardViewModel.onWeightChange(it) },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = stringResource(R.string.dashboard_weight_placeholder),
                            keyboardType = KeyboardType.Number,
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = stringResource(R.string.dashboard_height_label),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat
                        )

                        TextInput(
                            value = height,
                            onValueChange = { dashboardViewModel.onHeightChange(it) },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = stringResource(R.string.dashboard_height_placeholder),
                            keyboardType = KeyboardType.Number,
                        )
                    }

                    Button(
                        onClick = { dashboardViewModel.calculateBmi() },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5783AF))
                    ) {
                        Text(stringResource(R.string.dashboard_calculate_button))
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    // Show BMI result
                    Text(
                        text = String.format(Locale.getDefault(), stringResource(R.string.dashboard_bmi_result), bmi),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Montserrat
                    )

                    // Spacer for separation
                    Spacer(modifier = Modifier.height(2.dp))

                    // Show BMI status (Underweight, Ideal Weight, etc.)
                    Text(
                        text = bmiStatus,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Montserrat,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}
