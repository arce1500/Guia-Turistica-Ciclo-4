package com.example.guiaturisticaciclo4.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.guiaturisticaciclo4.R
import com.example.guiaturisticaciclo4.SitiosTuristicos

class lugaresAdapter(val lugares:ArrayList<SitiosTuristicos>):RecyclerView.Adapter<lugaresAdapter.LugarHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugarHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return  LugarHolder(v)
    }

    override fun onBindViewHolder(holder: LugarHolder, position: Int) {
        holder.render(lugares [position])
    }

    override fun getItemCount(): Int = lugares.size


    class LugarHolder(private val view:View):RecyclerView.ViewHolder(view) {
        fun render(lugares:SitiosTuristicos) {
                view.ite
        }
    }

}


