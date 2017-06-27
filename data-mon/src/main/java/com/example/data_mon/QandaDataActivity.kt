package com.example.data_mon


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
class QandaDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_qandadata)

        setContentView(R.layout.activity_qandadata)
        System.out.println("BHUSHAN QANDA TEST")
        val monData = MonData()
    //    data.text = monData
    //            .getRefData(this)
    //    data.text= monData.getRefData(this)
    }
}
