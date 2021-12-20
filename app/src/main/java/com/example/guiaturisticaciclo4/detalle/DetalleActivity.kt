package com.example.guiaturisticaciclo4.detalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guiaturisticaciclo4.databinding.ActivityDetalleBinding
import com.example.guiaturisticaciclo4.model.SitioTuristicoItem
import com.squareup.picasso.Picasso

class DetalleActivity : AppCompatActivity() {

    private lateinit var detalleBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detalleBinding.root)

        val lugar: SitioTuristicoItem = intent.extras?.getSerializable("lugar") as SitioTuristicoItem

        with(detalleBinding){
            tituloLugar.text = lugar.name
            detalleLugarTexto.text = lugar.description
            ubicacionLugarTexto.text = lugar.location
            puntuacionLugarValor.text = lugar.puntuacion.toString()
            Picasso.get().load(lugar.imageUrl).into(imageLugar)
        }

    }
}