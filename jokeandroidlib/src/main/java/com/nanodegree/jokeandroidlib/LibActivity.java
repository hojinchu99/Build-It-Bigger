package com.nanodegree.jokeandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sist on 15. 11. 26.
 */
public class LibActivity extends AppCompatActivity {
    public static final String JOKE_INTENT_EXTRA="JOKE_INTENT_EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
    }


}
