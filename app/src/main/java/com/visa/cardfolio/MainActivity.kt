package com.visa.cardfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.visa.cardfolio.scenes.navigation.Navigation

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel
    private var navController = NavHostController(this)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContent {
            navController = rememberNavController()
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {

                val systemUiController = rememberSystemUiController()
                systemUiController.setStatusBarColor(
                    color = Color.White,
                    darkIcons = true
                )

                Column {
                    Navigation(
                        viewModel = viewModel,
                        navController = navController
                    )
                }
            }
        }
    }
}