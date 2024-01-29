package com.example.designbankapp.presentation.screens.cardDetailScreen.components.actionBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.designbankapp.R

@Composable
fun ActionBar() {
    Card(elevation = CardDefaults.cardElevation(4.dp), shape = RoundedCornerShape(16.dp), modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier
                .width(240.dp)
                .background(Color.White)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ActionBarButton(text = "Details", drawable = R.drawable.ic_eye)
            ActionBarButton(text = "Lock", drawable = R.drawable.ic_lock)
            ActionBarButton(text = "Terminate", drawable = R.drawable.ic_credit_card_close)
        }
    }

}