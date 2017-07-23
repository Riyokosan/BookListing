package com.example.android.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class BookListingLoader extends AsyncTaskLoader<List<BookListing>> {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = BookListingLoader.class.getName();

    /**
     * Query URL
     */
    private String mUrl;

    /**
     * Constructs a new {@link BookListingLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public BookListingLoader(Context context, String url) {
        super(context);
        mUrl = url;

        Log.v("MYURL", "MYURL" + url);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<BookListing> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<BookListing> books = QueryUtils.fetchBookListingData(mUrl);
        return books;
    }
}
