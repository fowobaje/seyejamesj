package com.example.seyejamesj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class name extends AppCompatActivity {
Button backBtnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        backBtnn = (Button)findViewById(R.id.backBtnn);
        backBtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(name.this,home.class);
                startActivity(n);
                finish();

            }
        });


    }
}