package com.feylabs.compose_jetcoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.feylabs.compose_jetcoffee.components.Banner
import com.feylabs.compose_jetcoffee.components.BottomBar
import com.feylabs.compose_jetcoffee.components.CategoryRow
import com.feylabs.compose_jetcoffee.components.MenuCategoryRow
import com.feylabs.compose_jetcoffee.components.SectionText
import com.feylabs.compose_jetcoffee.model.dummyBestSellerMenu
import com.feylabs.compose_jetcoffee.model.dummyMenu
import com.feylabs.compose_jetcoffee.ui.theme.ComposeJetcoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeJetcoffeeTheme {
                JetCoffeeApp()
            }
        }
    }
}

@Composable()
fun JetCoffeeApp() {
    Scaffold(
        bottomBar = {
            BottomBar(modifier = Modifier)
        }
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(it),
        ) {
            Banner()
            HomeSection(title = "Mau Ngopi Apa Hari Ini ?") {
                CategoryRow(modifier = Modifier.padding(top = 20.dp))
            }
            HomeSection(title = stringResource(id = R.string.section_category)) {
                MenuCategoryRow(listMenu = dummyMenu)
            }
            HomeSection(title = stringResource(id = R.string.section_best_seller_menu)) {
                MenuCategoryRow(listMenu = dummyBestSellerMenu)
            }
        }
    }
}

@Composable
fun HomeSection(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    SectionText(title = title)
    content()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JetCoffeeAppPreview() {
    ComposeJetcoffeeTheme {
        JetCoffeeApp()
    }
}