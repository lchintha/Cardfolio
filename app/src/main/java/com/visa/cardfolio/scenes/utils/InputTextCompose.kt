package com.visa.cardfolio.scenes.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visa.cardfolio.R
import com.visa.cardfolio.ui.theme.robotoCondensed


@Composable
fun InputTextCompose(
    textField: MutableState<TextFieldValue>,
    hint: String
) {
    OutlinedTextField(
        value = textField.value,
        onValueChange = { textField.value = it },
        label = {
            BasicText(
                text = hint,
                fontWeight = FontWeight.Thin,
                fontSize = 18.sp
            )
        },
        shape = RoundedCornerShape(23.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp),
        textStyle = LocalTextStyle.current.copy(
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = robotoCondensed,
            color = Color(0xFF033342)
        )
    )
}

@Composable
fun InputPasswordCompose(
    textField: MutableState<TextFieldValue>,
    hint: String,
) {
    var passwordVisibility by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = textField.value,
        onValueChange = { textField.value = it },
        label = {
            BasicText(
                text = hint,
                fontWeight = FontWeight.Thin,
                fontSize = 18.sp
            )
        },
        shape = RoundedCornerShape(23.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp),
        textStyle = LocalTextStyle.current.copy(
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = robotoCondensed,
            color = Color(0xFF033342)
        ),
        visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                Image(
                    painter = if(passwordVisibility) painterResource(
                        id = R.drawable.ic_visibility
                    ) else painterResource(
                        id = R.drawable.ic_visibility_off
                    ),
                    contentDescription = "Show/Hide password"
                )
            }
        }
    )
}