package com.gelmut.lab1_andstu

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(
                text = "hello world!",
                fontWeight = FontWeight.Bold,
                color = Color.Green,
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .background(color = Color.Red)
                    .padding(30.dp, 16.dp, 25.dp, 32.dp)
                    .border(
                        border = BorderStroke(2.dp, Color.Blue),
                        shape = CutCornerShape(8.dp)
                    )
                    //.width(60.dp)

            )
        }
        println("Hello world")
    }
}
