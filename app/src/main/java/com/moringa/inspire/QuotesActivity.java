package com.moringa.inspire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuotesActivity extends AppCompatActivity {
    @BindView(R.id.quoteTextView) TextView mQuoteTextView;
    @BindView(R.id.listView) ListView mListView;
    public static final String TAG = QuotesActivity.class.getSimpleName();
    private String[] quotes = new String[] {"Work Hard","Be Positive"};
    private String[] author = new String[]{"James","Danny"};

@Override
    protected void onCreate(Bundle savedInstanceState){
    super .onCreate(savedInstanceState);
    setContentView(R.layout.activity_quotes);
    ButterKnife.bind(this);
    MyQuotesAdapter adapter = new MyQuotesAdapter(this,android.R.layout.simple_list_item_1,quotes,author);
    mListView.setAdapter(adapter);
    mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String quote = ((TextView)view).getText().toString();
            Toast.makeText(QuotesActivity.this,quote, Toast.LENGTH_SHORT).show();
        }
    });
    Intent intent = getIntent();

}
}
