package com.manikyapavan.dialog;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class CicularProgressDialog extends AppCompatActivity {
    ProgressDialog dialog;
    Handler handler;
    Runnable runnable;
    Timer timer;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cicular_progress_dialog);
        dialog=new ProgressDialog(CicularProgressDialog.this);
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setIndeterminate(false);
        dialog.setTitle("ProgressDialog");
        dialog.setMessage("please wait...");
        dialog.show();
        dialog.setProgress(20);
        dialog.setMax(100);
        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                i=i+5;
                if(i<=100){
                    dialog.setProgress(i);

                }else{
                    timer.cancel();
                    dialog.cancel();
                    i=0;

                }

            }
        };
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);

            }
        },8000,500);
       // dialog.cancel();

    }
}
