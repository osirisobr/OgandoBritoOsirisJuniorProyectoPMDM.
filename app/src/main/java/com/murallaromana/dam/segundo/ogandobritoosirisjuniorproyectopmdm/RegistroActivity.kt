package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class RegistroActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    lateinit var btHacerEfectivoRegistro: Button
    lateinit var etUsuarioR: EditText
    lateinit var etContraseñaR: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)






        btHacerEfectivoRegistro=findViewById(R.id.btHacerEfectivoRegistro)
        sharedPreferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        btHacerEfectivoRegistro.setOnClickListener(){
        Toast.makeText(this,"Informacion Guardada" ,Toast.LENGTH_LONG).show()
            val nombre: String = etUsuarioR.text.toString()
         val contraseña: String = etContraseñaR.text.toString()
         val editor: SharedPreferences.Editor = sharedPreferences.edit()
         editor.putString("NOMBRE",nombre)
         editor.putString("CONTRASEÑA",contraseña)
         editor.apply()


            val intent = Intent(this, PeliculasActivity:: class.java)
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