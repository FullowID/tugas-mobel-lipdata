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

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Automotive>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textViewDes: TextView = view.findViewById(R.id.item_description)

    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.list_item, parent, false)
//        val holder = ItemViewHolder(adapterLayout)
//        val context = this.context
//        val viewModel = AutomotiveViewModel()
//        holder._view.setOnClickListener{
//            val intent = Intent(context, DetailActivity::class.java).apply{
//
//                //putExtra("desc", viewModel.description)
//            }
//            context.startActivities(arrayOf(intent))
//        }

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.titleResourceId)
        holder.textViewDes.text = context.resources.getString(item.descriptionResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

        holder.view.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra(DetailActivity.EXTRA_TITLE, holder.textView.text)
                putExtra(DetailActivity.EXTRA_DESCRIPTION, holder.textViewDes.text)
                putExtra(DetailActivity.EXTRA_IMAGE, item.imageResourceId)
            }
            context.startActivity(intent)
        }


    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}