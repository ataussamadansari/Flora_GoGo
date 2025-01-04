package com.example.loginjc.screens

sealed class Screens(val screens: String) {
    data object Home : Screens("home")
    data object Search : Screens("search")
    data object Carts : Screens("carts")
    data object Profile : Screens("profile")
    data object Settings : Screens("settings")
    data object Notification : Screens("notification")
}