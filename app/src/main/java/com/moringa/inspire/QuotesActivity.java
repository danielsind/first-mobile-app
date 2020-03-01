package com.moringa.inspire;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuotesActivity extends AppCompatActivity {
    @BindView(R.id.quoteTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    public static final String TAG = QuotesActivity.class.getSimpleName();
    private String[] quotes = new String[] {"Work Hard","Be Positive"};
    private String[] author = new String[]{"James","Danny"};

@Override
    protected void onCreate(Bundle savedInstanceState){
    super .onCreate(savedInstanceState);
    setContentView(R.layout.activity_quotes);
    ButterKnife.bind(this);

}
}
