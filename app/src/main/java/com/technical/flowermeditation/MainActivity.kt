package com.technical.flowermeditation

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.technical.flowermeditation.ui.theme.FlowerMeditationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowerMeditationTheme {
                Column(
                    modifier = Modifier
                        .background(Gray)
                        .fillMaxSize()
                ){
                    HeaderProfileComponent()

                }

                }
            }
        }
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HeaderProfileComponent() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, top = 15.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.michelle),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(
                        text = "Welcome back",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start

                    )
                    Text(
                        text = "Michelle Ramela",
                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Start

                    )
                }


            }
            BadgedBox(badge = { Badge(Modifier.background(Green)) }) {
             Icon(
                Icons.Default.Notifications,
                contentDescription = "Notification"
             )
            }
        }
    }
}






//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    FlowerMeditationTheme {
////        Greeting("Android")
//    }
//}