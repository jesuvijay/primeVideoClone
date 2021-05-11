package com.example.primevideoclone.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.primevideoclone.R
import com.example.primevideoclone.model.ChildModel


class ChildRvAdapter(
    private val listData: ArrayList<ChildModel>,
    private val onItemClickListener: (ChildModel) -> Unit
) : RecyclerView.Adapter<ChildRvAdapter.MyViewHolde>() {

    inner class MyViewHolde(itemview: View) :RecyclerView.ViewHolder(itemview){
        var heroImage: ImageView = itemview.findViewById(R.id.hero_image)
        var movieName: TextView = itemview.findViewById(R.id.movie_name)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolde {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_rv_items, parent, false)
        return MyViewHolde(view)

    }

    override fun onBindViewHolder(holder: MyViewHolde, position: Int) {
        val item=listData[position]
        holder.movieName.setText(item.movieName)
        holder.heroImage.setImageResource(item.hero_Name)
        holder.itemView.setOnClickListener{
            onItemClickListener(item)
        }
    }

    override fun getItemCount(): Int {
      return listData.size
    }
}