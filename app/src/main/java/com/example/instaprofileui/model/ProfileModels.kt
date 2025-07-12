package com.example.instaprofileui.model

data class UserProfile(
    val username: String,
    val displayName: String,
    val bio: String,
    val description: String,
    val postsCount: String,
    val followersCount: String,
    val followingCount: String,
    val profileImageRes: Int,
    val isFollowing: Boolean = false
)

data class Highlight(
    val title: String,
    val imageRes: Int
)
