package com.example.designbankapp.presentation.screens.homeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.designbankapp.R
import com.example.designbankapp.presentation.theme.neutral800
import com.example.designbankapp.utils.currencyBalance

@Composable
fun CurrencyAccount() {
    Column(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(8.dp)),
                painter = painterResource(R.drawable.ic_flag),
                contentDescription = "flag icon"
            )
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = "USD account",
                fontSize = 16.sp,
                color = neutral800
            )
        }
        Text(text = currencyBalance(typeCurrency= "$",currency = 100000.02), fontWeight = FontWeight.Bold, fontSize = 28.sp, color = neutral800)
    }
}

