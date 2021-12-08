package com.example.guiaturisticaciclo4.utils

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.guiaturisticaciclo4.SitiosTuristicos
import com.google.gson.JsonElement

class lugaresAdapter(val lugares:ArrayList<SitiosTuristicos>):RecyclerView.Adapter<lugaresAdapter.lugarHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): lugarHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: lugarHolder, position: Int) {
        holder.render(lugares[position])
    }

    override fun getItemCount(): Int = lugares.size


    class lugarHolder(val view:View):RecyclerView.ViewHolder(view) {
        fun render(lugares:SitiosTuristicos){

        }
    }

}