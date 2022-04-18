package com.carlo.carlofoods.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carlo.carlofoods.R
import com.carlo.carlofoods.databinding.FragmentPayBinding

class PayFragment : Fragment() {
    private var _binding: FragmentPayBinding? = null
    private val binding get() = _binding!!
    private var price = 0F
    private var foodTitle = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPayBinding.inflate(layoutInflater)
        return binding.apply {
            editTextPIN.requestFocus()
        }.root
    }
}