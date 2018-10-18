package com.manikyapavan.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ConfirmDialog extends AppCompatActivity {
    AlertDialog dialog;
    AlertDialog.Builder builder;
    String item[]={"Easy","medium","Hard","very hard"};
    String result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builder=new AlertDialog.Builder(ConfirmDialog.this);
        builder.setTitle("select difficulty level");
        builder.setSingleChoiceItems(item, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // System.out.println(i);
                result=item[i];


            }
        });

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog=builder.create();
        builder.show();

    }
}
