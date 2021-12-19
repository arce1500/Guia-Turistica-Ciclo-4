package com.example.guiaturisticaciclo4.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guiaturisticaciclo4.R
import com.example.guiaturisticaciclo4.detalle.DetalleActivity
import com.example.guiaturisticaciclo4.model.SitioTuristico
import com.example.guiaturisticaciclo4.model.SitioTuristicoItem
import com.google.gson.Gson

class ListLugaresActivity : AppCompatActivity() {

    lateinit var listLugares : ArrayList<SitioTuristicoItem>
    lateinit var lugaresAdapter: LugaresAdapter
    lateinit var lugaresRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_lugares)

        lugaresRecyclerView = findViewById(R.id.recycler_card_lugares)
        listLugares =  json()

        lugaresAdapter = LugaresAdapter(listLugares, onItemClicked = {onListaCliked(it)})

        lugaresRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = lugaresAdapter
            setHasFixedSize(false)
        }
    }

    private fun onListaCliked(lugar: SitioTuristicoItem) {
        val intent = Intent(this,DetalleActivity::class.java)
        intent.putExtra("lugar",lugar)
        startActivity(intent)
    }

    private fun json(): ArrayList<SitioTuristicoItem> {
        val lista : String = application.assets.open("lugares.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val data = gson.fromJson(lista, SitioTuristico::class.java)
        return data

    }


}