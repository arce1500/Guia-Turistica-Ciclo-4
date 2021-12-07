package com.example.guiaturisticaciclo4.utils

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonElement

class lugaresAdapter(
    private var lugaresNames: ArrayList<String>,
    private var lugaresdescription: ArrayList<String>,
    private var lugareslocation: ArrayList<String>,
    private var lugaresimageUrl: ArrayList<String>,
    private var lugarespuntuacion: ArrayList<String>,

    ):RecyclerView.Adapter<lugaresAdapter.lugarHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): lugarHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: lugarHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = lugaresNames.size


    class lugarHolder(val view:View):RecyclerView.ViewHolder(view) {

    }

}