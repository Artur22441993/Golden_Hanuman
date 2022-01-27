package com.goooldden.haaannuman.jiqwqe.ufn;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.goooldden.haaannuman.jiqwqe.GH;
import com.goooldden.haaannuman.jiqwqe.MainActivity;
import com.goooldden.haaannuman.jiqwqe.R;

public class LiiiP extends AppCompatActivity{

    WebView webLiiip;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.liiip);
        webLiiip = findViewById(R.id.webLiiip);
        webLiiip.loadUrl(MainActivity.decooo("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49QVVqN2pHQkhHQ0xxcTdvTEk4SzBkRVg4bVlIeFdBVU4="));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), GH.class));
        finishAffinity();
    }
}
