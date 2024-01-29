package com.example.designbankapp.presentation.screens.cardDetailScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.designbankapp.R
import com.example.designbankapp.presentation.components.LastPartOfNumberOfCard
import com.example.designbankapp.presentation.theme.neutral50
import com.example.designbankapp.presentation.theme.neutral800

@Composable
fun TransactionCardItem(shape: Shape) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(color = Color.White)
            .padding(vertical = 8.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            Image(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(neutral50)
                    .padding(4.dp),
                painter = painterResource(R.drawable.ic_google),
                contentDescription = "google icon"
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(text = "Slack", fontSize = 16.sp, color = neutral800)
                LastPartOfNumberOfCard(
                    number = 7544,
                    dotSize = 16.sp,
                    numberSize = 12.sp,
                    color = Color.LightGray
                )
            }
        }
        Row {
            Text(text = "$1000", fontSize = 16.sp, color = neutral800)
            Image(
                modifier = Modifier.padding(start = 16.dp),
                painter = painterResource(R.drawable.ic_attachments),
                contentDescription = "flag icon"
            )
        }
    }
}