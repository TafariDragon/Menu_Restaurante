package com.example.menu_restaurante

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SpashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)

     Handler(Looper.getMainLooper()).postDelayed({

          var i = intent
          var j = Intent(this,DadosPedido::class.java).putExtras(i)
         startActivity(j)
         finish()

         }

     ,3000)
    }
}