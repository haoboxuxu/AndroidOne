package com.bb.androidone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    private lateinit var fragmentHomeView: View
    private lateinit var recyclerView: RecyclerView
    private val dataList = ArrayList<CellViewModel>()

    private fun initList() {
        for (i in 1..50) {
            dataList.add(CellViewModel(CellViewData("item$i", ""), 0))
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentHomeView = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = fragmentHomeView.findViewById(R.id.recycler_view)

        initList()

        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = HomeListAdapter(dataList)

        return fragmentHomeView
    }
}
