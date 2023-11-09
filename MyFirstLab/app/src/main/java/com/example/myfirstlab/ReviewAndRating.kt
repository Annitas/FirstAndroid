package com.example.myfirstlab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun ReviewAndRating() {
    Box(modifier = Modifier.padding(all = 10.dp)) {
        Column {
            Text(
                stringResource(R.string.review_and_ratings_title),
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.main_text_color),
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    stringResource(R.string.rating_number),
                    fontFamily = FontFamily.SansSerif,
                    color = colorResource(R.color.main_text_color),
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
                        text = stringResource(R.string.million_r),
                        color = colorResource(R.color.main_text_color)
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
                        text = stringResource(R.string.first_commentator),
                        color = colorResource(R.color.main_text_color),
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = stringResource(R.string.october),
                        color = colorResource(R.color.main_text_color)
                    )
                }
            }
            Text(
                text = stringResource(R.string.comment_text),
                textAlign = TextAlign.Justify,
                fontStyle = FontStyle.Italic,
                color = colorResource(R.color.main_text_color),
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
                        text = stringResource(R.string.second_commentator),
                        color = colorResource(R.color.main_text_color),
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = stringResource(R.string.october),
                        color = colorResource(R.color.main_text_color)
                    )
                }
            }
            Text(
                text = stringResource(R.string.comment_text),
                textAlign = TextAlign.Justify,
                fontStyle = FontStyle.Italic,
                color = colorResource(R.color.main_text_color),
                modifier = Modifier
                    .padding(5.dp)
            )
        }
    }
}