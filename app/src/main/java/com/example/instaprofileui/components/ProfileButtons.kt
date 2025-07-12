package com.example.instaprofileui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instaprofileui.ui.theme.InstagramColors

@Composable
fun ProfileActionButtons(isFollowing: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 2.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        FollowButton(
            isFollowing = isFollowing,
            modifier = Modifier.weight(1f)
        )

        MessageButton(modifier = Modifier.weight(1f))
    }
}

@Composable
private fun FollowButton(
    isFollowing: Boolean,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { },
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = InstagramColors.Primary
        ),
        shape = RoundedCornerShape(6.dp)
    ) {
        Text(
            text = if (isFollowing) "Following" else "Follow",
            color = Color.White
        )
    }
}

@Composable
private fun MessageButton(modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = { },
        modifier = modifier,
        shape = RoundedCornerShape(6.dp)
    ) {
        Text(
            text = "Message",
            color = InstagramColors.TextPrimary
        )
    }
}

