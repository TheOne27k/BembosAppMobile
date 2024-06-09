package com.ngr.bembos_app.menu_bembos

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ngr.bembos_app.R

class ProductViewHolder(inflater: LayoutInflater, viewGroup: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_product, viewGroup, false)) {

    private var imgProduct: RelativeLayout? = null
    private var textTitle: TextView? = null
    private var textDescription: TextView? = null
    private var textPrice: TextView? = null
    private var textDiscountPrice: TextView? = null
    private var textDiscountPorcentage: TextView? = null

    init {
        imgProduct = itemView.findViewById(R.id.imageProduct)
        textTitle = itemView.findViewById(R.id.textTitle)
        textDescription = itemView.findViewById(R.id.textDescription)
        textPrice = itemView.findViewById(R.id.textPrice)
        textDiscountPrice = itemView.findViewById(R.id.textPriceDiscount)
        textDiscountPorcentage = itemView.findViewById(R.id.DiscountPorcentage)
    }

    fun bind(product: Product) {
        textTitle?.text = product.title
        textDescription?.text = product.description
        textPrice?.text = product.price
        textDiscountPrice?.text = product.priceDiscount
        textDiscountPorcentage?.text = product.discountPercentage
        imgProduct?.setBackgroundResource(product.image)

    }

}