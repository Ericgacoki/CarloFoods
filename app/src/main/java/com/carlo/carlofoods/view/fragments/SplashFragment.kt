package com.carlo.carlofoods.view.fragments

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.carlo.carlofoods.R
import com.carlo.carlofoods.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    @Suppress("DEPRECATION")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        _binding = FragmentSplashBinding.inflate(layoutInflater)

        return binding.root.apply {
            Glide.with(requireActivity()).asGif().load(R.drawable.food_splash).into(binding.splashImage)
            Handler().postDelayed({
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            }, 4000)
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}