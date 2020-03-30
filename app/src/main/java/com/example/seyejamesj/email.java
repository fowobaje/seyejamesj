package com.example.seyejamesj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class email extends AppCompatActivity {
Button backBtne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        backBtne = (Button)findViewById(R.id.backBtne);
        backBtne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(email.this,home.class);
                startActivity(e);
                finish();
            }
        });
}
}
