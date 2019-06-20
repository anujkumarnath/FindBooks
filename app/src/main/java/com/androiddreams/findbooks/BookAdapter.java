package com.androiddreams.findbooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_list_item, parent,false);
        }
        TextView tvTitle = convertView.findViewById(R.id.tvTitle);
        TextView tvSubtitle = convertView.findViewById(R.id.tvSubtitle);
        TextView tvAuthor = convertView.findViewById(R.id.tvAuthor);
        TextView tvPublisher = convertView.findViewById(R.id.tvPublisher);
        TextView tvRating = convertView.findViewById(R.id.tvRating);

        Book book = getItem(position);
        tvTitle.setText(book.getmTitle());
        tvSubtitle.setText(book.getmSubtitle());
        tvAuthor.setText(book.getmAuthors());
        tvPublisher.setText(book.getmPublisher());
        tvRating.setText(book.getmRating());

        return convertView;
    }
}
