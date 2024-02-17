package com.visa.cardfolio.scenes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.visa.cardfolio.R

@Composable
fun LaunchScene() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Spacer(modifier = Modifier.height(80.dp))
        LoginScreenBannerImage()
        Spacer(modifier = Modifier.height(10.dp))
        TitleText(text = stringResource(id = R.string.track_expenses))
        Spacer(modifier = Modifier.height(10.dp))
        SubTitleText(text = stringResource(id = R.string.track_expenses_subtitle))
        Spacer(modifier = Modifier.height(50.dp))
        PrimaryButton(text = stringResource(id = R.string.log_in)) {
        }
        Spacer(modifier = Modifier.height(10.dp))
        SecondaryButton(text = stringResource(id = R.string.sign_up)) {
            
        }
    }
}

@Composable
fun LoginScreenBannerImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_login_screen_banner),
        contentDescription = "Login Screen Banner",
        modifier = Modifier.fillMaxWidth()
    )
}

