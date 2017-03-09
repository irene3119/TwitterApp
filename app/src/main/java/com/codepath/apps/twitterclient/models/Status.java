package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by Irene on 2017/3/5.
 */

@Parcel
public class Status {

    public Status() {
    }
    @SerializedName("coordinates")
    @Expose
    public Coordinates coordinates;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("favorited")
    @Expose
    public Boolean favorited;
    @SerializedName("geo")
    @Expose
    public Geo geo;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("id_str")
    @Expose
    public String idStr;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    public String inReplyToScreenName;
    @SerializedName("in_reply_to_status_id")
    @Expose
    public Long inReplyToStatusId;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    public String inReplyToStatusIdStr;
    @SerializedName("in_reply_to_user_id")
    @Expose
    public Long inReplyToUserId;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    public String inReplyToUserIdStr;
    @SerializedName("place")
    @Expose
    public Place place;
    @SerializedName("retweet_count")
    @Expose
    public Integer retweetCount;
    @SerializedName("retweeted")
    @Expose
    public Boolean retweeted;
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("truncated")
    @Expose
    public Boolean truncated;
}
