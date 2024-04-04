package com.example.androidprojectone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class IndicatorCircularActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IndeterminateCircularIndicator()
                }
            }
        }
    }
}

@Composable
fun IndeterminateCircularIndicator() {
    var loading by remember { mutableStateOf(false) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { loading = true }, enabled = !loading) {
            Text("Start loading")
        }

        if (!loading) return

        CircularProgressIndicator(
            modifier = Modifier.width(64.dp),
            color = MaterialTheme.colorScheme.secondary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
        )
    }

}


@Preview(showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)
@Composable
fun IndeterminateCircularIndicatorPreview() {
    AndroidProjectOneTheme {
        IndeterminateCircularIndicator()
    }
}