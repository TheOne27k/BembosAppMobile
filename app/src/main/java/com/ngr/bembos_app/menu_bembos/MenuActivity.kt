package com.ngr.bembos_app.menu_bembos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ngr.bembos_app.R

class MenuActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val recyclerProduct = findViewById<RecyclerView>(R.id.recyclerMenu)

        val listProduct = listOf<Product>(
            Product("Personal Clásica", "Clásica mediana, papa mediana." ,"S/.13.90", "S/23.80","-42%" , R.drawable.combo_clasico),
            Product("Personal Clásica", "Clásica mediana, papa mediana.","S/.13.90", "S/23.80","-42%" , R.drawable.combo_clasico),
            Product("Personal Clásica", "Clásica mediana, papa mediana.","S/.13.90", "S/23.80","-42%" , R.drawable.combo_clasico),
            Product("Personal Clásica","Clásica mediana, papa mediana.","S/.13.90", "S/23.80","-42%" , R.drawable.combo_clasico)
        )

        val adapters = ProductAdapter(listProduct)
        recyclerProduct.adapter = adapters
        recyclerProduct.layoutManager = LinearLayoutManager(this)
    }
}