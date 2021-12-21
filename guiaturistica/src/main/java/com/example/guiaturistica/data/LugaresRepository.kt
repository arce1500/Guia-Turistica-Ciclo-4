package com.example.guiaturistica.data

class LugaresRepository {
    suspend fun getLugares()= ApiFactory.retrofit.getLugares()
}