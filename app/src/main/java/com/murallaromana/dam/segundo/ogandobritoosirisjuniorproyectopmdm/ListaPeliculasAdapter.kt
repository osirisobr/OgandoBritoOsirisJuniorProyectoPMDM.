package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size

class ListaPeliculasAdapter(val peliculas : List<Pelicula>, val context: Context) : RecyclerView.Adapter<ListaPeliculasAdapter.PeliculaHolder>() {


    class PeliculaHolder  (view: View) : RecyclerView.ViewHolder(view){
        val tvTitulo = view.findViewById<TextView>(R.id.tvTituloAño)
        val tvGenero = itemView.findViewById<TextView>(R.id.tvGenero)
        val tvDirector = itemView.findViewById<TextView>(R.id.tvDirector)
        val ivCaratula = itemView.findViewById<ImageView>(R.id.ivCaratula)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.item_pelicula, parent, false)

        return PeliculaHolder(inflater)
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        val Pelicula = peliculas.get(position)

        holder.tvTitulo.setText(Pelicula.titulo)
        holder.tvGenero.setText(Pelicula.genero)
    }

    override fun getItemCount(): Int{
        return peliculas.size
    }


}
