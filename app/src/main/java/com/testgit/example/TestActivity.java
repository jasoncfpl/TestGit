package com.testgit.example;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Set;

public class TestActivity extends Activity {
    private static final String TAG = "TestActivity";

    private TextView mTextView;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = findViewById(R.id.test_text_view);

        SharedPreferences sharedPreferences = getSharedPreferences("Test", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean("test",false);
        editor.commit();

        editor.putString("test","test");
        editor.apply();

        String url = "123456789";
        if (!url.endsWith("&")) {
            url.concat("test");
        }
        Log.i(TAG, "onCreate: " + url);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this,TestActivity.class);
                startActivity(intent);
            }
        });
    }

    private Runnable autoPlayTask = new Runnable() {
        @SuppressLint("SetTextI18n")
        @Override
        public void run() {
            mTextView.setText("Test");
        }
    };
}
