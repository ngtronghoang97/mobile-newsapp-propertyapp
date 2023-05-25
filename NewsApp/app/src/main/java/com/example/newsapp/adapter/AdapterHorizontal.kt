package com.example.newsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.MainActivity
import com.example.newsapp.model.DataModelHorizontal
import com.example.newsapp.R


class AdapterHorizontal(var dataModelHorizontal: List<DataModelHorizontal>, var mContext: Context) :
    RecyclerView.Adapter<AdapterHorizontal.RVHolder?>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem: View = layoutInflater.inflate(R.layout.item_horizontal, parent, false)
        return RVHolder(listItem)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        dataModelHorizontal[position].newsImageHolder?.let { holder.imageView.setImageResource(it) }
        holder.horizontalHolder.setOnClickListener {
            val a = (mContext as MainActivity)
            a.showDetails("Lorem iIpsum Top")
        }
    }

    override fun getItemCount(): Int {
        return dataModelHorizontal.size
    }

    class RVHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById<View>(R.id.newsIcon) as ImageView
        var horizontalHolder: ConstraintLayout = itemView.findViewById<View>(R.id.horizontalHolder) as ConstraintLayout
    }
}