package com.goooldden.haaannuman.jiqwqe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Base64;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView1, imageView2,imageView3, imageViewSpin;
    private int min = 600;
    private int max = 800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageViewSpin = findViewById(R.id.imageView5);
        textView = findViewById(R.id.textView);

        imageViewSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i<30;i++){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    textView.setText(""+ meRandom(max,min));
                                    imageView2.setImageResource(SetImaga.setImage());
                                    imageView3.setImageResource(SetImaga.setImage());
                                    imageView1.setImageResource(SetImaga.setImage());
                                }
                            });
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }).start();

            }
        });
    }

    public int meRandom(int max, int min){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),GH.class));
        finishAffinity();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String decooo(String ifudas){
        Base64.Decoder iubdq = Base64.getDecoder();
        String ooiuj = new String(iubdq.decode(ifudas));
        return ooiuj;
    }
}