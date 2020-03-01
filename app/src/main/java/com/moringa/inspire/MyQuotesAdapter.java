package com.moringa.inspire;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyQuotesAdapter  extends ArrayAdapter {
    private String[] mQuotes;
    private String[] mAuthor;
    private Context mContext;

    public MyQuotesAdapter(Context mContext, int resource , String[] mAuthor , String[] mQuotes){
        super(mContext, resource);
        this.mContext = mContext;
        this.mAuthor = mAuthor;
        this.mQuotes = mQuotes;
    }
    @Override
    public Object getItem(int position){
        String author = mAuthor[position];
        String quote = mQuotes[position];
        return String.format("%s \nAuthor :  %s", quote, author);
    }
}
