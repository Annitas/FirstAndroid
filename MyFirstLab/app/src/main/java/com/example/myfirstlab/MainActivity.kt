package com.example.myfirstlab

import android.media.Image
import android.os.Bundle
import android.system.Os.close
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LazyColumn(modifier = Modifier
                        .background(Color.Black)
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
                        text = "DoTA 2",
                        color = Color.LightGray,
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
                            text = "70M",
                            color = Color.LightGray
                        )
                    }
                }
            }
        }
    }
}

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

@Preview
@Composable
fun ReviewAndRating() {
    Box(modifier = Modifier.padding(all = 10.dp)) {
        Column {
            Text(
                "Review & Ratings",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray,
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "4.9",
                    fontFamily = FontFamily.SansSerif,
                    color = Color.LightGray,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .padding(20.dp)
                        .offset(y = (-10).dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Row {
                        StarShape()
                        StarShape()
                        StarShape()
                        StarShape()
                        StarShape()
                    }
                    // Add a vertical space between the author and message texts
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "70M Reviews",
                            color = Color.LightGray
                        )
                }
            }
            Row {
                Image(
                    painter = painterResource(R.drawable.profile_picture),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = "Kotik Lapkin",
                        color = Color.LightGray,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "October 5, 2023",
                        color = Color.LightGray
                    )
                }
            }
            Text(
                text = "\"Once you start to learn its secrets, there's a wild" +
                        " and exciting variety of play here that's unmatched " +
                        ", even by its peers\"",
                textAlign = TextAlign.Justify,
                fontStyle = FontStyle.Italic,
                color = Color.LightGray,
                modifier = Modifier
                    .padding(5.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = "Misa Lapkina",
                        color = Color.LightGray,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "October 5, 2023",
                        color = Color.LightGray
                    )
                }
            }
            Text(
                text = "\"Once you start to learn its secrets, there's a wild" +
                        " and exciting variety of play here that's unmatched " +
                        ", even by its peers\"",
                textAlign = TextAlign.Justify,
                fontStyle = FontStyle.Italic,
                color = Color.LightGray,
                modifier = Modifier
                    .padding(5.dp)
            )
        }
    }
}

@Preview
@Composable
fun BottomInstallButton() {
    BottomAppBar(backgroundColor = Color(red = 0xFA, green = 0xE2, blue = 0x10, alpha = 0x0)) {
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom) {
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