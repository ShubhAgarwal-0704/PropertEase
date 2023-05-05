package com.example.propertease

data class DataItem(
    val address: AddressX,
    val bathrooms: Double,
    val bedrooms: Int,
    val chanceToSellFaster: String,
    val currency: String,
    val datePostedString: String,
    val daysOnZillow: Int,
    val description: String,
    val favoriteCount: Int,
    val homeStatus: String,
    val homeType: String,
    val latitude: Double,
    val listedBy: ListedBy,
    val livingArea: Int,
    val longitude: Double,
    val pageViewCount: Int,
    val photos: List<String>,
    val price: Int,
    val rentZestimate: Int,
    val timeOnZillow: String,
    val url: String,
    val yearBuilt: Int,
    val zestimate: Int,
    val zpid: Int
)