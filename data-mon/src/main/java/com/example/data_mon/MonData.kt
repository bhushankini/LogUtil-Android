package com.example.data_mon

import android.content.Context


class MonData{

    fun getRefData(context : Context) : String{

        return TestData.readAndDisplayFileContentFromAssetsFolder(context)
    }

}