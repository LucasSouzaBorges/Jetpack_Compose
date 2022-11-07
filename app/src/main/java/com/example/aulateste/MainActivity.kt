package com.example.aulateste

import android.os.Bundle
import android.os.Message
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text
import com.example.aulateste.ui.theme.AulaTesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Android")
        }
    }

    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard("Android")
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        AulaTesteTheme() {
            Greeting(name = "Android")
        }
    }
}