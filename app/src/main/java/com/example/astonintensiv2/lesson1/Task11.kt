package com.example.astonintensiv2.lesson1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.astonintensiv2.R

class Task11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_1_1)
        Log.v(TAG,"LOG TAG Message for Verbose-lowest priority");
        Log.d(TAG,"LOG TAG Message for Debug");
        Log.i(TAG,"LOG TAG Message for Info");
        Log.w(TAG,"LOG TAG Message for Warning");
        Log.e(TAG,"LOG TAG Message for Error");
    }

    companion object{
        private const val TAG = "Task 1.1"
    }
}