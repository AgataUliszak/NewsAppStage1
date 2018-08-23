package com.example.android.newsapp;

/**
 * Created by qwerty on 21.08.2018.
 */

public class Article {

    private final String mTitle;
    private final String mAuthor;
    private final String mSection;
    private final String mDate;
    private final String mUrl;

    public Article (String title , String author, String section, String date, String url){
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url ;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
