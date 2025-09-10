package com.example.juan_sierra_2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyScreen()
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MyScreen(){
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.background(Color.Cyan).fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.background(Color.Yellow).weight(1f)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.background(Color.LightGray).weight(1f).fillMaxSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color(0xFFEADDFF))
                        .padding(16.dp).fillMaxSize()
                ) {
                    Text(
                        text = "Text Composable",
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify
                    )
                    Text(text = "Displays text and Follows the recommended Material Design guidelines", textAlign = TextAlign.Justify)
                }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.background(Color.LightGray).weight(1f).fillMaxSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color(0xFFB69DF8))
                        .padding(16.dp).fillMaxSize()
                ) {
                    Text(
                        text = "Row Composable",
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify
                    )
                    Text(text = "A layout composable that places its children in a horizontal sequence", textAlign = TextAlign.Justify)
                }
            }
        }
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.background(Color.Yellow).weight(1f)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.background(Color.LightGray).weight(1f).fillMaxSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color(0xFFD0BCFF))
                        .padding(16.dp).fillMaxSize()
                ) {
                    Text(
                        text = "Image composable",
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify
                    )
                    Text(text = "Create a composable that lays out and draws a given Painter class object", textAlign = TextAlign.Justify)
                }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.background(Color.LightGray).weight(1f).fillMaxSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.background(Color(0xFFF6EDFF))
                        .padding(16.dp).fillMaxSize()
                ) {
                    Text(
                        text = "Column Composable",
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify
                    )
                    Text(text = "A layout composable that places its children in a vertical sequence", textAlign = TextAlign.Justify)
                }
            }
        }


    }}