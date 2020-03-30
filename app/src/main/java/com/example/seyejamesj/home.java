package com.example.seyejamesj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button nameBtn, slackBtn, emailBtn, backBtn, trackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameBtn = (Button)findViewById(R.id.nameBtn);
        slackBtn = (Button)findViewById(R.id.slackBtn);
        emailBtn = (Button)findViewById(R.id.emailBtn);
        backBtn = (Button)findViewById(R.id.backBtn);
        trackBtn = (Button)findViewById(R.id.taskBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(home.this,MainActivity.class);
                startActivity(b);
                finish();


            }
        });

        slackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(home.this,slack_name.class);
                startActivity(b);
                finish();


            }
        });


        nameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(home.this,name.class);
                startActivity(b);
                finish();


            }
        });



        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(home.this,email.class);
                startActivity(e);
                finish();


            }
        });

    }
}
