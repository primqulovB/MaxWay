package uz.bahrom.myapps.presentation.screens.main.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.bahrom.myapps.R

@AndroidEntryPoint
class DetailScreen : Fragment(R.layout.screen_detail) {
    private val viewModel: DetailContract.DetailViewModel by viewModels<DetailViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}