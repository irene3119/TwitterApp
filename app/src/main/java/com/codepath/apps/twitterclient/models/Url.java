package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Irene on 2017/3/4.
 */

@Parcel
public class Url {

    public Url() {
    }

    @SerializedName("expanded_url")
    @Expose
    public String expandedUrl;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("indices")
    @Expose
    public List<Integer> indices = null;
    @SerializedName("display_url")
    @Expose
    public String displayUrl;
}
