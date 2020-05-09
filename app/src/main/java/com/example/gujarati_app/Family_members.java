package com.example.gujarati_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family_members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_word);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("father","әpә",R.drawable.family_father));
        family.add(new Word("mother","әṭa",R.drawable.family_mother));
        family.add(new Word("son","angsi",R.drawable.family_son));
        family.add(new Word("daughter","tune",R.drawable.family_daughter));
        family.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        family.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        family.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        family.add(new Word("younger sister","kollitti",R.drawable.family_younger_sister));


        Word_adapter adapter = new Word_adapter(this,family,R.color.family_members);
        ListView listview = (ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }
}
