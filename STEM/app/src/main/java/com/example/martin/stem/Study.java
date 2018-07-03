package com.example.martin.stem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        Button advanceToHome = findViewById(R.id.buttonHomeFromStudy);
        advanceToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Study.this, Home.class);
                startActivity(intent);
            }
        });

        Button advanceToPlay = findViewById(R.id.buttonPlayFromStudy);
        advanceToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Study.this, Play.class);
                startActivity(intent);
            }
        });
    }
}
