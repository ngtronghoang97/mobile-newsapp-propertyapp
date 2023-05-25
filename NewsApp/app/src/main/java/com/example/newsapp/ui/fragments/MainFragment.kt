package com.example.newsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.adapter.AdapterHorizontal
import com.example.newsapp.adapter.AdapterVertical
import com.example.newsapp.model.DataModelHorizontal
import com.example.newsapp.model.DataModelVertical

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    /**
     * Horizontal
     */
    var adapterHorizontal : AdapterHorizontal? = null
    var dataModelHorizontalList : ArrayList<DataModelHorizontal> = ArrayList()
    private var topStoriesRecycler : RecyclerView ? = null

    /**
     * Vertical
     */
    var adapterVertical : AdapterVertical? = null
    var dataModelVerticalList : ArrayList<DataModelVertical> = ArrayList()
    private var newsRecycler : RecyclerView ? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /**
         * 1. TOP STORIES - HORIZONTAL RECYCLERVIEW
         * Image gallery populated on the recyclerView
         */
        topStoriesRecycler = view?.findViewById(R.id.topStoriesRecycler) as RecyclerView
        dataModelHorizontalList = ArrayList()

        val linearLayoutManager = LinearLayoutManager(
            this@MainFragment.context, LinearLayoutManager.HORIZONTAL, false
        )
        topStoriesRecycler!!.layoutManager = linearLayoutManager

        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.newspaper))
        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.newsreport))
        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.breakingnews))
        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.newspaper))
        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.newsreport))
        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.breakingnews))
        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.newspaper))
        dataModelHorizontalList.add(DataModelHorizontal(R.drawable.newsreport))

        adapterHorizontal = AdapterHorizontal(dataModelHorizontalList, this@MainFragment.requireContext())
        topStoriesRecycler!!.adapter = adapterHorizontal


        /**
         * 2. OTHER NEWS - VERTICAL RECYCLERVIEW
         * The recyclerView will display other news in grid
         */
        newsRecycler = view?.findViewById(R.id.newsRecycler) as RecyclerView
        dataModelVerticalList = ArrayList()

        val layoutManager = GridLayoutManager(this@MainFragment.context, 2)
        newsRecycler!!.layoutManager = layoutManager

        dataModelVerticalList.add(DataModelVertical("NEWS9", R.drawable.breakingnews))
        dataModelVerticalList.add(DataModelVertical("7NEWS", R.drawable.newsreport))
        dataModelVerticalList.add(DataModelVertical("ABC NEWS", R.drawable.newspaper))
        dataModelVerticalList.add(DataModelVertical("THE AGE", R.drawable.newsreport))
        dataModelVerticalList.add(DataModelVertical("SPORTS", R.drawable.newspaper))
        dataModelVerticalList.add(DataModelVertical("K100", R.drawable.breakingnews))
        dataModelVerticalList.add(DataModelVertical("LOCAL NOW", R.drawable.newspaper))
        dataModelVerticalList.add(DataModelVertical("MUSIC", R.drawable.breakingnews))
        dataModelVerticalList.add(DataModelVertical("TIMES", R.drawable.newspaper))
        dataModelVerticalList.add(DataModelVertical("TEST TX", R.drawable.breakingnews))
        dataModelVerticalList.add(DataModelVertical("11UPDATES", R.drawable.newsreport))

        adapterVertical = AdapterVertical(dataModelVerticalList, this@MainFragment.requireContext())
        newsRecycler!!.adapter = adapterVertical
    }

}