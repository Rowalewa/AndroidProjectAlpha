package com.example.androidprojectone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListScreen()
                    Column (
                        verticalArrangement = Arrangement.Bottom
                    ){
                        Button(onClick = {
                            val intent = Intent(this@ScrollActivity, MainActivity::class.java)
                            startActivity(intent)
                        },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(Color.Blue)) {
                            Text(
                                text = "Back",
                                fontSize = 30.sp,
                                color = Color.Yellow,
                                modifier = Modifier.padding(10.dp)
                            )

                        }
                    }
                }
            }
        }
    }
}
@Composable
fun ListScreen(){
    Box (){
        Image(modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.tiger),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
            )
        Box (
            modifier = Modifier
                .background(color= Color.Transparent),
            contentAlignment = Alignment.Center,
        ){
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
            ) {
                Text(
                    text = "Hello",
                    fontSize = 50.sp,
                    color = Color.Green,
                    textAlign = TextAlign.Center
                )

            }
        }
    }
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        LazyRow (){
            items(count = 100){
                item->
                Text(text = "$item")
            }

        }
        LazyColumn (modifier = Modifier.padding(
            start = 200.dp,
            top = 16.dp,
            end = 16.dp,
            bottom = 16.dp
        ).background(color = Color.Green)
            .width(50.dp)){
            items(count = 100){
                    item->
                Text(text = "$item",
                    color = Color.Red,
                    textAlign = TextAlign.Center)
            }

        }

    }

}
@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)
@Composable
fun ListScreenPreview(){
    ListScreen()

}