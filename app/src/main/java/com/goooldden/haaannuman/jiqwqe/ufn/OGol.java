package com.goooldden.haaannuman.jiqwqe.ufn;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.goooldden.haaannuman.jiqwqe.GH;
import com.goooldden.haaannuman.jiqwqe.MainActivity;
import com.goooldden.haaannuman.jiqwqe.R;

public class OGol extends AppCompatActivity {
    public ValueCallback<Uri> ufjds;
    public Uri iiudnns = null;
    public ValueCallback<Uri[]> oiujsda;
    public String oijnsd;
    public static final int iuhnsd = 1;
    WebView webOgol;
    public static GH gh;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.ogol);
        webOgol = findViewById(R.id.webOgol);
        webOgol.getSettings().setJavaScriptEnabled(true);
        webOgol.getSettings().setAllowContentAccess(true);
        webOgol.getSettings().setLoadWithOverviewMode(true);
        webOgol.getSettings().setEnableSmoothTransition(true);
        webOgol.getSettings().setUseWideViewPort(true);
        webOgol.getSettings().setSaveFormData(true);
        webOgol.getSettings().setAllowFileAccess(true);
        webOgol.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webOgol.getSettings().setDomStorageEnabled(true);
        webOgol.setFocusableInTouchMode(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webOgol, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webOgol.getSettings().setAllowFileAccessFromFileURLs(true);
        webOgol.getSettings().setSavePassword(true);
        webOgol.setSaveEnabled(true);
        webOgol.getSettings().setMixedContentMode(0);
        webOgol.setFocusable(true);
        webOgol.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webOgol.getSettings().setDatabaseEnabled(true);
        webOgol.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        webOgol.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        webOgol.getSettings().setAppCacheEnabled(true);
        webOgol.getSettings().setLoadsImagesAutomatically(true);
        webOgol.setWebViewClient(new OGol.WebClient());
        webOgol.setWebChromeClient(new OGol.WebChrome());
        String ddsd = getIntent().getStringExtra(MainActivity.decooo("d3d3dw=="));
        webOgol.loadUrl(ddsd);
    }

    @Override
    public void onBackPressed() {
        if (webOgol.isFocused() && webOgol.canGoBack()) {
            webOgol.goBack();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != iuhnsd || oiujsda == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (oijnsd != null) {
                    results = new Uri[]{Uri.parse(oijnsd)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        oiujsda.onReceiveValue(results);
        oiujsda = null;
        if (ufjds == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? iiudnns : data.getData();
            }
        } catch (Exception e) { }
        ufjds.onReceiveValue(result);
        ufjds = null;
    }

    class WebClient extends WebViewClient{

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if(url.contains(MainActivity.decooo("NDA0"))){
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finishAffinity();
            }
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            gh.getSharedPreferences(gh.getPackageName(), gh.MODE_PRIVATE).edit().putString(MainActivity.decooo("c2F2ZWRVcmw="),url).apply();
        }
    }

    class WebChrome extends WebChromeClient{

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (oiujsda != null) {
                oiujsda.onReceiveValue(null);
            }
            oiujsda = filePath;
            Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
            contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
            contentSelectionIntent.setType("*/*");
            Intent[] intentArray = new Intent[0];
            Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
            chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
            chooserIntent.putExtra(Intent.EXTRA_TITLE, MainActivity.decooo("U2VsZWN0IE9wdGlvbjo="));
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
            startActivityForResult(chooserIntent, 1);
            return true;
        }
    }
}
