package com.example.android.booklisting;

public class BookListing {


    /**
     * Book Title
     */
    private String mTitle;

    /**
     * Book Author
     */
    private String mAuthor;

    /**
     * Published Date
     */
    private String mPublishedDate;

    /**
     * Rating
     */
    private double mRating;


    /**
     * Create a new Earthquake object.
     *
     * @param title         is the title of the book
     * @param author        is the name of the author of the book
     * @param publishedDate is the first release date
     * @param rating        is the rating of the book
     */
    public BookListing(String title, String author, String publishedDate, double rating) {

        mTitle = title;
        mAuthor = author;
        mPublishedDate = publishedDate;
        mRating = rating;
    }


    /**
     * Getter method - Title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Getter method - Author
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Getter method - Rating
     */
    public double getRating() {
        return mRating;
    }

}
