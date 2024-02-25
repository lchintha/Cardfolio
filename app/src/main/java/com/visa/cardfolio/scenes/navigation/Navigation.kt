package com.visa.cardfolio.scenes.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.visa.cardfolio.MainViewModel
import com.visa.cardfolio.scenes.LaunchScene
import com.visa.cardfolio.scenes.LoginScene

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation(
    viewModel: MainViewModel,
    navController: NavHostController
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.LaunchScreen.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }
    ) {
        composable(route = Screen.LaunchScreen.route) {
            Column {
                LaunchScene(
                    navController,
                    viewModel
                )
            }
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScene(
                navController,
                viewModel
            )
        }

    }

}