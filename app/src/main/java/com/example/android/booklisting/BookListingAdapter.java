package com.example.android.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookListingAdapter extends ArrayAdapter<BookListing> {

    private static Context mContext;

    /**
     * Constructor to create a new {@link BookListing} object
     *
     * @param context
     * @param books
     */
    public BookListingAdapter(Context context, List<BookListing> books) {
        super(context, 0, books);
        mContext = context;
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String ratingsImage = "";
        BookViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_listing_list_item, parent, false);
            holder = new BookViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (BookViewHolder) convertView.getTag();
        }

        // Find book at the given position in the list
        BookListing currentBook = getItem(position);


        /** Set data to respective views within ListView */

        // Set Title
        holder.textViewTitle.setText(currentBook.getTitle());

        // Set Author
        holder.textViewAuthor.setText(currentBook.getAuthor());

        // Set ratings icons
        ratingsImage = getRatingImageResource(currentBook.getRating());
        int resId = mContext.getResources().getIdentifier(ratingsImage, "drawable", mContext.getPackageName());
        holder.imageViewRating.setImageResource(resId);

        return convertView;
    }

    /**
     * This method gets rating resource id depending on the book's rating
     *
     * @param rating
     * @return resource name
     */
    private String getRatingImageResource(double rating) {
        String ratingResource;

        switch (String.valueOf(rating)) {
            case "0.5":
                ratingResource = getContext().getString(R.string.rating_half);
                break;
            case "1.0":
                ratingResource = getContext().getString(R.string.rating_one);
                break;
            case "1.5":
                ratingResource = getContext().getString(R.string.rating_one_half);
                break;
            case "2.0":
                ratingResource = getContext().getString(R.string.rating_two);
                break;
            case "2.5":
                ratingResource = getContext().getString(R.string.rating_two_half);
                break;
            case "3.0":
                ratingResource = getContext().getString(R.string.rating_three);
                break;
            case "3.5":
                ratingResource = getContext().getString(R.string.rating_three_half);
                break;
            case "4.0":
                ratingResource = getContext().getString(R.string.rating_four);
                break;
            case "4.5":
                ratingResource = getContext().getString(R.string.rating_four_half);
                break;
            case "5.0":
                ratingResource = getContext().getString(R.string.rating_five);
                break;
            default:
                ratingResource = getContext().getString(R.string.rating_none);
                break;
        }

        return ratingResource;
    }

    /**
     * This class describes the view items to create a list item
     */
    public static class BookViewHolder {

        TextView textViewTitle;
        TextView textViewAuthor;
        TextView textViewReleaseDate;
        ImageView imageViewRating;

        // Find various views within ListView and set custom typeface on them
        public BookViewHolder(View itemView) {
            textViewTitle = (TextView) itemView.findViewById(R.id.title);
            textViewAuthor = (TextView) itemView.findViewById(R.id.author);
            textViewReleaseDate = (TextView) itemView.findViewById(R.id.release_date);
            imageViewRating = (ImageView) itemView.findViewById(R.id.rating);
        }
    }
}
