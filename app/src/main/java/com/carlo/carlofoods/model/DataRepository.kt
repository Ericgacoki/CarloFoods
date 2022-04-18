package com.carlo.carlofoods.model

import com.carlo.carlofoods.R

class DataRepository {
    fun getData(): List<FoodItem> {
        return listOf(
            FoodItem(R.drawable.egg, "Pizza (Large)", 6.02F),
            FoodItem(R.drawable.donut, "Donut", 1.00F),
            FoodItem(R.drawable.eggs, "Eggs (2)", 3.10F),
            FoodItem(R.drawable.cheese, "Cheese", 2.20F),
            FoodItem(R.drawable.humbuger, "Hamburger ", 4.31F),
            FoodItem(R.drawable.egg, "Egg", 0.33F),
            FoodItem(R.drawable.butter, "Butter", 1.50F),
            FoodItem(R.drawable.hamburger_cheese, "Burger Cheese", 5.66F),
            FoodItem(R.drawable.pizza, "Pizza (Large)", 6.02F),
            FoodItem(R.drawable.donut, "Donut", 1.00F),
            FoodItem(R.drawable.eggs, "Eggs (2)", 3.10F),
            FoodItem(R.drawable.cheese, "Cheese", 2.20F),
            FoodItem(R.drawable.humbuger, "Hamburger ", 4.31F),
            FoodItem(R.drawable.egg, "Egg", 0.33F),
            FoodItem(R.drawable.butter, "Butter", 1.50F),
            FoodItem(R.drawable.hamburger_cheese, "Burger Cheese", 5.66F),
            FoodItem(R.drawable.humbuger, "Hamburger ", 4.31F),
            FoodItem(R.drawable.egg, "Egg", 0.33F),
            FoodItem(R.drawable.butter, "Butter", 1.50F),
            FoodItem(R.drawable.hamburger_cheese, "Burger Cheese", 5.66F)
        )
    }
}