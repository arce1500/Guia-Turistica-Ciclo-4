package com.example.guiaturistica.list


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.guiaturistica.data.LugaresRepository
import com.example.guiaturistica.databinding.FragmentListBinding
import com.example.guiaturistica.main.MainActivity
import com.example.guiaturistica.model.SitioTuristico
import com.example.guiaturistica.model.SitioTuristicoItem
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class ListFragment : Fragment() {

     var listLugares : ArrayList<SitioTuristicoItem> = arrayListOf()
    private lateinit var listViewModel: ListViewModel
    private lateinit var listBinding: FragmentListBinding
    lateinit var lugaresAdapter: LugaresAdapter






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        listBinding = FragmentListBinding.inflate(inflater, container, false)
        listViewModel = ViewModelProvider(this)[ListViewModel::class.java]
        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)?.hideIcon()

        listViewModel.getLugaresFromServer()

        listViewModel.onlugaresLoaded.observe(viewLifecycleOwner, { result ->
            onLugaresLoadedSubscribe(result)
        })

        //listLugares =  json()
            //print(listLugares)
        lugaresAdapter = LugaresAdapter(listLugares, onItemClicked = {onListaCliked(it)})

        listBinding.recyclerCardLugares.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = lugaresAdapter
            setHasFixedSize(false)
        }


    }
    private fun onLugaresLoadedSubscribe(result: ArrayList<SitioTuristicoItem>?) {
        result?.let { listSuperheroes ->
            lugaresAdapter.appendItems(listSuperheroes)
            /*
            // TODO: revisar feedback
            this.listSuperheroes = listSuperheroes
            superHeroesAdapter.notifyDataSetChanged()
            */
        }
    }

    private fun json(): SitioTuristico {
        val lista : String = context?.assets?.open("lugares.json")?.bufferedReader().use { it!!.readText() }
        val gson = Gson()
        val data = gson.fromJson(lista, SitioTuristico::class.java)
        return data
    }
    private fun onListaCliked(lugar: SitioTuristicoItem) {
        findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(lugar = lugar))

    }

}