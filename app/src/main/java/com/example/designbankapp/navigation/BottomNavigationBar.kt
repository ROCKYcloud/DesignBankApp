package com.example.designbankapp.navigation

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.designbankapp.presentation.theme.blue500
import  androidx.compose.material3.NavigationBar

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar(
        containerColor = Color.White
    ) {
        val items = listOf(
            NavBarScreen.Home,
            NavBarScreen.Transactions,
            NavBarScreen.MyCards,
            NavBarScreen.Account
        )

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        items.forEach { screen ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painterResource(screen.drawableId!!),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                    )
                },
                label = { Text(stringResource(screen.resourceId!!)) },
                selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults
                    .colors(
                        selectedTextColor = blue500,
                        unselectedTextColor = Color.LightGray,
                        unselectedIconColor = Color.LightGray,
                        selectedIconColor = blue500,
                        indicatorColor = Color.White,
                    )
            )
        }
    }
}