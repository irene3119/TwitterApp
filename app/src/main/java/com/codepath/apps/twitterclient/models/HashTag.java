package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by Irene on 2017/3/5.
 */

@Parcel
public class HashTag {

    public HashTag() {
    }
    @SerializedName("text")
    @Expose
    String text;
}
