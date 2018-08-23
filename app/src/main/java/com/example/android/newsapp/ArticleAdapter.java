package com.example.android.newsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by qwerty on 21.08.2018.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {

    private static final String T = "T";

    public ArticleAdapter(Context context, ArrayList<Article> New) {
        super(context, 0, New);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        ViewHolderItem viewHolderItem ;
        if (rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent ,false);
            viewHolderItem = new ViewHolderItem();
            viewHolderItem.titleTextView = rootView.findViewById(R.id.title);
            viewHolderItem.sectionTextView = rootView.findViewById(R.id.section);
            viewHolderItem.authorTextView = rootView.findViewById(R.id.author);
            viewHolderItem.dateTextView = rootView.findViewById(R.id.date);

            rootView.setTag(viewHolderItem);
        }else {
            viewHolderItem = (ViewHolderItem) rootView.getTag();
        }
        Article currentArticle = getItem(position);
        viewHolderItem.titleTextView.setText(currentArticle.getTitle());
        viewHolderItem.sectionTextView.setText(currentArticle.getSection());
        viewHolderItem.authorTextView.setText(currentArticle.getAuthor());

        viewHolderItem.dateTextView.setText(currentArticle.getDate());
        return rootView;
    }

    private static class ViewHolderItem {
        TextView titleTextView ;
        TextView sectionTextView;
        TextView authorTextView;
        TextView dateTextView;
    }

}
