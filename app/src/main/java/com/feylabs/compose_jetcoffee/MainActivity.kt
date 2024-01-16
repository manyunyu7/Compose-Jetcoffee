package com.feylabs.compose_jetcoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.feylabs.compose_jetcoffee.components.Banner
import com.feylabs.compose_jetcoffee.ui.theme.ComposeJetcoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeJetcoffeeTheme {
                JetCoffeeApp()
            }
        }
    }
}

@Composable()
fun JetCoffeeApp() {
    Column {
        Banner()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JetCoffeeAppPreview() {
    ComposeJetcoffeeTheme {
        JetCoffeeApp()
    }
}