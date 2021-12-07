package com.example.guiaturisticaciclo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guiaturisticaciclo4.utils.Utils
import com.google.gson.JsonElement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardview)
        val lugaresList:Array<JsonElement> = Utils(this).getJsonDataFromAsset(applicationContext, "lugares.json")
        println(lugaresList?.get(0).name)

    }
}