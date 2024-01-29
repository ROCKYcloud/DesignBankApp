package com.example.designbankapp.presentation.screens.cardDetailScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.designbankapp.presentation.theme.background

@Composable
fun DateItem(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = background)
            .padding(vertical = 8.dp)
    )
}
