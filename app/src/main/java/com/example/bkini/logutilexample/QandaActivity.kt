package com.example.bkini.logutilexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.data_mon.MonData
import com.example.data_mon.QandaDataActivity
import com.example.logutil.LogDebug
import kotlinx.android.synthetic.main.activity_qanda.*

class QandaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qanda)
        LogDebug.d("Heeloo oAPAPAP   ")

        val monData = MonData()
        LogDebug.d("Gettin Ref Data "+ monData.getRefData(this))

      //  data.text= monData.getRefData(this)
        btnClick.setOnClickListener { startActivity( Intent(this, QandaDataActivity::class.java)) }
    }
}
