package com.moringa.inspire;

import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;

public class QuotesActivity {
    @BindView(R.id.quoteTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    public static final String TAG = QuotesActivity.class.getSimpleName();
    private String[] quotes = new String[] {"Work Hard","Be Positive"};
    private String[] author = new String[]{"James","Danny"};


}
