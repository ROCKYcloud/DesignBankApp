package com.example.designbankapp.presentation.screens.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.designbankapp.presentation.screens.homeScreen.components.CurrencyAccount
import com.example.designbankapp.presentation.screens.homeScreen.components.ToolBar
import com.example.designbankapp.presentation.screens.homeScreen.components.userCards.UserCards
import com.example.designbankapp.presentation.screens.homeScreen.components.userRecentTransactions.UserRecentTransactions
import com.example.designbankapp.presentation.theme.background

@Composable
fun HomeScreen(navController: NavController) {
    val size = listOf(1, 2, 3)
    LazyColumn(
        modifier = Modifier
            .background(background)
            .fillMaxHeight(),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        item {
            ToolBar(title = "Money", onAddClick = {}, onBankClick = {})
            CurrencyAccount()
            UserCards(
                size = size,
                navController = navController
            )
            UserRecentTransactions(size = size)
        }
    }
}