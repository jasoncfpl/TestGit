package com.testgit.example.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import android.widget.Button
import android.widget.TextView
import com.testgit.example.R
import kotlin.math.log

/**
 * SparseArray 相当于一个特殊的HashMap所以不存在数组越界问题
 */
class SpareArrayActivity : AppCompatActivity() {

    private lateinit var mResultTextView:TextView
    private lateinit var mGetIndexBtn:Button

    private var spareArray:SparseArray<String> = SparseArray()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spare_array)

        mResultTextView = findViewById(R.id.result_tv)

        spareArray.put(0,"0")
        spareArray.put(1,"1")
        spareArray.put(2,"2")
        spareArray.put(3,"3")

        mGetIndexBtn = findViewById(R.id.get_index_btn)

        mGetIndexBtn.setOnClickListener {
            try {
                var string = spareArray.get(10)
                Log.i("SpareArrayActivity","sTRING:$string")
                mResultTextView.text = string
            } catch (e: Exception) {
                Log.e("SpareArrayActivity","ERROR:$e")
            }
        }
    }
}
