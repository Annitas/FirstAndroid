package com.example.myfirstlab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun BottomInstallButton() {
//    BottomAppBar(backgroundColor = colorResource(R.color.yellow)) {
        Row(modifier = Modifier
                .fillMaxWidth()
                .padding(22.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom) {
            var isButtonPressed by remember { mutableStateOf(false) }

            Button(
                onClick = { isButtonPressed = !isButtonPressed },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isButtonPressed) colorResource(R.color.dark_yellow) else colorResource(R.color.yellow),
                    contentColor = colorResource(R.color.black)
                )
            ) {
                Text(stringResource(R.string.install), fontSize = 25.sp)
            }

        }
//    }
}