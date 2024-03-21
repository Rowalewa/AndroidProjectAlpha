package com.example.androidprojectone

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.KeyEventDispatcher.Component
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme
import com.example.androidprojectone.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {  // where functions are called.
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier
                    .background(color = Color.Green)
                    .fillMaxSize(), color = Color.Black) {
                    Column(modifier = Modifier
                        .clip(shape = RoundedCornerShape(2.dp))
                        .border(width = 2.dp, color = Color.White)) {
//                        HelloClient("Samuel")
//                        SecondLine()
//                        ThirdLine()
                        TextComponent(
                            value = "Hey there, \uD83D\uDC4B",
                            20.sp,
                            Color.Black,
                            FontFamily.Monospace,
                            FontWeight.Light,
                            TextAlign.Center
                        )
//                        TextComponent(
//                            value = "Let's Begin",
//                            15.sp,
//                            Color.Red,
//                            FontFamily.Cursive,
//                            FontWeight.Light,
//                            TextAlign.Center
//                        )
                        TextComponent(
                            value = "Please Register",
                            15.sp,
                            Color.Green,
                            FontFamily.Default,
                            FontWeight.Light,
                            TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        TextFieldComponent("Enter your name")
                        Spacer(modifier = Modifier.height(10.dp))
                        TextFieldComponent("Enter your email address")
                        Spacer(modifier = Modifier.height(10.dp))
                        TextFieldComponent("Enter your Gender")
                        Spacer(modifier = Modifier.height(10.dp))
                        TextFieldComponent("Enter your Age")
                        Spacer(modifier = Modifier.height(30.dp))

//                        Row {
//                            TextComponent(
//                                value = "Happy Sabbath: ",
//                                15.sp,
//                                Color.Magenta,
//                                FontFamily.Serif,
//                                FontWeight.Light,
//                                TextAlign.Center
//                            )
//                            TextComponent(
//                                value = "Happy Day",
//                                15.sp,
//                                Color.Cyan,
//                                FontFamily.SansSerif,
//                                FontWeight.Light,
//                                TextAlign.Center
//                            )
//                        }
                    }
                }
            }
        }
    }
}
// this is what is installed in the app on installation unlike preview which you preview and it ends here
@Composable
fun HelloClient(name: String){
    Text(text = "Good Afternoon $name")

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloClientPreview(){
    Column(modifier = Modifier
        .clip(shape = RoundedCornerShape(20.dp))
        .border(width = 2.dp, color = Color.Magenta)
        .background(color = Color.Green)) {  // rounded corner shape is border radius
//        HelloClient("Samuel")
//        SecondLine()
//        ThirdLine()
        TextComponent(value = "Hey There, \uD83D\uDC4B",
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
        TextComponent(value = "Please Register",
            15.sp,
            Color.Green,
            FontFamily.Default,
            FontWeight.Light,
            TextAlign.Center)
        Spacer(modifier = Modifier.height(20.dp))
        TextFieldComponent("Enter your name")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent("Enter your email address")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent("Enter your Gender")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent("Enter your Age")
        Spacer(modifier = Modifier.height(30.dp))
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
fun SecondLine(){
    Text(text = "Successfully logged in")  // without using text component
}
@Composable
fun ThirdLine(){
    TextComponent(value = "Welcome back",
        15.sp,
        Color.Magenta,
        FontFamily.SansSerif,
        FontWeight.Light,
        TextAlign.Center)  // using text component
}
@Composable
fun TextComponent(value: String,
                  fontSize: TextUnit,
                  color: Color,
                  fontFamily: FontFamily,
                  fontWeight: FontWeight,
                  textAlign: TextAlign,){
    Text(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)  // the order of modifiers usually matters; a lot.
        .padding(10.dp)
        .wrapContentHeight(align = Alignment.Top),
        text=value,
        fontSize=fontSize,
        color=color,
        fontFamily=fontFamily,
        fontWeight=fontWeight,
        textAlign=textAlign)
}
@Composable
fun TextFieldComponent(mylabel: String){
    var text by remember {
        mutableStateOf(value = "")
    } // enabling text input
    TextField(modifier = Modifier.fillMaxWidth(),
       value = text, onValueChange = {
    newText -> text = newText // does the observation of the input field
    },
        label = { TextFieldLabels(value = mylabel)})  // label
}
@Composable
fun TextFieldLabels(value: String){
    Text(text = value)
}

