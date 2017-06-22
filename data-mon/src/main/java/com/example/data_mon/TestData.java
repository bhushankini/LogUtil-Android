package com.example.data_mon;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by bkini on 6/22/17.
 */

public class TestData {



    public static String readAndDisplayFileContentFromAssetsFolder(Context context){
        AssetManager mgr = context.getAssets();
        String filename = null;

        try {
            filename = "sample-data.json";
            System.out.println("KHUSHI filename : " + filename);
            InputStream in = mgr.open(filename, AssetManager.ACCESS_BUFFER);
            System.out.println("KHUSHI InputStream : " + in);
            String sHTML = StreamToString(in);
            System.out.println("KHUSHI sHTML : " + sHTML);
            in.close();

            return sHTML;

        } catch (IOException e) {
// TODO Auto-generated catch block
            System.out.println("KHUSHI Errro : " + e.getLocalizedMessage());
            e.printStackTrace();
        }
        return null;
    }

    private  static String StreamToString(InputStream in) throws IOException {
        if(in == null) {
            return "";
        }
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } finally {
        }
        return writer.toString();
    }
}
