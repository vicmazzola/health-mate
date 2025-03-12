package br.com.fiap.welcomepage.home

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import br.com.fiap.welcomepage.R
import br.com.fiap.welcomepage.components.TextInput
import br.com.fiap.welcomepage.ui.theme.Montserrat

@Composable
fun HomeScreen(
    navController: NavController?,
    homeViewModel: HomeViewModel = viewModel()
) {

    val name = homeViewModel.name
    val email = homeViewModel.email
    val age = homeViewModel.age


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
                text = stringResource(R.string.home_fill_info),
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

                        // NAME TEXT FIELD
                        Text(
                            text = stringResource(R.string.home_name_label),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat
                        )
                        TextInput(
                            placeholder = stringResource(R.string.home_name_placeholder),
                            value = name,
                            onValueChange = { homeViewModel.onNameChange(it) },
                            keyboardType = KeyboardType.Text,
                            trailingIcon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.person_24),
                                    contentDescription = stringResource(R.string.icon_person)
                                )
                            }
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        // EMAIL TEXT FIELD
                        Text(
                            text = stringResource(R.string.home_email_label),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat
                        )
                        TextInput(
                            placeholder = stringResource(R.string.home_email_placeholder),
                            value = email,
                            onValueChange = { homeViewModel.onEmailChange(it) },
                            keyboardType = KeyboardType.Email,
                            trailingIcon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.person_24),
                                    contentDescription = stringResource(R.string.icon_person)
                                )
                            }
                        )

                        // DATE OF BIRTH TEXT FIELD
                        Text(
                            text = stringResource(R.string.home_birth_label),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Montserrat,
                            modifier = Modifier
                                .padding(top = 32.dp),
                        )
                        TextInput(
                            placeholder = stringResource(R.string.home_birth_placeholder),
                            value = age,
                            onValueChange = { homeViewModel.onAgeChange(it) },
                            keyboardType = KeyboardType.Number,
                            trailingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = stringResource(R.string.icon_calendar)
                                )
                            }
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = {
                                navController?.navigate("skills")
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5783AF))
                        ) {
                            Text(stringResource(R.string.home_next_button))
                        }
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(null)
}