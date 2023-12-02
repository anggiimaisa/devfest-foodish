package com.devfest.foodish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.devfest.foodish.config.DrinkConfig
import com.devfest.foodish.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            viewModel.uiState.collect {uiState ->
                when (uiState) {
                    is MainUiState.DessertConfigSuccess -> {
                        val isEnable = uiState.isEnable
                        setDessertValue(isEnable)
                    }
                    is MainUiState.DrinkConfigSuccess -> {
                        val config = uiState.config
                        setTopDrinkName(config)
                    }
                    is MainUiState.Error -> { /* no-op */ }
                    is MainUiState.None -> { /* no-op */  }
                }
            }
        }
    }

    private fun setDessertValue(isEnable: Boolean) {
        binding.tvDessertConfigStatus.text = "Dessert Config Status: $isEnable"
    }

    private fun setTopDrinkName(config: DrinkConfig) {
        binding.tvTopDrink.apply {
            isVisible = config.enabled
            text = "Our Top Drink for Today: ${config.topDrink}"
        }
    }

}