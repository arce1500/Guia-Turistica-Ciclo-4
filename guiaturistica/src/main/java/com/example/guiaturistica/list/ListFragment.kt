package com.example.guiaturistica.list


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.guiaturistica.databinding.FragmentDetailBinding
import com.example.guiaturistica.model.SitioTuristico
import com.example.guiaturistica.model.SitioTuristicoItem
import com.google.gson.Gson


class ListFragment : Fragment() {

    lateinit var listLugares : ArrayList<SitioTuristicoItem>
    private lateinit var listBinding: FragmentDetailBinding
    lateinit var lugaresAdapter: LugaresAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        listBinding = FragmentDetailBinding.inflate(inflater, container, false)
        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listLugares =  json()
        lugaresAdapter = LugaresAdapter(listLugares, onItemClicked = {onListaCliked(it)})



    }
    private fun json(): ArrayList<SitioTuristicoItem> {
        val lista : String = context?.assets?.open("lugares.json")?.bufferedReader().use { it!!.readText() }
        val gson = Gson()
        val data = gson.fromJson(lista, SitioTuristico::class.java)
        return data
    }
    private fun onListaCliked(lugar: SitioTuristicoItem) {

    }

}