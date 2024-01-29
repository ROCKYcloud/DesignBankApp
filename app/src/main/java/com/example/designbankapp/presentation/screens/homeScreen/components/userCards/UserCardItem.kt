package com.example.designbankapp.presentation.screens.homeScreen.components.userCards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.designbankapp.R
import com.example.designbankapp.presentation.theme.neutral50
import com.example.designbankapp.presentation.theme.neutral800

@Composable
fun UserCardItem(onClick : () ->Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() }
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box {
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp, top = 8.dp)
                        .height(42.dp)
                        .width(58.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .border(
                            width = 1.dp,
                            color = Color.LightGray,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .background(neutral800)
                        .padding(top = 16.dp, bottom = 4.dp, start = 4.dp, end = 8.dp),
                    text = "0000",
                    fontSize = 12.sp,
                    color = Color.White,
                    textAlign = TextAlign.End
                )
                Image(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .background(neutral50)
                        .padding(4.dp),
                    painter = painterResource(R.drawable.ic_google),
                    contentDescription = "flag icon"
                )
            }
            Text(modifier = Modifier.padding(start = 8.dp), text = "Google",color = neutral800)
        }
        Image(
            painter = painterResource(R.drawable.ic_next),
            contentDescription = "flag icon"
        )
    }
}