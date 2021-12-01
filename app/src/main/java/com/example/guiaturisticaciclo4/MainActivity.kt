package com.example.guiaturisticaciclo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guiaturisticaciclo4.utils.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardview)
        val getList = Utils(this).getList()
        println(getList)
    }
}