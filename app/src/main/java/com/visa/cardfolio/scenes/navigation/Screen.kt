package com.visa.cardfolio.scenes.navigation

sealed class Screen(val route: String) {

    data object LaunchScreen : Screen("launch_screen")
    data object LoginScreen : Screen("login_screen")

}