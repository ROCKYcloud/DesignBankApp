package com.example.designbankapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.designbankapp.presentation.screens.homeScreen.HomeScreen
import com.example.designbankapp.presentation.screens.cardDetailScreen.CardDetailScreen

@Composable
fun NavGraph(navHostController: NavHostController,innerPadding: PaddingValues){
    NavHost(
        navHostController,
        startDestination = NavBarScreen.Home.route,
        androidx.compose.ui.Modifier.padding(innerPadding)
    ) {
        composable(NavBarScreen.Home.route) { HomeScreen(navHostController) }
        composable(NavBarScreen.Transactions.route) { HomeScreen(navHostController) }
        composable(NavBarScreen.MyCards.route) { HomeScreen(navHostController) }
        composable(NavBarScreen.Account.route) { HomeScreen(navHostController) }
        composable(DetailsScreen.CardDetails.route) { CardDetailScreen(navHostController) }
    }
}