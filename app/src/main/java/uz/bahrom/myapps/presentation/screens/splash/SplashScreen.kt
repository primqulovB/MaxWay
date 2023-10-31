package uz.bahrom.myapps.presentation.screens.splash

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uz.bahrom.myapps.R

@AndroidEntryPoint
class SplashScreen : Fragment(R.layout.screen_splash) {

    private val viewModel: SplashContract.SplashViewModel by viewModels<SplashViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel
    }
}