package com.example.designbankapp.presentation.screens.cardDetailScreen.components.actionBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActionBarButton(text: String, drawable: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .size(70.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable { }) {
        Image(
            painter = painterResource(drawable),
            contentDescription = "logo mastercard"
        )
        Text(text = text, fontSize = 12.sp)
    }
}