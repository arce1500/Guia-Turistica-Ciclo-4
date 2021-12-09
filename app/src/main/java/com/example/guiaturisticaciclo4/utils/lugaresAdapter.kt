package com.example.guiaturisticaciclo4.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.guiaturisticaciclo4.R
import com.example.guiaturisticaciclo4.SitiosTuristicos
import com.squareup.picasso.Picasso

class lugaresAdapter(val lugares:ArrayList<SitiosTuristicos>):RecyclerView.Adapter<lugaresAdapter.LugarHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugarHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return  LugarHolder(v)
    }

    override fun onBindViewHolder(holder: LugarHolder, i: Int) {
        holder.render(lugares[i])
    }

    override fun getItemCount(): Int = lugares.size


   inner class LugarHolder(view:View):RecyclerView.ViewHolder(view) {
        var itemName : TextView
        var itemDetail : TextView
        var itemLocation : TextView
        var itemScore : TextView
        var itemImage : ImageView

        init {
            itemName = itemView.findViewById(R.id.item_name)
            itemDetail = itemView.findViewById(R.id.item_description)
            itemLocation = itemView.findViewById(R.id.item_location)
            itemScore = itemView.findViewById(R.id.item_punt)
            itemImage = itemView.findViewById(R.id.item_image)
        }

       fun render ( lugar: SitiosTuristicos) {
           itemName.text = lugar.lugarNAme
           itemDetail.text = lugar.lugarDescription
           itemLocation.text = lugar.lugarLocation
           itemScore.text = lugar.lugarPuntuation
           Picasso.get().load(lugar.lugarImage).into(itemImage)

       }

   }

}


