package com.example.myfirstlab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DotaTextAndPreview() {
    Box {
        Column {
            Text(
                "Dota 2 is a multiplayer online battle arena (MOBA) game " +
                        "which has two teams of five players compete to collectively destroy a large" +
                        "structure defended by the opposing team known as the Ancient, " +
                        "whilst defending their own.",
                fontFamily = FontFamily.SansSerif,
                color = Color.LightGray,
                fontSize = 22.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(20.dp)
                    .offset(y = (-10).dp)
            )
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                contentPadding = PaddingValues(4.dp),
            ) {
                item {
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.game_screen),
                        contentDescription = "Dota game screen"
                    )
                }
                item {
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.second_game_screen),
                        contentDescription = "Dota game screen"
                    )
                }
                item {
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.second_game_screen),
                        contentDescription = "Dota game screen"
                    )
                }
            }
        }
    }
}