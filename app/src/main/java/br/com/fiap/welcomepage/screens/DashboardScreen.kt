package br.com.fiap.welcomepage.screens

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.welcomepage.R
import br.com.fiap.welcomepage.ui.theme.Montserrat

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {

    var text by remember {
        mutableStateOf("")
    }

    var age by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .background(color = Color(0xFF5783AF))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier =  Modifier
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
                text = "Dashboard",
                fontSize = 32.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = Montserrat

            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
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
                        // EMAIL TEXT FIELD
                        Text(
                            text = "Email",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat
                        )
                        TextField(
                            value = text,
                            onValueChange = { letter ->
                                text = letter
                            },
                            placeholder = {
                                Text(text = "name@example.com")
                            },
                            modifier = Modifier.fillMaxWidth(),
                            trailingIcon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.person_24),
                                    contentDescription = "Person Icon")
                            },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                        )
                        // DATE OF BIRTH TEXT FIELD
                        Text(
                            text = "Date of Birth",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat,
                            modifier = Modifier
                                .padding(top = 32.dp),
                        )
                        TextField(
                            value = age,
                            onValueChange = { letter ->
                                age = letter
                            },
                            placeholder = {
                                Text(text = "30/02/2000")
                            },
                            modifier = Modifier.fillMaxWidth(),
                            trailingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "Calendar")
                            },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = {},
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


@Preview(showSystemUi = true)
@Composable
private fun DashboardScreenPreview() {
    DashboardScreen()
}