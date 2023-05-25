package com.example.newsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.MainActivity
import com.example.newsapp.R
import com.example.newsapp.model.DataModelVertical


class AdapterVertical(var dataModelVertical: List<DataModelVertical>, var mContext: Context) :
    RecyclerView.Adapter<AdapterVertical.RVHolder?>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem: View = layoutInflater.inflate(R.layout.item_vertical, parent, false)
        return RVHolder(listItem)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        dataModelVertical[position].otherImageHolder?.let { holder.imageView.setImageResource(it) }
        holder.textTitle.text = dataModelVertical[position].newsTitle
        holder.itemMainHolder.setOnClickListener {
//            val bundle = Bundle()
//            bundle.putString("titleText", dataModelVertical[position].newsTitle.toString())
//            val transaction = (mContext as AppCompatActivity).supportFragmentManager.beginTransaction()
//            val fragmentTwo = DetailsFragment.newInstance()
//            fragmentTwo.arguments = bundle
//            transaction.replace(R.id.container, fragmentTwo)
//            transaction.addToBackStack(null)
//            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
//            transaction.commit()

            val a = (mContext as MainActivity)
            a.showDetails(dataModelVertical[position].newsTitle.toString())

//            (mContext as AppCompatActivity).supportFragmentManager.beginTransaction()
//                .replace(R.id.container, DetailsFragment.newInstance())
//                .commitNow()
        }
    }

    override fun getItemCount(): Int {
        return dataModelVertical.size
    }

    class RVHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById<View>(R.id.otherNewImg) as ImageView
        var textTitle: TextView = itemView.findViewById<View>(R.id.title) as TextView
        var itemMainHolder: ConstraintLayout = itemView.findViewById<View>(R.id.itemMainHolder) as ConstraintLayout
    }
}