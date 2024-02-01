package com.example.shreyaandroidbootcamp.topics.webView

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.example.shreyaandroidbootcamp.R

class WebViewActivity : AppCompatActivity() {
    lateinit var web_View:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        web_View=findViewById(R.id.webView)

        webViewSetup()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(){
        web_View.webViewClient= WebViewClient()
        web_View.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled=true
        }
    }

    override fun onBackPressed() {
        if(web_View.canGoBack()) web_View.goBack() else super.onBackPressed()
    }
}