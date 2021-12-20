package com.example.guiaturistica.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.guiaturistica.R
import com.example.guiaturistica.databinding.FragmentDetailBinding
import com.squareup.picasso.Picasso


class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)
        return detailBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val lugar = args.lugar

        with(detailBinding){
            tituloLugar.text = lugar.name
            detalleLugarTexto.text = lugar.description
            ubicacionLugarTexto.text = lugar.location
            puntuacionLugarValor.text = lugar.puntuacion.toString()
            com.squareup.picasso.Picasso.get().load(lugar.imageUrl).into(imageLugar)
        }
    }


}