package uz.bahrom.myapps.utils.navigation

import androidx.navigation.NavDirections

interface AppNavigator {
    suspend fun navigateTo(directions: NavDirections)
    suspend fun navigateUp()
}