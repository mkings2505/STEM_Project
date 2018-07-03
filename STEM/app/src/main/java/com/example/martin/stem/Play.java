package com.example.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Button advanceToHome = findViewById(R.id.buttonHomeFromPlay);
        advanceToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Play.this, Home.class);
                startActivity(intent);
            }
        });

        Button advanceToStudy = findViewById(R.id.buttonStudyFromPlay);
        advanceToStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Play.this, Study.class);
                startActivity(intent);
            }
        });
    }
}
