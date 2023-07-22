package com.bb.androidone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class WebViewFragment : Fragment() {
    private lateinit var fragmentWebView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentWebView = inflater.inflate(R.layout.fragment_webview, container, false)
        return fragmentWebView
    }
}
