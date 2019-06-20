package com.androiddreams.findbooks;

public class Book {

    private String mTitle, mSubtitle, mAuthors, mPublisher, mRating;

    public Book(String title, String subtitle, String author, String publisher, String rating) {
        mTitle = title;
        mSubtitle = subtitle;
        mAuthors = author;
        mPublisher = publisher;
        mRating = rating;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSubtitle() {
        return mSubtitle;
    }

    public String getmAuthors() {
        return mAuthors;
    }

    public String getmPublisher() {
        return mPublisher;
    }

    public String getmRating() {
        return mRating;
    }
}
