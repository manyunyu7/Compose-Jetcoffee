package com.feylabs.compose_jetcoffee.model

import androidx.annotation.DrawableRes
import com.feylabs.compose_jetcoffee.R

data class Menu(
    @DrawableRes val image: Int,
    val price: String,
    val title: String,
)


val dummyMenu = listOf(
    Menu(R.drawable.menu1, "Tiramisu Coffee Milk", "Rp 28.000"),
    Menu(R.drawable.menu2, "Pumpkin Spice Latte", "Rp 18.000"),
    Menu(R.drawable.menu3, "Light Cappuccino", "Rp 20.000"),
    Menu(R.drawable.menu4, "Choco Creamy Latte", "Rp 16.000"),
)

val dummyBestSellerMenu = dummyMenu.shuffled()