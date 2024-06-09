package com.ngr.bembos_app.menu_bembos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(val list: List<Product>) :
    RecyclerView.Adapter<ProductViewHolder>(){

        // Instancia el ViewHolder
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return ProductViewHolder(inflater, parent)
        }

        // Indica el num elementos a mostrar
        override fun getItemCount(): Int {
            return list.size
        }

        // Asignarle datos al viewholder
        override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
            val curso = list[position]
            holder.bind(curso)
        }
}