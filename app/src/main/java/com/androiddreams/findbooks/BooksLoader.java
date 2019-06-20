package com.androiddreams.findbooks;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.ArrayList;

// TODO: replace ArrayList with List
public class BooksLoader extends AsyncTaskLoader<ArrayList<Book>> {
    public BooksLoader(Context context) {
        super(context);
    }

    @Override
    public ArrayList<Book> loadInBackground() {
        return null;
    }
}
