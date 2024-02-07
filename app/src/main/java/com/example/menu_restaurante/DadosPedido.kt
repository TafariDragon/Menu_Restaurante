package com.example.menu_restaurante

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menu_restaurante.databinding.ActivityDadosPedidoBinding

class DadosPedido : AppCompatActivity() {
    private lateinit var binding: ActivityDadosPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDadosPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val quant_Cafe = intent.getStringExtra("Quant_Cafe")?.toIntOrNull() ?: 0
        val quant_Pao = intent.getStringExtra("Quant_Pao")?.toIntOrNull() ?: 0
        val quant_Suco = intent.getStringExtra("Quant_Suco")?.toIntOrNull() ?: 0
        val quant_Sorvete = intent.getStringExtra("Quant_Sorvete")?.toIntOrNull() ?: 0

        val preco_Cafe = intent.getStringExtra("preco_Cafe")?.toDoubleOrNull() ?: 0.0
        val preco_Pao = intent.getStringExtra("preco_Pao")?.toDoubleOrNull() ?: 0.0
        val preco_Suco = intent.getStringExtra("preco_Suco")?.toDoubleOrNull() ?: 0.0
        val preco_Sorvete = intent.getStringExtra("preco_Sorvete")?.toDoubleOrNull() ?: 0.0

        val total_Cafe = quant_Cafe * preco_Cafe
        val total_Pao = quant_Pao * preco_Pao
        val total_Suco = quant_Suco * preco_Suco
        val total_Sorvete = quant_Sorvete * preco_Sorvete

        val texto = "Cafe quantidade= $quant_Cafe preço total $total_Cafe \n" +
                "Pão quantidade= $quant_Pao preço total $total_Pao \n" +
                "Sumo quantidade= $quant_Suco preço total $total_Suco \n" +
                "Sorvete quantidade= $quant_Sorvete preço total $total_Sorvete \n"


        binding.txtTotal.setText(texto)
        var soma=total_Cafe+total_Pao+total_Sorvete+total_Suco
        binding.txtPTotal.setText("Total: "+soma.toString()+" MT")

        binding.btnCancelar.setOnClickListener {
            finish()
        }

        binding.btnPagar.setOnClickListener {
            startActivity(Intent(this,PagamentoActivity::class.java))
            finish()
        }
    }


}