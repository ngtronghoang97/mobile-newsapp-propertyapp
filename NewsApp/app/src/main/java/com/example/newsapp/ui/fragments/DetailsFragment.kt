package com.example.newsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsapp.R
import kotlinx.android.synthetic.main.fragment_details.view.*


class DetailsFragment : Fragment() {

    companion object {
        fun newInstance() = DetailsFragment()
    }

    var inputText: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_details, container, false)

        inputText = arguments?.getString("titleText")
        rootView.detailsTitle.text = inputText
        return rootView
    }
}