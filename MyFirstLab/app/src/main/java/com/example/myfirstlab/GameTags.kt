package com.example.myfirstlab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Tags() {
    val tagsBackgroundColor = Color(red = 0x31, green = 0xB7, blue = 0xFF, alpha = 0x95)
    val tagsTextColor = Color(red = 0x2F, green = 0xC4, blue = 0xE9, alpha = 0xFF)
    Row{
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier
            .clip(CircleShape)
            .background(tagsBackgroundColor)
        ) {
            Text(
                text = "MOBA",
                color = tagsTextColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier
            .clip(RoundedCornerShape(60))
            .background(tagsBackgroundColor)
        ) {
            Text(
                text = "MULTIPLAYER",
                color = tagsTextColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier
            .clip(CircleShape)
            .background(tagsBackgroundColor)
        ) {
            Text(
                text = "STRATEGY",
                color = tagsTextColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}