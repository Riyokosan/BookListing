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
     * Setter method - Title
     */
    public void setTitle(String title) {
        mTitle = title;
    }

    /**
     * Getter method - Author
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Setter method - Author
     */
    public void setAuthor(String author) {
        mAuthor = author;
    }

    /**
     * Getter method - Published Date
     */
    public String getPublishedDate() {
        return mPublishedDate;
    }

    /**
     * Setter method - Published Date
     */
    public void setPublishedDate(String publishedDate) {
        mPublishedDate = publishedDate;
    }

    /**
     * Getter method - Rating
     */
    public double getRating() {
        return mRating;
    }

    /**
     * Setter method - Rating
     */
    public void setRating(double rating) {
        mRating = rating;
    }
}
