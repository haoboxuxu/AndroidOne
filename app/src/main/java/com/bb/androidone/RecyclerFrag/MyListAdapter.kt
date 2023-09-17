package com.bb.androidone.RecyclerFrag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bb.androidone.R

data class CellViewData(var name: String, val avatarUrl: String)

class CellViewModel(public var itemData: CellViewData, public var type: Int) {
    companion object {
        const val VIEW_TYPE_A  = 0
        const val VIEW_TYPE_B = 1
    }
}

class MyListCellViewHolder(view: View, viewType: Int) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.text_view)
    val imageView: ImageView? = if (viewType == CellViewModel.VIEW_TYPE_A) view.findViewById(R.id.item1_iv) else null
}

class MyListAdapter(private val dataList: List<CellViewModel>) : RecyclerView.Adapter<MyListCellViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyListCellViewHolder {
        val view: View = if (viewType == CellViewModel.VIEW_TYPE_A) {
            LayoutInflater.from(parent.context).inflate(R.layout.list_item1, parent, false)
        } else {
            LayoutInflater.from(parent.context).inflate(R.layout.list_item2, parent, false)
        }
        val viewHolder = MyListCellViewHolder(view, viewType)
        view.setOnClickListener {
            Toast.makeText(parent.context,
                "you clicked view ${dataList[viewHolder.adapterPosition].itemData.name}",
                Toast.LENGTH_SHORT).show()
        }

        return viewHolder
    }

    override fun getItemCount(): Int = dataList.count()

    override fun onBindViewHolder(holder: MyListCellViewHolder, position: Int) {
        val data = dataList[position]
        holder.imageView?.setImageResource(R.drawable.ic_web)
        holder.textView.text = data.itemData.name
    }
}