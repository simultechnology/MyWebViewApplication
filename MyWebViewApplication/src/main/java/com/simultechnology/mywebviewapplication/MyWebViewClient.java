package com.simultechnology.mywebviewapplication;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ishi on 2013/11/02.
 */
public class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Log.v("MyWebViewClient",url);
        if (Uri.parse(url).getHost().length() == 0) {
            return false;
        }
//        if (Uri.parse(url).getHost().endsWith("html5rocks.com")) {
//            return false;
//        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
