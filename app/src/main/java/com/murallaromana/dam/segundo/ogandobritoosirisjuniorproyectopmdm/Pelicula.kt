package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm

import java.io.Serializable

class Pelicula(
    var titulo: String,
    var genero: String,
    var director: String,
    var año: Int,
    var url: String

): Serializable {

    fun getTituloPelicula(): String {
        return titulo + " " + año
    }

    fun getGeneroPelicula(): String {
        return genero
    }

    fun getDirectorPelicula(): String {

        return director
    }

}