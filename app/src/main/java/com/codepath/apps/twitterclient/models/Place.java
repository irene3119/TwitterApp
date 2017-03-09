package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by Irene on 2017/3/4.
 */

@Parcel
public class Place {
    public Place() {
    }

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("country_code")
    @Expose
    public String countryCode;
    @SerializedName("country")
    @Expose
    public String country;
//    @SerializedName("attributes")
//    @Expose
//    public Attributes attributes;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("bounding_box")
    @Expose
    public BoundingBox boundingBox;
    @SerializedName("full_name")
    @Expose
    public String fullName;
    @SerializedName("place_type")
    @Expose
    public String placeType;
}

