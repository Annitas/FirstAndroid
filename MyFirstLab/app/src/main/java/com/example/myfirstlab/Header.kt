package com.example.myfirstlab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

    @Preview
    @Composable
    fun DotaHeader() {
        Box {
            Column {
                Image(modifier = Modifier.fillMaxSize(),
                    bitmap = ImageBitmap.imageResource(R.drawable.dotapicture),
                    contentDescription = "Main dota picture"
                )
                Row {
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.dota_icon),
                        contentDescription = "Dota icon"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text(
                            text = stringResource(R.string.dota),
                            color = colorResource(R.color.main_text_color),
                            fontWeight = FontWeight.SemiBold
                        )
                        // Add a vertical space between the author and message texts
                        Spacer(modifier = Modifier.height(4.dp))
                        Row {
                            StarShape()
                            StarShape()
                            StarShape()
                            StarShape()
                            StarShape()
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = stringResource(R.string.million),
                                color = colorResource(R.color.main_text_color)
                            )
                        }
                    }
                }
            }
        }
    }