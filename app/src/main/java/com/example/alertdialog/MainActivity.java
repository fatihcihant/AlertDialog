package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Toast Message ",Toast.LENGTH_LONG).show();
        //this is a pop-up.
        //irst parameter context,second parameter pop-up text,third parameter display time of the toast
    }
    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("save");//button's text
        alert.setMessage("are you sure");//alert text
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //when "yes" button is clicked what will do
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();

            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //when "no" button is clicked waht will do
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();

            }
        });
    alert.show();
    }



}
