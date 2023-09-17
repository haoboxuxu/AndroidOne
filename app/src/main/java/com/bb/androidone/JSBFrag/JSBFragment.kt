package com.bb.androidone.JSBFrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.bb.androidone.R

class JSBFragment : Fragment() {
    private lateinit var fragmentWebView: View
    private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentWebView = inflater.inflate(R.layout.fragment_jsb, container, false)
        webView = fragmentWebView.findViewById(R.id.web_view)
        configWebView()
        return fragmentWebView
    }

    private fun configWebView() {
        val setting = webView.settings
        setting.javaScriptEnabled = true
        setting.javaScriptCanOpenWindowsAutomatically = true
        setting.allowFileAccess = true
        setting.allowContentAccess = true
        webView.loadUrl("file:///android_assets/htmls/testjsb.html")
        webView.loadUrl("https://www.baidu.com/")

//        webView.webViewClient(object : WebViewClient() {
//
//        })
    }
}
