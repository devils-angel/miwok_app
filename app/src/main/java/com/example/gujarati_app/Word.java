package com.example.gujarati_app;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourseId = NO_IMAGE_PROVIDED ;
    public static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public Word(String defaultTranslation,String miwokTranslation,int ImageResourseId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourseId= ImageResourseId;

    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourseId() {
        return mImageResourseId;
    }


    //returns true if there is an image id and false if there is no image id
    public boolean hasimage(){
        return mImageResourseId != -1 ;

    }
}
