package br.com.fiap.welcomepage.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box {
        Text(text = "FIAP")
    }
}


@Preview
@Composable
private fun HomeScreenPreview() {

}