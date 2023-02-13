package com.app.mycard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           BusinessCard()
        }
    }
}

@Composable
fun BusinessCard(){
    Surface(color = Color(0XFF08072f)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
                      modifier = Modifier
                          .border(1.dp, Color.Blue, RectangleShape)
                          .fillMaxWidth()
                          .padding(30.dp)
            ) {
            Text(
                text = "android",
                fontSize = 12.sp,
                color = Color.White
            )
            Text(
                text = "Musango Brian",
                color = Color.White
            )
            Text(
                text = "Android Developer",
                color = Color(0XFF399212),
                fontSize = 8.sp
            )
            Spacer(modifier = Modifier.width(40.dp))
            Divider(color = Color.Gray,thickness = 2.dp)
            Row{
                Text ("It is my phone no.",
                      color = Color.White,
                    fontSize = 7.5.sp)
                Spacer(modifier = Modifier.width(20.dp))
                Text (text = "+254115815528",
                    color = Color.White,
                    fontSize = 7.5.sp
                    )

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

        BusinessCard()
    }
