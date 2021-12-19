package com.example.guiaturisticaciclo4.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.guiaturisticaciclo4.R
import com.example.guiaturisticaciclo4.model.SitioTuristicoItem
import com.squareup.picasso.Picasso

class LugaresAdapter (val lugareslist: ArrayList<SitioTuristicoItem>): RecyclerView.Adapter<LugaresAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_lugares, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val sitioTuristico = lugareslist[position]
        holder.render(sitioTuristico)

    }

    override fun getItemCount(): Int =  lugareslist.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var nameTextView : TextView = view.findViewById(R.id.card_nombre_lugar)
        var ubicacionTextView : TextView = view.findViewById(R.id.card_ubicacion_lugar)
        var puntuacionTextView : TextView = view.findViewById(R.id.card_puntuacion_lugar)
        var imageView: ImageView = view.findViewById(R.id.card_imagen_lugar)

        fun render(sitiosTuristicos: SitioTuristicoItem){
            nameTextView.text = sitiosTuristicos.name
            ubicacionTextView.text = sitiosTuristicos.location
            puntuacionTextView.text = sitiosTuristicos.puntuacion.toString()
            Picasso.get().load(sitiosTuristicos.imageUrl).into(imageView)

        }
    }
}