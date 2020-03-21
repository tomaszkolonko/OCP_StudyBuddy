package com.example.android.ocp_studybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create and start an explicit intent
                Intent intent = new Intent(v.getContext(), LearnActivity.class);

                // Start the intent from the current context
                startActivity(intent);
            }
        });
    }
}
