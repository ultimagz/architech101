package com.yiing.architech101


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_demo.view.*

class DemoAdaptor constructor(
    val context: Context,
    private var items: List<DemoProfile>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_demo, parent, false)
        return DemoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.items.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.demoNameText.text = items[position].name
    }

    class DemoViewHolder(view: View) : RecyclerView.ViewHolder(view)
}