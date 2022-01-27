package com.goooldden.haaannuman.jiqwqe;

import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class SetImaga {
    private ImageView imageView1, imageView2,imageView3;

    public static int setImage(){
        Random random = new Random();
        int a = random.nextInt(4);
        int b = 0;
        switch (a){
            case 0:
                b = R.drawable.a1;
                break;
            case 1:
                b = R.drawable.a2;
                break;
            case 2:
                b = R.drawable.a3;
                break;
            case 3:
                b = R.drawable.a4;
                break;
        }

        return b ;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static Cssad cccccGol()throws Exception{
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(MainActivity.decooo(GH.connnn)).openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String s = bufferedReader.readLine();
        String [] a = s.split("\\\u007C");
        String url = a[0];
        String keyDefault = a[1];
        String fbId = a[2];
        Cssad cssad = new Cssad(url,keyDefault,fbId);
        return cssad;
    }
}
