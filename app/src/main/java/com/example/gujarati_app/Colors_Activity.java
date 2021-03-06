package com.example.gujarati_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_word);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        colors.add(new Word("green","chokokki",R.drawable.color_green));
        colors.add(new Word("brown","akaakki",R.drawable.color_brown));
        colors.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        colors.add(new Word("black","kululli",R.drawable.color_black));
        colors.add(new Word("white","kelelli",R.drawable.color_white));
        colors.add(new Word("dusty yellow","topiisә",R.drawable.color_dusty_yellow));
        colors.add(new Word("mustard yellow","chiwiiṭ",R.drawable.color_mustard_yellow));


        Word_adapter adapter = new Word_adapter(this,colors,R.color.colors);
        ListView listview = (ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }
}
