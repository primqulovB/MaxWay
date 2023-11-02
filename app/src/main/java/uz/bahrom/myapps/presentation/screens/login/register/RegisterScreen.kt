package uz.bahrom.myapps.presentation.screens.login.register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import uz.bahrom.myapps.R

@AndroidEntryPoint
class RegisterScreen : Fragment(R.layout.screen_register) {
    private val viewModel: RegisterContract.RegisterViewModel by viewModels<RegisterViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}