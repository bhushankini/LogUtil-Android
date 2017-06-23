package com.example.data_mon;

import android.content.Context;

/**
 * Created by bkini on 6/23/17.
 */

public class MoreData {

    public String getRefData(Context context){
        return TestData.readAndDisplayFileContentFromAssetsFolder(context);
    }
}
