package com.parassidhu.simpledatesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.parassidhu.simpledate.SimpleDate
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.d("Date", SimpleDate.DateTime.toDateTimeStandard(Date()))
    }
}
