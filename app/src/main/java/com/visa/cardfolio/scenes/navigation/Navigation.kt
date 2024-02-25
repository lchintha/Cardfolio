package com.visa.cardfolio.scenes.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
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
        startDestination = Screen.LaunchScreen.route
    ) {
        composable(
            route = Screen.LaunchScreen.route,
            enterTransition = {
                return@composable fadeIn(tween(1000))
            },
            exitTransition = {
                return@composable slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Start, tween(700)
                )
            }
        ) {
            Column {
                LaunchScene(
                    navController,
                    viewModel
                )
            }
        }
        composable(
            route = Screen.LoginScreen.route,
            enterTransition = {
                return@composable slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Start, tween(700)
                )
            },
            exitTransition = {
                return@composable slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.End, tween(700)
                )
            }
        ) {
            LoginScene(
                navController,
                viewModel
            )
        }
    }
}