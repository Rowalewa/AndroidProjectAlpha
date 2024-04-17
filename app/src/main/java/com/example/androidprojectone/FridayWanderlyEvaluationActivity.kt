package com.example.androidprojectone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class FridayWanderlyEvaluationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImageBackground()
                }
            }
        }
    }
}
@Composable
fun ImageBackground(){
    Box {
        Image(painter = painterResource(id = R.drawable.car),
        contentDescription = "background",
        modifier = Modifier.fillMaxSize()
        )
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.align(alignment = Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Wanderly",
                color = Color.White,
                fontSize = 50.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(
                        start = 0.dp,
                        top = 22.dp,
                        end = 0.dp,
                        bottom = 0.dp
                    )
            )
            Text(
                text = "Your Ultimate Companion for Seamless Travel Experience",
                color = Color.White,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(400.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.width(320.dp),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ) {
                Text(text = "Sign in with Phone Number",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.width(320.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.AccountCircle,
                        contentDescription = "Localized description",
                        tint = Color.Blue,
                        modifier = Modifier.size(46.dp)
                    )
                    
                }
                Text(text = "Sign in with Apple",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Don't have an account? Sign Up",
                color = Color.White
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "By creating an account or signing in, you agree to our Terms of Service and Privacy Policy.",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                modifier = Modifier.padding(
                    start = 15.dp,
                    top = 0.dp,
                    bottom = 0.dp,
                    end = 15.dp
                )
            )


        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Preview")
@Composable
fun ProjectPreview() {
    AndroidProjectOneTheme {
        ImageBackground()
    }
}