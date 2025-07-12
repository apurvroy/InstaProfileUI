package com.example.instaprofileui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instaprofileui.components.*
import com.example.instaprofileui.data.ProfileRepository
import com.example.instaprofileui.ui.theme.InstaProfileUITheme
import com.example.instaprofileui.ui.theme.InstagramColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstaProfileUITheme {
                InstagramProfileScreen()
            }
        }
    }
}

@Composable
fun InstagramProfileScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = InstagramColors.Background
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            ProfileHeader(ProfileRepository.user.username)

            ProfileContent()
        }
    }
}

@Composable
private fun ProfileContent() {
    Column {
        ProfileInfoSection(ProfileRepository.user)
        ProfileActionButtons(ProfileRepository.user.isFollowing)
        HighlightsSection(ProfileRepository.highlights)
        PostsGrid(ProfileRepository.postImages)
    }
}

@Preview(showBackground = true)
@Composable
fun InstagramProfilePreview() {
    InstaProfileUITheme {
        InstagramProfileScreen()
    }
}