package uz.bahrom.myapps.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.bahrom.myapps.databinding.ItemAdsBinding
import uz.bahrom.myapps.domain.params.ItemAdsParam

class AdapterAds : ListAdapter<ItemAdsParam, AdapterAds.AdsViewHolder>(AdsDiffUtil) {

    object AdsDiffUtil : DiffUtil.ItemCallback<ItemAdsParam>() {
        override fun areItemsTheSame(oldItem: ItemAdsParam, newItem: ItemAdsParam): Boolean {
            return newItem.id == oldItem.id
        }

        override fun areContentsTheSame(oldItem: ItemAdsParam, newItem: ItemAdsParam): Boolean {
            return newItem == oldItem
        }

    }

    inner class AdsViewHolder(private val binding: ItemAdsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdsViewHolder {
        return AdsViewHolder(
            ItemAdsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AdsViewHolder, position: Int) {
        return holder.bind(position)
    }
}