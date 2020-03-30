package com.example.seyejamesj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class slack_name extends AppCompatActivity {
Button backBtns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slack_name);

        backBtns = (Button)findViewById(R.id.backBtns);
        backBtns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent s = new Intent(slack_name.this,home.class);
               startActivity(s);
               finish();

            }
        });


    }
}
