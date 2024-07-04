package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant(
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(
        Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Row(Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
                    .alignBy { it.measuredHeight }
                    .background(Color(0xFFEADDFF))
                    .align(Alignment.CenterVertically)
            ) {
                Column(
                    modifier = modifier.padding(16.dp)
                        .align(Alignment.Center),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Text composable",
                        modifier = modifier.padding(16.dp).fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Displays text and follows the recommended Material Design guidelines.",
                        textAlign = TextAlign.Start
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .alignBy { it.measuredHeight }
                    .background(Color(0xFFD0BCFF))
            ) {
                Column(
                    modifier = modifier.padding(16.dp)
                        .align(Alignment.Center),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Image composable",
                        modifier = modifier.padding(16.dp).fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Creates a composable that lays out and draws a given Painter class object.",
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
        Row(Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight()
                    .alignBy { it.measuredHeight }
                    .background(Color(0xFFD0BCFF))
            ) {
                Column(
                    modifier = modifier.padding(16.dp)
                        .align(Alignment.Center),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Row composable",
                        modifier = modifier.padding(16.dp).fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "A layout composable that places its children in a horizontal sequence.",
                        textAlign = TextAlign.Start
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .alignBy { it.measuredHeight }
                    .background(Color(0xFFEADDFF))
            ) {
                Column(
                    modifier = modifier.padding(16.dp)
                        .align(Alignment.Center),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Column composable",
                        modifier = modifier.padding(16.dp).fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "A layout composable that places its children in a vertical sequence.",
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}