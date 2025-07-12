package com.example.instaprofileui.data

import com.example.instaprofileui.R
import com.example.instaprofileui.model.UserProfile
import com.example.instaprofileui.model.Highlight

object ProfileRepository {
    val user = UserProfile(
        username = "roy.apurv",
        displayName = "Apurv Roy",
        bio = "Software Developer",
        description = "Passionate about software development \nAlways learning and building \nTeam player",
        postsCount = "1,234",
        followersCount = "567K",
        followingCount = "100",
        profileImageRes = R.drawable.pic3
    )

    val highlights = listOf(
        Highlight("Travel", R.drawable.pic2),
        Highlight("Food", R.drawable.pic3),
        Highlight("Work", R.drawable.pic4),
        Highlight("Friends", R.drawable.pic6),
        Highlight("More", R.drawable.pic7)
    )

    val postImages = listOf(
        R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
        R.drawable.pic4, R.drawable.pic6, R.drawable.pic7,
        R.drawable.pic8, R.drawable.pic9, R.drawable.pic10,
        R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
        R.drawable.pic4, R.drawable.pic6, R.drawable.pic7,
        R.drawable.pic8, R.drawable.pic9, R.drawable.pic10,
        R.drawable.pic1, R.drawable.pic2
    )
}
