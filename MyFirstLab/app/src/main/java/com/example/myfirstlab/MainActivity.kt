package com.example.myfirstlab

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.myfirstlab.ui.theme.MyFirstLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MyFirstLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainPicture()
                }
            }
        }
    }
}

@Preview
@Composable
fun MainPicture() {
    Column(Modifier
        .background(Color.Black)
        .fillMaxSize()
    ) {
        Box {
            Column {
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.dotapicture),
                    contentDescription = "Main dota picture"
                )
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.dota_icon),
                    contentDescription = "Dota icon"
                )
            }
        }
        val myColor: Color = Color(red = 0xFA, green = 0xE2, blue = 0x10, alpha = 0xFF)
        Text(
            "Dota 2 is a multiplayer online battle arena (MOBA) game " +
                    "which has two teams of five players compete to collectively destroy a large" +
                    "structure defended by the opposing team known as the Ancient, " +
                    "whilst defending their own.",
            fontFamily = FontFamily.SansSerif,
            color = Color.LightGray,
            fontSize=22.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(30.dp)
                .offset(y = (-10).dp)
        )

        

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Yellow,
                    contentColor = Color.Black
                )
            ) {

                Text("Install", fontSize = 25.sp)
            }
        }

    }
}

@Composable
private fun ApplySystemBarController() {
//    val systemUiController = rememberSystemUiController()

//    SideEffect {
//        systemUiController.setStatusBarColor(color = Color.Transparent)
//        systemUiController.setNavigationBarColor(color = Color.Transparent)
//    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstLabTheme {
        Greeting("Android")
    }
}