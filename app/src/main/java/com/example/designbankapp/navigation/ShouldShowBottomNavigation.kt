package com.example.designbankapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun shouldShowBottomNavigation(navController: NavController) = when (currentRoute(navController)) {
    NavBarScreen.Home.route,
    NavBarScreen.Account.route,
    NavBarScreen.MyCards.route,
    NavBarScreen.Transactions.route -> true

    else -> false
}

