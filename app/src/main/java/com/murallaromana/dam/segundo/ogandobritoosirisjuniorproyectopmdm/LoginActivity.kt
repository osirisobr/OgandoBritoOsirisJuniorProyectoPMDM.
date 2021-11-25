package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.prefs.Preferences

class LoginActivity : AppCompatActivity() {


    private lateinit var btRegistrarse: Button
    private lateinit var btAcceder: Button
    private lateinit var etPersona: EditText
    private lateinit var etContraseña: EditText
    lateinit var cbRecuerdame: CheckBox
    lateinit var preferences: SharedPreferences
    var recuerdame = false


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_OgandoBritoOsirisJuniorProyectoPMDM)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btRegistrarse=findViewById(R.id.btRegistrarse)
        btAcceder=findViewById(R.id.btAcceder)

          preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)


        if ( recuerdame ) {
            val intent = Intent(this, PeliculasActivity::class.java)
            startActivity(intent)
            finish()
        }





        btAcceder.setOnClickListener(){

//      val name = preferences.getString( "NOMBRE","")
//        etPersona.text = name
//        val contraseña = preferences.getString( "CONTRASEÑA","" )
//        etContraseña.text = contraseña





            Toast.makeText(this,"informacion guardada", Toast.LENGTH_LONG).show()

            val intent = Intent(this, PeliculasActivity::class.java)
            startActivity(intent)
            finish()


        }

        btRegistrarse.setOnClickListener(){

            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)

        }


    }
    private fun showAlert(message: String){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("My preferences")
        builder.setMessage(message)
        val dialog = builder.create()
        dialog.show()
    }

}

