package com.example.guiaturisticaciclo4.utils

import android.content.Context
import com.example.guiaturisticaciclo4.R
import com.example.guiaturisticaciclo4.model.SitioTuristico
import com.example.guiaturisticaciclo4.model.SitioTuristicoItem
import com.google.gson.Gson
import java.io.IOException

class Utils (val context: Context){
    fun getList (): Array<String>{
        return context.resources.getStringArray(R.array.lista_uno)
    }

    fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }


    fun fileToJson(context: Context,fileName: String): ArrayList<SitioTuristicoItem>{
        var lista : String = context.assets.open(fileName).bufferedReader().use { it.readText() }
        val gson = Gson()
        val data = gson.fromJson(lista, SitioTuristico::class.java)
        return data

    }
}