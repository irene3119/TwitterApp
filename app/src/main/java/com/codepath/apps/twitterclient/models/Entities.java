package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Irene on 2017/3/4.
 */

@Parcel
public class Entities {

    public Entities() {
    }
    @SerializedName("urls")
    @Expose
    public List<Url> urls = null;
    @SerializedName("hashtags")
    @Expose
    public List<HashTag> hashtags = null;
    @SerializedName("user_mentions")
    @Expose
    public List<UserMention> userMentions = null;

}
