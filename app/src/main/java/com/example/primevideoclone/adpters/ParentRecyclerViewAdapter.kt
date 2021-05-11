package com.example.primevideoclone.adpters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.primevideoclone.R
import com.example.primevideoclone.model.ChildModel
import com.example.primevideoclone.model.ParentCategory


class ParentRecyclerViewAdapter(
    val parentModelArrayList: ArrayList<ParentCategory>,
   val onItemClickListener: (ChildModel) -> Unit
) :
    RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var category: TextView = itemView.findViewById(R.id.textView2)
        var childRecyclerView: RecyclerView = itemView.findViewById(R.id.rv_child)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.parent_rv_items, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val items = parentModelArrayList[position]
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
        holder.childRecyclerView.layoutManager = layoutManager
        holder.childRecyclerView.setHasFixedSize(true)
        holder.category.setText(items.movieCategory)
        val arrayList: ArrayList<ChildModel> = ArrayList()

        // added the first child row

        // added the first child row
        if (parentModelArrayList[position].movieCategory.equals("Category1")) {
            arrayList.add(ChildModel(R.drawable.themartian, "themartian Name"))
            arrayList.add(ChildModel(R.drawable.moana, "moana Name"))
            arrayList.add(ChildModel(R.drawable.mov2, "mov2 Name"))
            arrayList.add(ChildModel(R.drawable.blackp, "blackp Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi2, "moviedubbedinhindi2 Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "hollywood1 Name"))
        }


        // added in second child row

        // added in second child row
        if (parentModelArrayList[position].movieCategory.equals("Category2")) {
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi2, "moviedubbedinhindi2 Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi3, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi1, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi6, "Movie Name"))
        }

        // added in third child row

        // added in third child row
        if (parentModelArrayList[position].movieCategory.equals("Category3")) {
            arrayList.add(ChildModel(R.drawable.hollywood6, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood3, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood2, "hollywood2 Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "Movie Name"))
        }

        // added in fourth child row

        // added in fourth child row
        if (parentModelArrayList[position].movieCategory == "Category4") {
            arrayList.add(ChildModel(R.drawable.bestofoscar6, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar3, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar2, "bestofoscar2 Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar1, "Movie Name"))
        }

        // added in fifth child row

        // added in fifth child row
        if (parentModelArrayList[position].movieCategory == "Category5") {
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar4, "bestofoscar4 Name"))
            arrayList.add(ChildModel(R.drawable.mov2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar1, "Movie Name"))
        }

        // added in sixth child row

        // added in sixth child row
        if (parentModelArrayList[position].movieCategory == "Category6") {
            arrayList.add(ChildModel(R.drawable.hollywood5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.blackp, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi6, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar6, "Movie Name"))
        }

        val adapter = ChildRvAdapter(arrayList,onItemClickListener)
        holder.childRecyclerView.adapter = adapter

    }

    override fun getItemCount(): Int {
        return parentModelArrayList.size
    }

}