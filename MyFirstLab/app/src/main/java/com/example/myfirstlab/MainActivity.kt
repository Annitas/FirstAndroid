package com.example.myfirstlab

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
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
    Column {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.dotapicture),
            contentDescription = "Зимний лес"
        )
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