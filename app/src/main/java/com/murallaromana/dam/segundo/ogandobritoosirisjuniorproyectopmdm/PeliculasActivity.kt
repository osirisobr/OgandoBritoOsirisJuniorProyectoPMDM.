package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PeliculasActivity : AppCompatActivity() {
    private lateinit var rvPeliculas : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peliculas)
        rvPeliculas=findViewById(R.id.rvPeliculas)
        rvPeliculas.layoutManager = LinearLayoutManager(this)



    }
}