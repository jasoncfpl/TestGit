package com.testgit.example

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }
    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView = findViewById(R.id.text_view)

        var gotoTestPageBtn = findViewById<Button>(R.id.btn_goto_page)
        gotoTestPageBtn.setOnClickListener {
            gotoTestPage()
        }

        learnKotlinLoop()

    }

    /**
     * 开始学习kotlin 循环
     */
    private fun learnKotlinLoop() {
        Log.i(TAG, "learnKotlinLoop: ")
        val array = arrayOf("a","b","c","d","e","f","g","h","i","j","k")
        for (i in 1..10 step 2){
            Log.i(TAG, "learnKotlinLoop1: $i ")
        }
        // 再 [2，array.size)区间遍历，并且每次增加2
        for (i in 2 until array.size step 2){
            Log.i(TAG, "learnKotlinLoop2: $i ")
        }

    }

    private fun gotoTestPage () {
        startActivity(Intent(MainActivity@this , TestActivity ::class.java))
    }


}
