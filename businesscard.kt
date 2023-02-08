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
    Surface(color = Color(0xFF073042)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(1.dp, Color.Blue, RectangleShape)
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(text = "android", fontSize = 15.sp, color = Color.White)
            Text(text = "Jomo Brain", color = Color.White)
            Text(text = "Android Developer Card",fontSize = 9.sp,color = Color(0xFF2EAC72))
            Spacer(modifier = Modifier.height(40.dp))
            Divider(color = Color.Gray, thickness = 1.dp)
            Row {
                Text("icon",fontSize = 13.sp,color = Color.White)
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "+11 (123) 444 555  666", color = Color.White)
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

        BusinessCard()
    }
