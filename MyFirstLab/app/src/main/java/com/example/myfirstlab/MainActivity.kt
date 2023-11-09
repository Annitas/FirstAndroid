package com.example.myfirstlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.core.view.WindowCompat
import com.example.myfirstlab.ui.theme.MyFirstLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MyFirstLabTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    LazyColumn(modifier = Modifier
                        .background(colorResource(R.color.black))
                    ) {
                        item {
                            DotaHeader()
                        }
                        item {
                            Tags()
                        }
                        item {
                            DotaTextAndPreview()
                        }
                        item {
                            ReviewAndRating()
                        }
                        item {
                            BottomInstallButton()
                        }
                    }
                }
            }
        }
    }
}
