package com.example.instaprofileui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaprofileui.model.UserProfile
import com.example.instaprofileui.ui.theme.InstagramColors

@Composable
fun ProfileInfoSection(user: UserProfile) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfileImage(
                imageRes = user.profileImageRes,
                size = 80.dp
            )

            Spacer(modifier = Modifier.width(24.dp))

            ProfileStats(
                postsCount = user.postsCount,
                followersCount = user.followersCount,
                followingCount = user.followingCount
            )
        }

        ProfileBio(
            displayName = user.displayName,
            bio = user.bio,
            description = user.description
        )
    }
}

@Composable
fun ProfileImage(
    imageRes: Int,
    size: androidx.compose.ui.unit.Dp,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Profile Picture",
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .border(2.dp, InstagramColors.Border, CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun ProfileStats(
    postsCount: String,
    followersCount: String,
    followingCount: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        StatItem(count = postsCount, label = "posts")
        StatItem(count = followersCount, label = "followers")
        StatItem(count = followingCount, label = "following")
    }
}

@Composable
private fun StatItem(count: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = count,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = InstagramColors.TextPrimary
        )
        Text(
            text = label,
            fontSize = 14.sp,
            color = InstagramColors.TextSecondary
        )
    }
}

@Composable
private fun ProfileBio(
    displayName: String,
    bio: String,
    description: String
) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
    ) {
        Text(
            text = displayName,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = InstagramColors.TextPrimary
        )
        Text(
            text = bio,
            fontSize = 14.sp,
            color = InstagramColors.TextSecondary
        )
        Text(
            text = description,
            fontSize = 14.sp,
            color = InstagramColors.TextPrimary,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}
