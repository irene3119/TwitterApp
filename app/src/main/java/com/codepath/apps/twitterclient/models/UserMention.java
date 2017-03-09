package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Irene on 2017/3/4.
 */

@Parcel
public class UserMention {

    public UserMention() {
    }

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("id_str")
    @Expose
    public String idStr;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("indices")
    @Expose
    public List<Integer> indices = null;
    @SerializedName("screen_name")
    @Expose
    public String screenName;
}
