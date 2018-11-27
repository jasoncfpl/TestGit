package com.testgit.example

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView = findViewById(R.id.text_view)

        var str = "有20个小姐姐喜欢了你"

        var s = "20"

        var startIndex = str.lastIndexOf(s)
        var endIndex = startIndex + s.length

        Log.i("TAG", "onCreate startIndex: $startIndex ===endIndex:$endIndex")

        var startS = str.substring(startIndex)
//        var spinnerString = SpannableString()

        var result = str.substring(startIndex,endIndex)
        Log.i("TAG", "onCreate result: $result")


        mTextView.text = result

//        startActivity(Intent(MainActivity@this , TestActivity ::class.java))
    }


}
