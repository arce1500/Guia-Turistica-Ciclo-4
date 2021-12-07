package com.example.guiaturisticaciclo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guiaturisticaciclo4.utils.Utils
import org.json.JSONArray

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardview)
        val lugaresList = Utils(this).getJsonDataFromAsset(applicationContext, "lugares.json")
        val array = JSONArray(lugaresList)
        println(array[1])
        val nombres: ArrayList<String> = ArrayList()
        for (i in 0 until array.length()){
            val cityInfo = array.getJSONObject(i)
            nombres.add(cityInfo.getString("name"))
        }
        println(nombres)


    }
}