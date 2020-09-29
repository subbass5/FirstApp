package com.kritsana_dev.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_go.setOnClickListener {

            var getUrl = et_inputaddress.text
//            Toast.makeText(this, ""+getUrl, Toast.LENGTH_SHORT).show()
            wv_result.webViewClient = WebViewClient()
            wv_result.settings.javaScriptEnabled = true
            wv_result.loadUrl(getUrl.toString())

            }
        }


}