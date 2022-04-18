package com.carlo.carlofoods.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.carlo.carlofoods.R
import com.carlo.carlofoods.adapter.FoodAdapter
import com.carlo.carlofoods.databinding.FoodItemPayBinding
import com.carlo.carlofoods.databinding.FragmentHomeBinding
import com.carlo.carlofoods.model.DataRepository
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment(), FoodAdapter.ClickedFood {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var foodAdapter = FoodAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater)

        return binding.root.apply {

            foodAdapter.foodItemList = DataRepository().getData()
            binding.foodRecyclerView.apply {
                adapter = foodAdapter
            }
        }
    }

    override fun clicked(position: Int, item: View, id: Int) {
        val image = foodAdapter.foodItemList[position].image
        val title = foodAdapter.foodItemList[position].title

        when (id) {
            R.id.btnBuy -> {
                showBuyDialog(image, position, title)
            }
            else -> {
                Snackbar.make(item, title, Snackbar.LENGTH_SHORT).apply {
                    setBackgroundTint(requireActivity().getColor(R.color.teal_200))
                    setTextColor(requireActivity().getColor(R.color.white))
                    setAction("Ok") {
                        this.dismiss()
                    }
                    show()
                }
            }
        }
    }

    private fun showBuyDialog(image: Int, position: Int, title: String) {
        val dialogBinding = FoodItemPayBinding.inflate(layoutInflater)
        var price = foodAdapter.foodItemList[position].price
        var quantity = 1

        BottomSheetDialog(requireContext()).apply {
            dialogBinding.apply {
                setContentView(this.root)

                clickedFoodTitle.text = title
                totalPrice.text = "Price: $ $price" as String
                serving.text = "Serving: $quantity" as String

                btnMinus.setOnClickListener {
                    if (quantity > 1) {
                        quantity -= 1
                        price = quantity * foodAdapter.foodItemList[position].price

                        this.totalPrice.text = "Price: $ $price" as String
                        this.serving.text = "Serving: $quantity" as String
                    }
                }

                btnPlus.setOnClickListener {
                    if (quantity < 6) {
                        quantity += 1
                        price = quantity * foodAdapter.foodItemList[position].price

                        this.totalPrice.text = "Price: $ $price" as String
                        this.serving.text = "Serving: $quantity" as String
                    } else {
                        Toast.makeText(
                            requireContext(),
                            "6 is the max per order",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                btnPay.setOnClickListener { it ->
                    Toast.makeText(
                        requireContext(),
                        "Pay $ $price for $quantity $title(s)",
                        Toast.LENGTH_SHORT
                    ).show()

                    dismiss()
                    findNavController().navigate(R.id.action_homeFragment_to_payFragment)
                    
                }
            }
            show()
        }
    }
}