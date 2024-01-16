package com.feylabs.compose_jetcoffee.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.feylabs.compose_jetcoffee.R
import com.feylabs.compose_jetcoffee.model.Menu
import com.feylabs.compose_jetcoffee.ui.theme.ComposeJetcoffeeTheme

@Composable
fun MenuItem(menu: Menu, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier.width(144.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        )
    ) {
        Column {
            Image(
                painterResource(id = menu.image),
                "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    menu.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.ExtraBold
                    )
                )
                Text(
                    text = menu.price,
                    style = MaterialTheme.typography.titleSmall,
                )
            }
        }
    }
}

@Preview()
@Composable
fun MenuItemPreview(){
    ComposeJetcoffeeTheme {
        MenuItem(menu = Menu(R.drawable.menu1,"12000", title = stringResource(R.string.category_latte)))
    }
}