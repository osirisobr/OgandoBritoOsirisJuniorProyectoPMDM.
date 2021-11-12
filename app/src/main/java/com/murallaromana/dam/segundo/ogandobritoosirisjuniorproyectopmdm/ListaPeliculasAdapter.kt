package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListaPeliculasAdapter(val peliculas : List<Pelicula>, val context: Context) : RecyclerView.Adapter<ListaPeliculasAdapter.PeliculaHolder>() {
    class PeliculaHolder  (view: View) : RecyclerView.ViewHolder(view){
        val tvPelicula = view.findViewById<TextView>(R.id.etNombre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.item_pelicula, parent, false)

        return PeliculaHolder(inflater)
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}