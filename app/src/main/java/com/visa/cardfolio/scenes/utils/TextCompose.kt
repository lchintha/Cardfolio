package com.visa.cardfolio.scenes.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.visa.cardfolio.ui.theme.robotoCondensed


@Composable
fun TitleText(text: String) {
    BasicText(
        text = text,
        modifier = Modifier.fillMaxWidth(),
        fontSize = 80.sp
    )
}

@Composable
fun SubTitleText(text: String) {
    BasicText(
        text = text,
        modifier = Modifier.fillMaxWidth(),
        fontWeight = FontWeight.Light
    )
}

@Composable
fun BasicText(
    text: String,
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = Color(0xFF033342),
    fontSize: TextUnit = 25.sp,
    onClick: () -> Unit = {}
) {
    Text(
        text = text,
        modifier = modifier,
        fontFamily = robotoCondensed,
        fontWeight = fontWeight,
        fontSize = fontSize,
        color = color
    )
}

@Preview
@Composable
private fun PreviewText(){
    Column {
        TitleText(text = "Title")
        SubTitleText(text = "Sub title")
    }
}