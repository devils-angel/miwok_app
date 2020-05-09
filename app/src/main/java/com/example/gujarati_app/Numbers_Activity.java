package com.example.gujarati_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers_Activity extends AppCompatActivity {
        private MediaPlayer mMediaPlayer ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list_word);

            final ArrayList<Word> numbers_english = new ArrayList<Word>();
            numbers_english.add(new Word("one","lutti",R.drawable.number_one));
            numbers_english.add(new Word("two","otikko",R.drawable.number_two));
            numbers_english.add(new Word("three","tolookosu",R.drawable.number_three));
            numbers_english.add(new Word("four","oyissa",R.drawable.number_four));
            numbers_english.add(new Word("five","massokka",R.drawable.number_five));
            numbers_english.add(new Word("six","temmoka",R.drawable.number_six));
            numbers_english.add(new Word("seven","kenekaku",R.drawable.number_seven));
            numbers_english.add(new Word("eight","kavinta",R.drawable.number_eight));
            numbers_english.add(new Word("nine","woe",R.drawable.number_nine));
            numbers_english.add(new Word("ten","na'acha",R.drawable.number_ten));


            Word_adapter adapter = new Word_adapter(this,numbers_english,R.color.numbers);
            ListView listview = (ListView) findViewById(R.id.listview);
            listview.setAdapter(adapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    Word word = numbers_english.get(position);
                    mMediaPlayer = MediaPlayer.create(Numbers_Activity.this,R.raw.number_one_song);
                    Toast.makeText(Numbers_Activity.this , "toast displayed", Toast.LENGTH_SHORT).show();

                    mMediaPlayer.start();
                }
            });
    }
}
