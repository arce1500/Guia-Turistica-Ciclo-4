package com.example.guiaturisticaciclo4.utils

import android.content.Context
import com.example.guiaturisticaciclo4.R
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

}