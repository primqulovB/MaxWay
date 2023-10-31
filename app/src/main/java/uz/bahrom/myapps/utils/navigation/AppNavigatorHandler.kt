package uz.bahrom.myapps.utils.navigation

import androidx.navigation.NavController
import kotlinx.coroutines.flow.SharedFlow

typealias AppNavigationArgs = NavController.() -> Unit

interface AppNavigatorHandler {

    val buffer: SharedFlow<AppNavigationArgs>
}