package com.example.asus.youtube;

/**
 * Created by asus on 2/23/2018.
 */


public class youtube {


    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mVideoName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mVideoDesc;

    // Drawable resource ID
    private int mImageResourceId;


    public youtube(String vName, String vDesc, int imageResourceId)
    {
        mVideoName = vName;
        mVideoDesc = vDesc;
        mImageResourceId = imageResourceId;
    }


    public String getVideoName() {
        return mVideoName;
    }


    public String getVideoDesc() {
        return mVideoDesc;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }


}