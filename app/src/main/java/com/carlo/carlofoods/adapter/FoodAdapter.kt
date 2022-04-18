package com.carlo.carlofoods.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.carlo.carlofoods.databinding.RawFoodItemBinding
import com.carlo.carlofoods.model.FoodItem

class FoodAdapter(val onClick: ClickedFood) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    var foodItemList = emptyList<FoodItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.FoodViewHolder =
        FoodViewHolder(
            RawFoodItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: FoodAdapter.FoodViewHolder, position: Int) {
        holder.bind(foodItemList[position])
    }

    override fun getItemCount(): Int = foodItemList.size

    inner class FoodViewHolder(private val foodItem: RawFoodItemBinding) :
        RecyclerView.ViewHolder(foodItem.root), View.OnClickListener {
        init {
            foodItem.btnBuy.setOnClickListener(this)
            foodItem.root.setOnClickListener(this)
        }

        fun bind(food: FoodItem) {
            foodItem.apply {
                foodImage.load(food.image)
                foodName.text = food.title
                foodPrice.text = "Ksh ${food.price}" as String // useless cast
            }
        }

        override fun onClick(view: View?) {
            this@FoodAdapter.onClick.clicked(adapterPosition, view!!, view.id)
        }
    }

    interface ClickedFood {
        fun clicked(position: Int, item: View, id: Int)
    }
}