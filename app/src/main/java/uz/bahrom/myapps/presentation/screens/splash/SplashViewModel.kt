package uz.bahrom.myapps.presentation.screens.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.bahrom.myapps.data.sourse.local.shared_preferences.MySharedPreferences
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val pref: MySharedPreferences,
    private val diraction: SplashDiraction
) : SplashContract.SplashViewModel, ViewModel() {

    init {
        viewModelScope.launch {
            delay(2000)
            if (true) {
                diraction.moveToHomeScreen()
            } else {
                diraction.moveToLoginScreen()
            }
        }
    }
}