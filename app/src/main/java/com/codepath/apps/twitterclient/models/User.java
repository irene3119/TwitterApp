package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by Irene on 2017/3/4.
 */

@Parcel
public class User{

    public User() {
    }
    @Expose
    public String name;
    @SerializedName("profile_sidebar_fill_color")
    @Expose
    public String profileSidebarFillColor;
    @SerializedName("profile_background_tile")
    @Expose
    public Boolean profileBackgroundTile;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    public String profileSidebarBorderColor;
    @SerializedName("profile_image_url")
    @Expose
    public String profileImageUrl;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("follow_request_sent")
    @Expose
    public Boolean followRequestSent;
    @SerializedName("id_str")
    @Expose
    public String idStr;
    @SerializedName("is_translator")
    @Expose
    public Boolean isTranslator;
    @SerializedName("profile_link_color")
    @Expose
    public String profileLinkColor;
//    @SerializedName("entities")
//    @Expose
//    public Entities entities;
    @SerializedName("default_profile")
    @Expose
    public Boolean defaultProfile;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("contributors_enabled")
    @Expose
    public Boolean contributorsEnabled;
    @SerializedName("favourites_count")
    @Expose
    public Integer favouritesCount;
    @SerializedName("utc_offset")
    @Expose
    public Integer utcOffset;
    @SerializedName("profile_image_url_https")
    @Expose
    public String profileImageUrlHttps;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("listed_count")
    @Expose
    public Integer listedCount;
    @SerializedName("profile_use_background_image")
    @Expose
    public Boolean profileUseBackgroundImage;
    @SerializedName("profile_text_color")
    @Expose
    public String profileTextColor;
    @SerializedName("followers_count")
    @Expose
    public Integer followersCount;
    @SerializedName("lang")
    @Expose
    public String lang;
    @SerializedName("protected")
    @Expose
    public Boolean _protected;
    @SerializedName("geo_enabled")
    @Expose
    public Boolean geoEnabled;
    @SerializedName("notifications")
    @Expose
    public Boolean notifications;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("profile_background_color")
    @Expose
    public String profileBackgroundColor;
    @SerializedName("verified")
    @Expose
    public Boolean verified;
    @SerializedName("time_zone")
    @Expose
    public String timeZone;
    @SerializedName("profile_background_image_url_https")
    @Expose
    public String profileBackgroundImageUrlHttps;
    @SerializedName("statuses_count")
    @Expose
    public Integer statusesCount;
    @SerializedName("profile_background_image_url")
    @Expose
    public String profileBackgroundImageUrl;
    @SerializedName("default_profile_image")
    @Expose
    public Boolean defaultProfileImage;
    @SerializedName("friends_count")
    @Expose
    public Integer friendsCount;
    @SerializedName("following")
    @Expose
    public Boolean following;
    @SerializedName("show_all_inline_media")
    @Expose
    public Boolean showAllInlineMedia;
    @SerializedName("screen_name")
    @Expose
    public String screenName;
}
