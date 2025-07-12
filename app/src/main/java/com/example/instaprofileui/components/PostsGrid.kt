package com.example.instaprofileui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PostsGrid(images: List<Int>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        horizontalArrangement = Arrangement.spacedBy(1.dp),
        verticalArrangement = Arrangement.spacedBy(1.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(images) { imageRes ->
            PostGridItem(imageRes = imageRes)
        }
    }
}

@Composable
private fun PostGridItem(imageRes: Int) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Post",
        modifier = Modifier
            .aspectRatio(1f)
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}
