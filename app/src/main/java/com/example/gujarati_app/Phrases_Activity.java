package com.example.gujarati_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_word);
        ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Where are you going?","minto wuksus"));
        phrases.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrases.add(new Word("My name is...","oyaaset..."));
        phrases.add(new Word("How are you feeling?","kuchi achit"));
        phrases.add(new Word("I’m feeling good","әәnәs'aa?"));
        phrases.add(new Word("Are you coming?","hәә’ әәnәm"));
        phrases.add(new Word("Yes, I’m coming","әәnәm"));
        phrases.add(new Word("I’m coming","yoowutis"));


        Word_adapter adapter = new Word_adapter(this,phrases,R.color.phrases);
        ListView listview = (ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }
}
