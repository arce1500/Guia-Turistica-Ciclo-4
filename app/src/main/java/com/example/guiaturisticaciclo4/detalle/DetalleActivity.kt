package com.example.guiaturisticaciclo4.detalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guiaturisticaciclo4.R
import com.example.guiaturisticaciclo4.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {

    lateinit var detalleBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detalleBinding.root)

        val nombre = intent.extras?.getString("nombre")
        detalleBinding.tituloLugar.text = nombre

    }
}