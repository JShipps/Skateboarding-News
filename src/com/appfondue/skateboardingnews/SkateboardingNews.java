package com.appfondue.skateboardingnews;

import com.appenda.Appenda;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
// import android.webkit.WebViewClient;

public class SkateboardingNews extends Activity {
	WebView mWebView;

    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	mWebView=new WebView(this);
    	setContentView(mWebView);
        
        mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        mWebView.loadUrl("file:///android_asset/www/index.html");

        Appenda ads = new Appenda(43, 220, "" , "" , SkateboardingNews.this, this);
        
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();            
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
   
    /* private class NewsClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
        	System.out.println("URL: " + url);
        	view.loadUrl("javascript:changeLocation('" + url + "')");
            return true;
        }
    } */

}