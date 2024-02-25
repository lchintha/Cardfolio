package com.visa.cardfolio.scenes.navigation

sealed class Screen(val route: String) {

    object LaunchScreen : Screen("launch_screen")
    object LoginScreen : Screen("login_screen")

}