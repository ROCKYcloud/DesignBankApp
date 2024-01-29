package com.example.designbankapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ShouldShowBottomNavigation(navController: NavController) = when (CurrentRoute(navController)) {
    NavBarScreen.Home.route,
    NavBarScreen.Account.route,
    NavBarScreen.MyCards.route,
    NavBarScreen.Transactions.route -> true

    else -> false
}

