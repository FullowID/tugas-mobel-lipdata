package com.example.automotiveshandbook.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.automotiveshandbook.ui.DetailActivity
import com.example.automotiveshandbook.R
import com.example.automotiveshandbook.model.Automotive
import com.example.automotiveshandbook.viewModel.AutomotiveViewModel

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Automotive>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private val viewModel = AutomotiveViewModel()

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textViewDes: TextView = view.findViewById(R.id.item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.titleResourceId)
        holder.textViewDes.text = context.resources.getString(item.descriptionResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

        holder.view.setOnClickListener {
            viewModel.setAutomotive(item, context)
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("title", viewModel.title.value)
                putExtra("description", viewModel.description.value)
                putExtra("image", viewModel.imageDrawable.value)
            }
            context.startActivity(intent)
        }


    }

    override fun getItemCount() = dataset.size
}