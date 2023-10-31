package uz.bahrom.myapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.bahrom.myapps.databinding.ActivityMainBinding
import uz.bahrom.myapps.utils.navigation.AppNavigatorHandler
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var handler: AppNavigatorHandler
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val contenerView = binding.fragmentContainerView
        val navController = contenerView.getFragment<NavHostFragment>().navController

        handler.buffer
            .onEach { actionCallBack ->
                Log.d("TAG_BUFFER", "onCreate: actionCallBack: $actionCallBack")
                navController.actionCallBack()
            }.launchIn(lifecycleScope)

    }

}