package com.example.instaprofileui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaprofileui.ui.theme.InstagramColors
import com.example.instaprofileui.R

@Composable
fun ProfileHeader(username: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = username,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = InstagramColors.TextPrimary
        )

        ProfileHeaderActions()
    }
}

@Composable
private fun ProfileHeaderActions() {
    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_message_24),
                contentDescription = "Add",
                modifier = Modifier.size(24.dp),
                tint = InstagramColors.TextSecondary
            )
        }
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = android.R.drawable.ic_menu_more),
                contentDescription = "Menu",
                modifier = Modifier.size(24.dp),
                tint = InstagramColors.TextPrimary
            )
        }
    }
}
