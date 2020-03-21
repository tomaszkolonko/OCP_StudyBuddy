package com.example.android.ocp_studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        ConstraintLayout constraintLayout = findViewById(R.id.learn_layout);
        constraintLayout.setOnClickListener(new ConstraintLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.card_text_view);
                textView.setText(getResources().getString(R.string.side_b));
            }
        });
    }
}
