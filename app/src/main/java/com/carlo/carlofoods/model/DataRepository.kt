package com.carlo.carlofoods.model

import com.carlo.carlofoods.R

class DataRepository {
    fun getData(): List<FoodItem> {
        return listOf(
            FoodItem(R.drawable.pizza, "Pizza (Large)", 600.02F),
            FoodItem(R.drawable.donut, "Donut", 100.00F),
            FoodItem(R.drawable.eggs, "Eggs (2)", 30.10F),
            FoodItem(R.drawable.cheese, "Cheese", 220.20F),
            FoodItem(R.drawable.humbuger, "Hamburger ", 80.31F),
            FoodItem(R.drawable.egg, "Egg", 30.33F),
            FoodItem(R.drawable.butter, "Butter", 100.50F),
            FoodItem(R.drawable.donut, "Donut", 100.00F),
            FoodItem(R.drawable.eggs, "Eggs (2)", 30.10F),
            FoodItem(R.drawable.cheese, "Cheese", 220.20F),
            FoodItem(R.drawable.humbuger, "Hamburger ", 80.31F),
            FoodItem(R.drawable.egg, "Egg", 30.33F),
            FoodItem(R.drawable.butter, "Butter", 100.50F),
            FoodItem(R.drawable.donut, "Donut", 100.00F),
            FoodItem(R.drawable.eggs, "Eggs (2)", 30.10F),
            FoodItem(R.drawable.cheese, "Cheese", 220.20F),
            FoodItem(R.drawable.humbuger, "Hamburger ", 80.31F),
            FoodItem(R.drawable.egg, "Egg", 30.33F),
            FoodItem(R.drawable.butter, "Butter", 100.50F),
        )
    }
}