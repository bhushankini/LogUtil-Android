package com.example.bkini.logutilexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.data_mon.MonData
import com.example.data_mon.TestData
import com.example.logutil.LogDebug
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogDebug.d("Heeloo oAPAPAP")

        val monData = MonData()
        LogDebug.d("Gettin Ref Data "+ monData.getRefData(this))
        data.text = monData
                .getRefData(this)
        data.text= monData.getRefData(this)
    }
}
