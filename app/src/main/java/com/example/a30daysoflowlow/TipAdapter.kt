package com.example.a30daysoflowlow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipsAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipsAdapter.TipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tip_item, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.bind(tip)
    }

    override fun getItemCount(): Int = tips.size

    class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val primaryTitle: TextView = itemView.findViewById(R.id.tipPrimaryTitle)
        private val secondaryTitle: TextView = itemView.findViewById(R.id.tipSecondaryTitle)
        private val description: TextView = itemView.findViewById(R.id.tipDescription)
        private val image: ImageView = itemView.findViewById(R.id.tipImage)

        fun bind(tip: Tip) {
            primaryTitle.text = tip.primaryTitle
            secondaryTitle.text = tip.secondaryTitle
            description.text = tip.description
            image.setImageResource(tip.imageResId)
        }
    }
}
