package com.example.androidprojectone

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Box(modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(20.dp)){
//                        ImageCard(painter = painterResource(id = R.drawable.tiger), contentDescription = "This is my card image", title = "Tiger", modifier = Modifier.padding(0.dp))
//                    }
                    Column {
                        ImageCard(painter = painterResource(id = R.drawable.tiger), contentDescription = "This is my card image", title = "Tiger", modifier = Modifier.padding(0.dp))
//                        CardRow()
                    }

                }
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier
) {
    Card (
        modifier = Modifier,
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp),
    ){
        Box (
            modifier = Modifier.height(400.dp)
        ){
            Image(painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier.height(300.dp)
            )
            Box {
                Text(
                    text = title,
                    color = Color.Red,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Serif
                )
            }
        }

    }

}
//@Composable
//fun CardRow() {
//    LazyRow {
//        items(5) { index ->
//            ImageCard(
//                painter = painterResource(id = R.drawable.lion),
//                contentDescription = "Card $index",
//                title = "Card $index",
//                modifier = Modifier.padding(8.dp)
//            )
//        }
//    }
//}
@Preview(showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)
@Composable
fun ImageCardPreview() {
    AndroidProjectOneTheme {
        Column {
            ImageCard(painter = painterResource(id = R.drawable.tiger), contentDescription = "This is my card image", title = "Tiger", modifier = Modifier.padding(0.dp))
//            CardRow()
        }
    }
}