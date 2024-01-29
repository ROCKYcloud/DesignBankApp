package com.example.designbankapp.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.designbankapp.R


sealed class NavBarScreen(
    val route: String,
    @StringRes val resourceId: Int? = null,
    @DrawableRes val drawableId: Int? = null
) {
    object Home : NavBarScreen(
        route = "home",
        resourceId = R.string.home,
        drawableId = R.drawable.ic_home)

    object Transactions : NavBarScreen(
        route = "transactions",
        resourceId = R.string.transactions,
        drawableId = R.drawable.ic_menu
    )

    object MyCards : NavBarScreen(
        route = "myCards",
        resourceId = R.string.my_card,
        drawableId = R.drawable.ic_card)

    object Account : NavBarScreen(route = "account",
        resourceId = R.string.account,
        drawableId = R.drawable.ic_account)

}