package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Irene on 2017/3/4.
 */

@Parcel
public class Geo {
    public Geo() {
    }

    @SerializedName("coordinates")
    @Expose
    public List<Double> coordinates = null;
    @SerializedName("type")
    @Expose
    public String type;
}
