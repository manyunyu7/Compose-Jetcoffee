package com.feylabs.compose_jetcoffee.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.feylabs.compose_jetcoffee.model.dummyCategory


@Composable
fun CategoryRow(modifier: Modifier = Modifier) {
    LazyRow(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        items(dummyCategory, key = { it.textCategory }) { category ->
            CategoryItem(category = category)
        }
    }
}
