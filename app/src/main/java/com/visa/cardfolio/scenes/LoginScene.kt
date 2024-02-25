package com.visa.cardfolio.scenes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.visa.cardfolio.MainViewModel
import com.visa.cardfolio.R
import com.visa.cardfolio.scenes.utils.BasicText
import com.visa.cardfolio.scenes.utils.InputPasswordCompose
import com.visa.cardfolio.scenes.utils.InputTextCompose
import com.visa.cardfolio.scenes.utils.PrimaryButton


@Composable
fun LoginScene(
    navController: NavController,
    viewModel: MainViewModel
) {

    val userName = remember { mutableStateOf(TextFieldValue("")) }
    val password = remember { mutableStateOf(TextFieldValue("")) }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        BasicText(
            text = stringResource(id = R.string.log_in),
            fontSize = 70.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        BasicText(
            text = stringResource(id = R.string.enter_credentials),
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.height(10.dp))
        InputTextCompose(
            textField = userName,
            hint = stringResource(id = R.string.username)
        )
        Spacer(modifier = Modifier.height(20.dp))
        InputPasswordCompose(
            textField = password,
            hint = stringResource(id = R.string.password)
        )
        Spacer(modifier = Modifier.height(40.dp))
        PrimaryButton(text = stringResource(id = R.string.log_in)) {

        }
        Spacer(modifier = Modifier.height(20.dp))
        BasicText(
            text = stringResource(id = R.string.recover_username_password),
            fontSize = 20.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            BasicText(
                text = stringResource(id = R.string.copyright_text),
                fontWeight = FontWeight.Thin,
                fontSize = 15.sp
            )
        }
    }

}

