package com.example.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ActivityTwo extends AppCompatActivity {

    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        input=(EditText)findViewById(R.id.editText);
    }
    public void btn_click(View view){
        Toast.makeText(this,input.getText(),Toast.LENGTH_LONG).show();
    }
}
