package com.example.menu_restaurante

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menu_restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var valorCafe = 50.0
    private var valorPao = 12.0
    private var valorSuco = 100.0
    private var valorSorvete = 200.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkCafe.setOnClickListener {
            if(binding.checkCafe.isChecked)
            {
                binding.txtQuantidadeCaf.setText("1")
            }else{
                binding.txtQuantidadeCaf.setText("0")
            }

        }

        binding.checkPao.setOnClickListener {
            if(binding.checkPao.isChecked)
            {
                binding.txtQuantidadePao.setText("1")
            }else{
                binding.txtQuantidadePao.setText("0")
            }

        }


        binding.checkSuco.setOnClickListener {
            if(binding.checkSuco.isChecked)
            {
                binding.txtQuantidadeSuco.setText("1")
            }else{
                binding.txtQuantidadeSuco.setText("0")
            }

        }

        binding.checkSorvete.setOnClickListener {
            if(binding.checkSorvete.isChecked)
            {
                binding.txtQuantidadeSorvete.setText("1")

            }else{
                binding.txtQuantidadeSorvete.setText("0")
            }

        }



        //Evento no butao
        binding.btnRealizarPedido.setOnClickListener {
            var i = Intent(this, SpashScreenActivity::class.java)
            i.putExtra("Quant_Cafe",binding.txtQuantidadeCaf.text.toString())
            i.putExtra("Quant_Pao",binding.txtQuantidadePao.text.toString())
            i.putExtra("Quant_Suco",binding.txtQuantidadeSuco.text.toString())
            i.putExtra("Quant_Sorvete",binding.txtQuantidadeSorvete.text.toString())
            i.putExtra("preco_Cafe",valorCafe.toString())
            i.putExtra("preco_Pao",valorPao.toString())
            i.putExtra("preco_Suco",valorSuco.toString())
            i.putExtra("preco_Sorvete",valorSorvete.toString())
            startActivity(i)
        }





    }
}