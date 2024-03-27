package com.example.androidprojectone

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
                    val employees = listOf("Tom",
                        "Dickson",
                        "Harry",
                        "Brian",
                        "Jane",
                        "Catherine",
                        "Robert",
                        "Fiona",
                        "Ariel",
                        "Barry",
                        "Johnson",
                        "Felix",
                        "Apollo",
                        "Aries",
                        "Ryan",
                        "June",
                        "Jones",
                        "Gary",
                        "Nolan",
                        "Mouser"
                    )
                    val departments = listOf("Dermatology","Ophthalmology","Gynaecology","Dentistry","Pharmacy","Anaesthetics","Paediatrics","Dermatology","Cardiology","Orthopaedics","Ornithology","Ecology","Mycology","Ichthyology","Entomology","Taxonomy","Genetics","Evolution","Growth and Development","Excretion")
                    ListScreen(modifier = Modifier, employees, departments)
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
fun ListScreen(modifier: Modifier = Modifier, employees:List<String>, departments:List<String>){
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
                    fontSize = 100.sp,
                    color = Color.Green,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(
                        start = 2.dp,
                        top = 150.dp,
                        end = 2.dp,
                        bottom = 2.dp
                    ),
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Cursive
                )

            }
        }
    }
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        LazyRow (
            modifier = Modifier.background(color = Color.Red
            )
        ){
            items(items = employees){
                item->
                RowCard(modifier = Modifier, name = item)
            }

        }
//        LazyColumn (modifier = Modifier
//            .padding(
//                start = 200.dp,
//                top = 16.dp,
//                end = 0.dp,
//                bottom = 250.dp
//            )
//            .background(color = Color.Green)
//            .width(50.dp)){
//            items(count = 100){
//                    item->
//                Text(text = "$item",
//                    color = Color.Red,
//                    textAlign = TextAlign.Center)
//            }
//
//        }
        LazyColumn (
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(
                start = 20.dp,
                top = 10.dp,
                end = 20.dp,
                bottom = 100.dp
            )
                .background(color = Color.Cyan)
        ){
            items(items = departments){
                    item->
                ColumnCard(modifier = Modifier, name = item)
            }

        }

    }

}

//@Preview(
//    showBackground = true,
//    showSystemUi = true,
//    name = "My Preview"
//)
@Composable
fun ListScreenPreview(modifier: Modifier, employees: List<String>, departments: List<String>){
    ListScreen(modifier = Modifier, employees, departments)

}

@Composable
fun RowCard(modifier: Modifier,name: String){  // responsible for creating the card and the box->RowCard fx
    Card(
        modifier = Modifier
            .padding(
                start = 10.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 10.dp
            )
            .fillMaxWidth()
            .height(100.dp)
            .aspectRatio(
                1.5f
            )
            .background(color = Color.Blue),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(10.dp)  // makes it appear 3d as if elevated from the screen
    ){
        Box (
            modifier = Modifier.padding(
                start = 10.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 10.dp
            ),
            contentAlignment = Alignment.Center,
        ){
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Blue,
                modifier = Modifier.padding(
                    start = 15.dp,
                    top = 17.dp,
                    end = 5.dp,
                    bottom = 5.dp
                )
                    .align(alignment = Alignment.Center)
            )
        }
    }
}

@Composable
fun ColumnCard(modifier: Modifier,name: String){  // responsible for creating the card and the box->RowCard fx
    Card(
        modifier = Modifier
            .padding(
                start = 10.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 40.dp
            )
            .fillMaxWidth()
            .wrapContentHeight()
            .aspectRatio(
                1.5f
            ),
        colors = CardDefaults.cardColors(containerColor = Color.Yellow),
        elevation = CardDefaults.cardElevation(10.dp)  // makes it appear 3d as if elevated from the screen
    ){
        Box (
            modifier = Modifier.padding(
                start = 10.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 10.dp
            ),
            contentAlignment = Alignment.Center,
        ){
            Text(
                text = name,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Blue,
                modifier = Modifier.padding(
                    start = 15.dp,
                    top = 17.dp,
                    end = 5.dp,
                    bottom = 5.dp
                )
                    .align(alignment = Alignment.Center),
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic
            )
        }
    }
}