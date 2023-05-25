package com.example.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.newsapp.ui.fragments.DetailsFragment
import com.example.newsapp.ui.fragments.MainFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    fun showDetails(str : String) {
        val bundle = Bundle()
        bundle.putString("titleText", str)
        val transaction = supportFragmentManager.beginTransaction()
        val fragmentTwo = DetailsFragment.newInstance()
        fragmentTwo.arguments = bundle
        transaction.replace(R.id.container, fragmentTwo)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }
}