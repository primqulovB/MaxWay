package uz.bahrom.myapps.utils.navigation

import androidx.navigation.NavDirections
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppNavigationDispatcher @Inject constructor() : AppNavigator, AppNavigatorHandler {
    override val buffer = MutableSharedFlow<AppNavigationArgs>()

    private suspend fun navigate(block: AppNavigationArgs) {
        buffer.emit(block)
    }

    override suspend fun navigateTo(directions: NavDirections) = navigate {
        navigate(directions)
    }

    override suspend fun navigateUp() = navigate {
        navigateUp()
    }
}