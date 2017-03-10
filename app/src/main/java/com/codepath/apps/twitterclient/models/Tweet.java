package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by Irene on 2017/3/4.
 */

@Parcel
public class Tweet {

    public Tweet() {
    }

    @SerializedName("coordinates")
    @Expose
    public Coordinates coordinates;
    @SerializedName("truncated")
    @Expose
    public Boolean truncated;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("favorited")
    @Expose
    public Boolean favorited;
    @SerializedName("favorite_count")
    @Expose
    public Integer favoriteCount;
    @SerializedName("id_str")
    @Expose
    public String idStr;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    public String inReplyToUserIdStr;
    @SerializedName("extended_entities")
    @Expose
    public ExtendedEntities extendedEntities;
    @SerializedName("entities")
    @Expose
    public Entities entities;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("retweet_count")
    @Expose
    public Integer retweetCount;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    public String inReplyToStatusIdStr;
    @SerializedName("geo")
    @Expose
    public Geo geo;
    @SerializedName("retweeted")
    @Expose
    public Boolean retweeted;
    @SerializedName("possibly_sensitive")
    @Expose
    public Boolean possiblySensitive;
    @SerializedName("in_reply_to_user_id")
    @Expose
    public Long inReplyToUserId;
    @SerializedName("place")
    @Expose
    public Place place;
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("user")
    @Expose
    public User user;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    public String inReplyToScreenName;
    @SerializedName("in_reply_to_status_id")
    @Expose
    public Long inReplyToStatusId;
}
