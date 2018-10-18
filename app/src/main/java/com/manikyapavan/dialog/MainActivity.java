package com.manikyapavan.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    AlertDialog alertDialog;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builder=new AlertDialog.Builder(    MainActivity.this,R.style.AlertDialogTheme);
        builder.setMessage("Discard draft");
        //for adding two positions of the buttons we just need to add these two +ve button
        builder.setPositiveButton("dicard", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.out.println("discard");

            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.out.println("cancel");
            }
        });
        alertDialog=builder.create();
        alertDialog.show();
        //these are the custom changing colours of the dialog action buttons by using this we can change our colours
       // alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.colorAlertDialog));
       // alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.colorAlertDialog));


    }
}
