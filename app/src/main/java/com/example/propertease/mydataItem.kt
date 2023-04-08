package com.example.propertease

data class mydataItem(
    val address: Address,
    val bathrooms: Double,
    val bedrooms: Int,
    val homeStatus: String,
    val livingArea: Int,
    val photos: List<String>,
    val price: Int,
    val url: String,
    val yearBuilt: Int
)