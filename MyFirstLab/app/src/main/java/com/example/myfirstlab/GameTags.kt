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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Tags() {
    Row{
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier
            .clip(CircleShape)
            .background(colorResource(R.color.tags_background_color))
        ) {
            Text(
                text = stringResource(R.string.moba),
                color = colorResource(R.color.tags_text_color),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier
            .clip(RoundedCornerShape(60))
            .background(colorResource(R.color.tags_background_color))
        ) {
            Text(
                text = stringResource(R.string.multiplayer),
                color = colorResource(R.color.tags_text_color),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier
            .clip(CircleShape)
            .background(colorResource(R.color.tags_background_color))
        ) {
            Text(
                text = stringResource(R.string.strategy),
                color = colorResource(R.color.tags_text_color),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}