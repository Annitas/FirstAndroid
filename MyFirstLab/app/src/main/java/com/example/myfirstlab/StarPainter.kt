package com.example.myfirstlab

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp

@Composable
fun StarShape() {
    Canvas(modifier = Modifier.size(18.dp)) {
        val path = Path().apply {
            moveTo(size.width / 2, 0f)
            lineTo(size.width * 0.6f, size.height * 0.4f)
            lineTo(size.width, size.height * 0.4f)
            lineTo(size.width * 0.7f, size.height * 0.65f)
            lineTo(size.width * 0.8f, size.height)
            lineTo(size.width / 2, size.height * 0.8f)
            lineTo(size.width * 0.2f, size.height)
            lineTo(size.width * 0.3f, size.height * 0.65f)
            lineTo(0f, size.height * 0.4f)
            lineTo(size.width * 0.4f, size.height * 0.4f)
            close()
        }
        drawPath(path, color = Color.Yellow)
    }
}