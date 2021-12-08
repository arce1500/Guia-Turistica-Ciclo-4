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
        val datos: ArrayList<SitiosTuristicos> = ArrayList()
        for (i in 0 until array.length()){
            val lugarInfo = array.getJSONObject(i)
            val sitio: SitiosTuristicos = SitiosTuristicos(lugarInfo.getString("name"),
                                                           lugarInfo.getString("description"),
                                                           lugarInfo.getString("location"),
                                                           lugarInfo.getString("puntuacion"),
                                                           lugarInfo.getString("imageUrl"))

            datos.add(sitio)


        }
        println(datos)


    }
}