package com.example.designbankapp.presentation.screens.cardDetailScreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.designbankapp.presentation.screens.cardDetailScreen.components.actionBar.ActionBar
import com.example.designbankapp.presentation.screens.cardDetailScreen.components.CreditCard
import com.example.designbankapp.presentation.screens.cardDetailScreen.components.DateItem
import com.example.designbankapp.presentation.screens.cardDetailScreen.components.HeaderCardDetails
import com.example.designbankapp.presentation.screens.cardDetailScreen.components.TransactionCardItem
import com.example.designbankapp.utils.transactions
import com.example.designbankapp.presentation.theme.background

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardDetailScreen(navController: NavController) {
    val transactions = remember { transactions }
    val groupedItems = remember { transactions.groupBy { it.date } }
    LazyColumn(
        modifier = Modifier
            .background(color = background),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            HeaderCardDetails { navController.popBackStack() }
            CreditCard()
            Spacer(modifier = Modifier.height(24.dp))
            ActionBar()
        }
        groupedItems.forEach { (data, gropeTransactions) ->
            stickyHeader {
                DateItem(text = data)
            }
            items(gropeTransactions, key = { it.id }) { transaction ->
                if (gropeTransactions.size > 1) {
                    when (transaction.id) {
                        gropeTransactions.first().id -> {
                            TransactionCardItem(shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                        }
                        gropeTransactions.last().id -> {
                            TransactionCardItem(shape = RoundedCornerShape(0.dp, 0.dp, 15.dp, 15.dp))
                        }
                        else -> { TransactionCardItem(shape = RoundedCornerShape(0.dp)) }
                    }
                } else { TransactionCardItem(shape = RoundedCornerShape(15.dp)) }
            }
        }
        item {
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}