package com.bb.androidone.WebViewFrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bb.androidone.R

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
