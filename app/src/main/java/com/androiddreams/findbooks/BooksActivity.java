package com.androiddreams.findbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        ArrayList<Book> books = QueryUtils.readItemsFromJson();

        ListView listView = findViewById(R.id.listView);
        BookAdapter bookAdapter = new BookAdapter(this, books);
        listView.setAdapter(bookAdapter);
    }
}
