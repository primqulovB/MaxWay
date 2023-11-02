package uz.bahrom.myapps.domain.params

data class ItemProductParam(
    val id: String,
    val name: String,
    val cost: Int,
    val discription: String,
    val image: String,
    val categoryId: String
)
