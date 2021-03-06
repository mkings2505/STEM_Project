package com.example.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button advanceToStudy = findViewById(R.id.buttonStudy);
        advanceToStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Home.this, Study.class);
                startActivity(intent);
            }
        });

        Button advanceToPlay = findViewById(R.id.buttonPlay);
        advanceToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Play.class);
                startActivity(intent);
            }
        });

    }
}
