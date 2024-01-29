package com.example.designbankapp.presentation

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.designbankapp.navigation.BottomNavigationBar
import com.example.designbankapp.navigation.NavGraph
import com.example.designbankapp.navigation.shouldShowBottomNavigation

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            if (shouldShowBottomNavigation(navController = navController)) {
                BottomNavigationBar(navController = navController)
            }
        }) { innerPadding ->
        NavGraph(navHostController = navController, innerPadding = innerPadding)
    }
}