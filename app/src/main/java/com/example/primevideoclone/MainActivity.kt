package com.example.primevideoclone


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.primevideoclone.adpters.ParentRecyclerViewAdapter
import com.example.primevideoclone.model.ChildModel
import com.example.primevideoclone.model.ParentCategory


class MainActivity : AppCompatActivity() {
    private lateinit var parentRecyclerView: RecyclerView
    private var ParentAdapter: RecyclerView.Adapter<*>? = null
    var parentModelArrayList: ArrayList<ParentCategory> = ArrayList()
    private var parentLayoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set the Categories for each array list set in the `ParentViewHolder`
        //set the Categories for each array list set in the `ParentViewHolder`
        parentModelArrayList.add(ParentCategory("Category1"))
        parentModelArrayList.add(ParentCategory("Category2"))
        parentModelArrayList.add(ParentCategory("Category3"))
        parentModelArrayList.add(ParentCategory("Category4"))
        parentModelArrayList.add(ParentCategory("Category5"))
        parentModelArrayList.add(ParentCategory("Category6"))
        parentRecyclerView = findViewById(R.id.rv_parent)
        parentRecyclerView.setHasFixedSize(true)
        parentLayoutManager = LinearLayoutManager(this)
        ParentAdapter = ParentRecyclerViewAdapter(parentModelArrayList,onItemClickListener)
        parentRecyclerView.setLayoutManager(parentLayoutManager)
        parentRecyclerView.setAdapter(ParentAdapter)
        ParentAdapter!!.notifyDataSetChanged()


    }

    private val onItemClickListener: (ChildModel) -> Unit = { item ->
        Toast.makeText(this, "Item clicked: ${item.movieName} : ${item.hero_Name}", Toast.LENGTH_SHORT).show()
    }
}