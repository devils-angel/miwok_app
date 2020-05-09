package com.example.gujarati_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.gujarati_app.Word;

import java.util.ArrayList;

public class Word_adapter extends ArrayAdapter<Word> {


    private int mColorResourseId ;

    public Word_adapter(Activity context, ArrayList<Word> name_arraylist, int colorResourseId){

        super(context,0,name_arraylist);
        mColorResourseId = colorResourseId;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {

        Word current_word = getItem(position);
        View listitemview = convertView;
        if (listitemview==null){
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView text_view_miwok = (TextView)listitemview.findViewById(R.id.miwok_text_view);
        text_view_miwok.setText(current_word.getmMiwokTranslation());



        TextView text_view_english = (TextView)listitemview.findViewById(R.id.eng_text_view);
        text_view_english.setText(current_word.getmDefaultTranslation());

        if(current_word.hasimage())
        {
            ImageView image = (ImageView)listitemview.findViewById(R.id.image);
            image.setImageResource(current_word.getmImageResourseId());
        }
        else {
            ImageView image = (ImageView)listitemview.findViewById(R.id.image);
            image.setVisibility(View.GONE);
        }




        View textContainer = listitemview.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourseId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        return listitemview;
    }
}
