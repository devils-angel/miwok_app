package com.example.gujarati_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.textView);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Numbers_Activity.class);
                startActivity(intent);

            }

        });

        TextView family_members = (TextView) findViewById(R.id.textView2);
        family_members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Family_members.class);
                startActivity(intent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.textView3);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Colors_Activity.class);
                startActivity(intent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.textView4);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Phrases_Activity.class);
                startActivity(intent);
            }
        });
    }
}
