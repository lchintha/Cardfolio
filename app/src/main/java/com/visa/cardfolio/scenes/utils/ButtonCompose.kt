package com.visa.cardfolio.scenes.utils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        shape = RoundedCornerShape(23.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFF033342))
    ) {
        BasicText(
            text = text,
            fontWeight = FontWeight.Medium,
            color = Color(0xFFFFFFFF)
        )
    }
}

@Composable
fun SecondaryButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(2.dp, Color(0xFF033342)),
        shape = RoundedCornerShape(23.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF))
    ) {
        BasicText(
            text = text,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview
@Composable
private fun PreviewButton() {
    Column {
        PrimaryButton(text = "Log In") {
        }
        Spacer(modifier = Modifier.height(20.dp))
        SecondaryButton(text = "Sign Up") {
        }
    }
}