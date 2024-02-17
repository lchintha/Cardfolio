package com.visa.cardfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModelProvider
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.visa.cardfolio.ui.theme.CardfolioTheme

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val userInfo = viewModel.getUserInfo()

        setContent {
            CardfolioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val systemUiController = rememberSystemUiController()
                    systemUiController.setStatusBarColor(
                        color = Color.White,
                        darkIcons = true
                    )

                    viewModel.observeUserInfo.observeAsState().value.let { userInfo ->
                        if(userInfo != null) {
                            CustomText(text = userInfo.firstName)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CustomText(text: String) {
    Text(text = text)
}