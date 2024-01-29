package com.example.designbankapp.navigation

sealed class DetailsScreen(val route: String) {
   data object CardDetails : DetailsScreen(route = "card_details")
}