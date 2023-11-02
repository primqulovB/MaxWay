package uz.bahrom.myapps.presentation.screens.main.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.AndroidEntryPoint
import uz.bahrom.myapps.R
import uz.bahrom.myapps.databinding.ScreenHomeBinding
import uz.bahrom.myapps.domain.params.ItemCategoryParam
import uz.bahrom.myapps.presentation.adapters.AdapterCategory

@AndroidEntryPoint
class HomeScreen : Fragment(R.layout.screen_home) {

    private val viewModel: HomeContract.HomeViewModel by viewModels<HomeViewModel>()
    private val adapter = AdapterCategory()
    private val binding by viewBinding(ScreenHomeBinding::bind)

    private val db = Firebase.firestore

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.recyclerCategory.adapter = adapter

        binding.recyclerCategory.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)



        db.collection("category")
            .get()
            .addOnSuccessListener { result ->
                val list = ArrayList<ItemCategoryParam>()

                for (document in result) {
                    if (document.id == "1") {
                        list.add(
                            ItemCategoryParam(
                                document.id,
                                document.data.get("name").toString(),
                                true
                            )
                        )
                    } else {
                        list.add(
                            ItemCategoryParam(
                                document.id,
                                document.data.get("name").toString(),
                                false
                            )
                        )
                    }
                }
                adapter.submitList(list)
            }


    }
}