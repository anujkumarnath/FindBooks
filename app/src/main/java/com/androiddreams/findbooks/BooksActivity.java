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

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Python Machine Learning", "A Guide for Data Scientists", "Andreas C. Müller, Sarah Guido", "O'Reilly Media, Inc.", "4.5"));
        books.add(new Book("Python Machine Learning", "A Guide for Data Scientists", "Andreas C. Müller, Sarah Guido", "O'Reilly Media, Inc.", "4.5"));
        books.add(new Book("Python Machine Learning", "A Guide for Data Scientists", "Andreas C. Müller, Sarah Guido", "O'Reilly Media, Inc.", "4.5"));
        books.add(new Book("Python Machine Learning", "A Guide for Data Scientists", "Andreas C. Müller, Sarah Guido", "O'Reilly Media, Inc.", "4.5"));
        books.add(new Book("Python Machine Learning", "A Guide for Data Scientists", "Andreas C. Müller, Sarah Guido", "O'Reilly Media, Inc.", "4.5"));
        books.add(new Book("Python Machine Learning", "A Guide for Data Scientists", "Andreas C. Müller, Sarah Guido", "O'Reilly Media, Inc.", "4.5"));
        books.add(new Book("Python Machine Learning", "A Guide for Data Scientists", "Andreas C. Müller, Sarah Guido", "O'Reilly Media, Inc.", "4.5"));

        ListView listView = findViewById(R.id.listView);
        BookAdapter bookAdapter = new BookAdapter(this, books);
        listView.setAdapter(bookAdapter);
    }
}
