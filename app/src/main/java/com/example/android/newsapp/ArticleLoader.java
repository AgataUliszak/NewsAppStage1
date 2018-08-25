package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by qwerty on 21.08.2018.
 */

public class ArticleLoader extends AsyncTaskLoader<List<Article>> {
    /** Query URL */
    private String API_REQUEST_URL="https://content.guardianapis.com/search?&show-tags=contributor&api-key=12db7c5e-96be-4c1e-939d-4f471104e3f0";;


    public ArticleLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Article> loadInBackground() {
        if (API_REQUEST_URL == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Article> articles = QueryUtils.fetchArticleData(API_REQUEST_URL);
        return articles;
    }
}
