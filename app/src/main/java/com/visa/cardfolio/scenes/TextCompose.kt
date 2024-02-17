package com.visa.cardfolio.scenes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.visa.cardfolio.ui.theme.robotoCondensed


@Composable
fun TitleText(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth(),
        fontFamily = robotoCondensed,
        fontWeight = FontWeight.Normal,
        fontSize = 80.sp,
        color = Color(0xFF033342)
    )
}

@Composable
fun SubTitleText(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth(),
        fontFamily = robotoCondensed,
        fontWeight = FontWeight.Light,
        fontSize = 25.sp,
        color = Color(0xFF033342)
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