package com.bb.androidone.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bb.androidone.JSBFrag.JSBFragment
import com.bb.androidone.RecyclerFrag.RecyclerViewFragment
import com.bb.androidone.R
import com.bb.androidone.WebViewFrag.WebViewFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavView = findViewById(R.id.bottom_nav_view)

        replaceFragment(RecyclerViewFragment())

        bottomNavView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_nav_item1 -> replaceFragment(RecyclerViewFragment())
                R.id.bottom_nav_item2 -> replaceFragment(WebViewFragment())
                R.id.bottom_nav_item3 -> replaceFragment(JSBFragment())
            }
            true
        }

        changeToLandscapeScreen()
    }

    private fun replaceFragment(targetFragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, targetFragment)
        transaction.commit()
    }

    fun changeToLandscapeScreen(): Int {
        val mDataList = mutableListOf<LiveOperationPageData>(LiveOperationPageData(2))
        var landscapeBanners: MutableList<LiveOperationPageData> = mutableListOf()
        if (true) {
            landscapeBanners = mDataList.filter {
                it.jump == 1
            } as MutableList<LiveOperationPageData>
        } else {
            landscapeBanners = mDataList
        }
        return landscapeBanners.count()
    }
}

class LiveOperationPageData(public var jump: Int) {
}