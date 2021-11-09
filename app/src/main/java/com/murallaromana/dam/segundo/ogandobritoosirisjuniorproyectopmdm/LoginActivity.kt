package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    private lateinit var btRegistrarse: Button
    private lateinit var btAcceder: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_OgandoBritoOsirisJuniorProyectoPMDM)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btRegistrarse=findViewById(R.id.btRegistrarse)
        btAcceder=findViewById(R.id.btAcceder)

        btAcceder.setOnClickListener(){

            val intent = Intent(this, AccesoActivity::class.java)
            startActivity(intent)
        }

        btRegistrarse.setOnClickListener(){

            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }








    }
}

