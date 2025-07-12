package com.example.instaprofileui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaprofileui.model.Highlight
import com.example.instaprofileui.ui.theme.InstagramColors

@Composable
fun HighlightsSection(highlights: List<Highlight>) {
    LazyRow(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 2.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(highlights) { highlight ->
            HighlightItem(highlight = highlight)
        }
    }
}

@Composable
private fun HighlightItem(highlight: Highlight) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileImage(
            imageRes = highlight.imageRes,
            size = 70.dp
        )

        Text(
            text = highlight.title,
            fontSize = 12.sp,
            color = InstagramColors.TextPrimary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}
