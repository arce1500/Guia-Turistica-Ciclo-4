package com.example.guiaturistica.data

import com.example.guiaturistica.model.SitioTuristico
import retrofit2.http.GET

interface ApiService {
    @GET("arce1500/Guia-Turistica-Ciclo-4/lugares")
    suspend fun getLugares() : SitioTuristico
}