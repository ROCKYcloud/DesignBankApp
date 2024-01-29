package com.example.designbankapp.presentation.screens.homeScreen.components.userCards

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.designbankapp.R
import com.example.designbankapp.navigation.DetailsScreen
import com.example.designbankapp.presentation.theme.neutral800

@Composable
fun UserCards(size: List<Int>, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(R.string.my_cards), fontSize = 16.sp, fontWeight = FontWeight.Bold,color = neutral800)
            Text(
                text = stringResource(R.string.see_all),
                color = neutral800,
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { }
                    .padding(8.dp),
                style = TextStyle(textDecoration = TextDecoration.Underline))
        }
        size.forEach {
            UserCardItem{
                navController.navigate(DetailsScreen.CardDetails.route)
            }
        }
    }
}