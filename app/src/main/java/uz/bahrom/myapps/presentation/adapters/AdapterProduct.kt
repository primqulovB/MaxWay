package uz.bahrom.myapps.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.bahrom.myapps.databinding.ItemProductBinding
import uz.bahrom.myapps.domain.params.ItemProductParam

class AdapterProduct :
    ListAdapter<ItemProductParam, AdapterProduct.ProductViewHolder>(ProductDiffUtil) {

    object ProductDiffUtil : DiffUtil.ItemCallback<ItemProductParam>() {
        override fun areItemsTheSame(
            oldItem: ItemProductParam,
            newItem: ItemProductParam
        ): Boolean {
            return newItem.id == oldItem.id
        }

        override fun areContentsTheSame(
            oldItem: ItemProductParam,
            newItem: ItemProductParam
        ): Boolean {
            return newItem == oldItem
        }

    }

    inner class ProductViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {

        }

        fun bind(position: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        return holder.bind(position)
    }
}