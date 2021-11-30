package com.example.guiaturisticaciclo4.utils

import android.content.Context
import com.example.guiaturisticaciclo4.R

class Utils (val context: Context){
    fun getList (): Array<String>{
        return context.resources.getStringArray(R.array.lista_uno)
    }
}