package com.example.guiaturisticaciclo4.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SitioTuristicoItem(
    @SerializedName("description")
    val description: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("location")
    val location: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("puntuacion")
    val puntuacion: Int
): Serializable