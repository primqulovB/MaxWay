package uz.bahrom.myapps.presentation.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.bahrom.myapps.R
import uz.bahrom.myapps.databinding.ItemCategoryBinding
import uz.bahrom.myapps.domain.params.ItemCategoryParam

class AdapterCategory :
    ListAdapter<ItemCategoryParam, AdapterCategory.CategoryViewHolder>(CategoryDiffUtil) {

    private var clickCategory: (((String), (String)) -> Unit)? = null


    fun setClikCategoryListener(blok: ((String, String) -> Unit)) {
        clickCategory = blok
    }

    object CategoryDiffUtil : DiffUtil.ItemCallback<ItemCategoryParam>() {
        override fun areItemsTheSame(
            oldItem: ItemCategoryParam,
            newItem: ItemCategoryParam
        ): Boolean {
            return newItem.id == oldItem.id
        }

        override fun areContentsTheSame(
            oldItem: ItemCategoryParam,
            newItem: ItemCategoryParam
        ): Boolean {
            return newItem == oldItem
        }

    }

    inner class CategoryViewHolder(val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {

            binding.categoryCard.setOnClickListener { view ->
                getItem(adapterPosition).isSelected = !getItem(adapterPosition).isSelected
                clickCategory?.invoke(getItem(adapterPosition).id, getItem(adapterPosition).name)
                binding.categoryCard.setBackgroundResource(if (getItem(adapterPosition).isSelected == true) R.drawable.bg_category_item_selected else R.drawable.bg_category_item)
                binding.categoryName.setTextColor(if (getItem(adapterPosition).isSelected == true) Color.WHITE else Color.BLACK)
            }
        }

        fun bind(position: Int) {
            binding.categoryName.text = getItem(position).name
            binding.categoryCard.setBackgroundResource(if (getItem(position).isSelected == true) R.drawable.bg_category_item_selected else R.drawable.bg_category_item)
            binding.categoryName.setTextColor(if (getItem(position).isSelected == true) Color.WHITE else Color.BLACK)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) = holder.bind(position)
}