package uz.bahrom.myapps.presentation.screens.main.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import uz.bahrom.myapps.R

@AndroidEntryPoint
class HomeScreen : Fragment(R.layout.screen_home) {

    private val viewModel: HomeContract.HomeViewModel by viewModels<HomeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launch {

        }
    }
}