package com.example.androidprojectone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class LogInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(modifier = Modifier
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(width = 2.dp, color = Color.Magenta)
                        .background(color = Color.Green)) {  // rounded corner shape is border radius
//        HelloClient("Samuel")
//        SecondLine()
//        ThirdLine()
                        ImageContent()
                        TextComponent(value = "Welcome \uD83D\uDE42",
                            20.sp,
                            Color.Black,
                            FontFamily.Monospace,
                            FontWeight.SemiBold,
                            TextAlign.Center)
//        TextComponent(value = "Let's Begin",
//            15.sp,
//            Color.Red,
//            FontFamily.Cursive,
//            FontWeight.Light,
//            TextAlign.Center)
                        TextComponent(value = "Please Log in",
                            15.sp,
                            Color.Green,
                            FontFamily.Default,
                            FontWeight.Light,
                            TextAlign.Center)
//                        Spacer(modifier = Modifier.height(20.dp))
//                        TextFieldComponent("Enter your name")
                        Spacer(modifier = Modifier.height(10.dp))
                        TextFieldComponent("Enter your email address")
                        Spacer(modifier = Modifier.height(10.dp))
                        TextFieldComponent("Enter your Password")
                        Spacer(modifier = Modifier.height(10.dp))
//                        TextFieldComponent("Enter your Age")
//                        Spacer(modifier = Modifier.height(30.dp))
                        CheckboxComponent(value = "I confirm to have read and agreed to the privacy policy and rules and regulations")
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(onClick = {
                                         val intent = Intent(this@LogInActivity, MainActivity::class.java)
                            startActivity(intent)
                        },
                            modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "Back to Register",
                                fontSize = 40.sp,
                                modifier = Modifier.padding(10.dp)
                            )

                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Log In",
                                fontSize = 40.sp,
                                color = Color.Blue,
                                modifier = Modifier.padding(10.dp)
                            )

                        }
                        ImageComponent()
//        Row {
//            TextComponent(value = "Happy Sabbath: ",
//                15.sp,
//                Color.Magenta,
//                FontFamily.Serif,
//                FontWeight.Light,
//                TextAlign.Center)
//            TextComponent(value = "Happy Day",
//                15.sp,
//                Color.Cyan,
//                FontFamily.SansSerif,
//                FontWeight.Light,
//                TextAlign.Center)
//        }
                    }
                }
            }
        }
    }
}
@Preview(
    showSystemUi = true,
    showBackground = true,
    name = "My Log in Preview"
)
@Composable
fun LogInPreview(){
    Column(modifier = Modifier
        .clip(shape = RoundedCornerShape(20.dp))
        .border(width = 2.dp, color = Color.Magenta)
        .background(color = Color.Green)) {  // rounded corner shape is border radius
//        HelloClient("Samuel")
//        SecondLine()
//        ThirdLine()
        ImageContent()
        TextComponent(value = "Welcome, \uD83D\uDE42",
            20.sp,
            Color.Black,
            FontFamily.Monospace,
            FontWeight.Light,
            TextAlign.Center)
//        TextComponent(value = "Let's Begin",
//            15.sp,
//            Color.Red,
//            FontFamily.Cursive,
//            FontWeight.Light,
//            TextAlign.Center)
        TextComponent(value = "Please log in",
            15.sp,
            Color.Magenta,
            FontFamily.Default,
            FontWeight.SemiBold,
            TextAlign.Center)
//        Spacer(modifier = Modifier.height(20.dp))
//        TextFieldComponent("Enter your name")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent("Enter your email address")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent("Enter your Password")
        Spacer(modifier = Modifier.height(10.dp))
//        TextFieldComponent("Enter your Age")
//        Spacer(modifier = Modifier.height(30.dp))
        CheckboxComponent(value = "I confirm to have read and agreed to the privacy policy and rules and regulations")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Back to Register",
                fontSize = 40.sp,
                modifier = Modifier.padding(10.dp)
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Log In",
                fontSize = 40.sp,
                color = Color.Blue,
                modifier = Modifier.padding(10.dp)
            )

        }
        ImageComponent()
//        Row {
//            TextComponent(value = "Happy Sabbath: ",
//                15.sp,
//                Color.Magenta,
//                FontFamily.Serif,
//                FontWeight.Light,
//                TextAlign.Center)
//            TextComponent(value = "Happy Day",
//                15.sp,
//                Color.Cyan,
//                FontFamily.SansSerif,
//                FontWeight.Light,
//                TextAlign.Center)
//        }
    }
}
@Composable
fun ImageComponent(){
    Image(modifier = Modifier.padding(
        start = 156.dp,
        top = 16.dp,
        end = 5.dp,
        bottom = 5.dp
    ), painter = painterResource(id = R.drawable.lion),
        contentDescription = "quote")
}
@Composable
fun ImageContent(){
    Image(modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .height(80.dp),
        painter = painterResource(id = R.drawable.emobilis_logo),
        contentDescription = null)
}