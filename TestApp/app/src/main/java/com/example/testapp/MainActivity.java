package com.example.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //input=(EditText)findViewById(R.id.editText);
    }
    public void btn_click(View view){
        startActivity(new Intent(MainActivity.this,ActivityTwo.class));
       // Toast.makeText(this,input.getText(),Toast.LENGTH_LONG);

    }
}




















