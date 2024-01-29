package com.example.designbankapp.presentation.screens.cardDetailScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import com.example.designbankapp.R
import com.example.designbankapp.presentation.components.LastPartOfNumberOfCard

@Composable
fun HeaderCardDetails(onClick: () -> Unit) {
    Box(modifier = Modifier.padding(top = 24.dp, bottom = 16.dp)) {
        Image(
            modifier = Modifier
                .height(58.dp)
                .clip(RoundedCornerShape(8.dp))
                .clickable { onClick() },
            painter = painterResource(R.drawable.ic_back),
            contentDescription = "back icon"
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(58.dp)
                    .clip(RoundedCornerShape(28.dp))
                    .background(color = Color.White)
                    .clickable { }
                    .padding(12.dp),
                painter = painterResource(R.drawable.ic_google),
                contentDescription = "google icon"
            )
            Text(text = "Google", modifier = Modifier.padding(horizontal = 8.dp))
            LastPartOfNumberOfCard(number = 3245)
        }
    }
}