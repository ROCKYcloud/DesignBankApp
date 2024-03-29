package com.example.designbankapp.presentation.screens.cardDetailScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.designbankapp.R
import com.example.designbankapp.presentation.theme.neutral800

@Composable
fun CreditCard() {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
        shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp),
        colors = CardDefaults.cardColors(
            containerColor = neutral800,
        )
    ) {
        Row(
            modifier = Modifier
                .height(100.dp)
                .width(280.dp)
                .shadow(
                    elevation = 10.dp,
                    shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp),
                    ambientColor = neutral800
                )
                .clip(shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                .border(
                    width = 1.dp,
                    color = Color.Gray,
                    shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp)
                )
                .background(
                    neutral800
                )
                .padding(start = 24.dp, end = 25.dp, top = 24.dp, bottom = 44.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.ic_medium_logo),
                contentDescription = "medium logo"
            )
            Image(
                painter = painterResource(R.drawable.ic_mastercard),
                contentDescription = "logo mastercard"
            )
        }
    }
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.LightGray)
    )
}