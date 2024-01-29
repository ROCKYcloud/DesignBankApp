package com.example.designbankapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.designbankapp.presentation.theme.neutral800


@Composable
fun LastPartOfNumberOfCard(
    number: Int,
    color: Color = neutral800,
    dotSize: TextUnit = 24.sp,
    numberSize: TextUnit = TextUnit.Unspecified
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "••", fontSize = dotSize, color = color)
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text = number.toString(),
            color = color,
            fontSize = numberSize
        )
    }
}