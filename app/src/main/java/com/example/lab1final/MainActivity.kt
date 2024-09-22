package com.example.lab1final

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1final.ui.theme.Lab1finalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1finalTheme {
                // Call your main composable here
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    // Mutable state for text and color
    var text by remember { mutableStateOf("Hello!") }
    var textColor by remember { mutableStateOf(Color.Black) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = text, color = textColor)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            text = "Button Clicked!"
        }) {
            Text("Click Me")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            textColor = Color.Yellow // Set the text color to yellow
        }) {
            Text("Change Color")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lab1finalTheme {
        MyApp()
    }
}
