package com.example.guiaturistica.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.guiaturistica.data.LugaresRepository
import com.example.guiaturistica.model.SitioTuristicoItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class ListViewModel : ViewModel() {

    private var lugaresLoad : MutableLiveData<ArrayList<SitioTuristicoItem>> = MutableLiveData()
    val onlugaresLoaded: LiveData<ArrayList<SitioTuristicoItem>> = lugaresLoad

    private val repository = LugaresRepository()

    fun getLugaresFromServer(){
        GlobalScope.launch(Dispatchers.IO) {
            lugaresLoad.postValue(repository.getLugares())
        }
    }


}