package com.example.designbankapp.presentation.screens.homeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import com.example.designbankapp.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.designbankapp.presentation.theme.neutral200
import com.example.designbankapp.presentation.theme.neutral800
import com.example.designbankapp.utils.getBottomLineShape

@Composable
fun ToolBar(title: String, onAddClick: () -> Unit, onBankClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = neutral200,
                shape = getBottomLineShape(1.dp)
            )
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = title, fontSize = 32.sp, fontWeight = FontWeight.Bold,color = neutral800)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { onAddClick() }
                    .padding(12.dp),
                painter = painterResource(R.drawable.ic_add),
                contentDescription = "add icon"
            )
            Image(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { onBankClick() }
                    .padding(8.dp),
                painter = painterResource(R.drawable.ic_bank),
                contentDescription = "bank icon"
            )
        }
    }
}
