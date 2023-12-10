package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextImage(text1 = "Happy Birthday Sam!", text2 = "From Aimah")
                }
                }
            }
        }
    }



@Composable
fun BirthdayText(text1 : String, text2 : String, modifier: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier) {


        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 95.sp,
            lineHeight = 116.sp,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 16.dp
                )
        )

        Text(
            text = text2,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)
        )


    }
}

@Composable
fun TextImage(text1 : String, text2 : String, modifier: Modifier = Modifier){
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = null,
            contentScale = ContentScale.Crop,

        )

        BirthdayText(
           text1 = text1,
            text2 = text2,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    
}
}






@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        TextImage(text1 = "Happy Birthday Sam!", text2 = "From Aimah")
    }
}