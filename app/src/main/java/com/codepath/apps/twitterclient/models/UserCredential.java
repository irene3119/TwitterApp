package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by Irene on 2017/3/5.
 */

@Parcel
public class UserCredential{

    // empty constructor needed by the Parceler library
    public UserCredential() {
    }

    @SerializedName("contributors_enabled")
    @Expose
    public Boolean contributorsEnabled;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("default_profile")
    @Expose
    public Boolean defaultProfile;
    @SerializedName("default_profile_image")
    @Expose
    public Boolean defaultProfileImage;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("favourites_count")
    @Expose
    public Integer favouritesCount;
//    @SerializedName("follow_request_sent")
//    @Expose
//    public Object followRequestSent;
    @SerializedName("followers_count")
    @Expose
    public Integer followersCount;
//    @SerializedName("following")
//    @Expose
//    public Integer following;
    @SerializedName("friends_count")
    @Expose
    public Integer friendsCount;
    @SerializedName("geo_enabled")
    @Expose
    public Boolean geoEnabled;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("id_str")
    @Expose
    public String idStr;
    @SerializedName("is_translator")
    @Expose
    public Boolean isTranslator;
    @SerializedName("lang")
    @Expose
    public String lang;
    @SerializedName("listed_count")
    @Expose
    public Integer listedCount;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("name")
    @Expose
    public String name;
//    @SerializedName("notifications")
//    @Expose
//    public Object notifications;
    @SerializedName("profile_background_color")
    @Expose
    public String profileBackgroundColor;
    @SerializedName("profile_background_image_url")
    @Expose
    public String profileBackgroundImageUrl;
    @SerializedName("profile_background_image_url_https")
    @Expose
    public String profileBackgroundImageUrlHttps;
    @SerializedName("profile_background_tile")
    @Expose
    public Boolean profileBackgroundTile;
    @SerializedName("profile_image_url")
    @Expose
    public String profileImageUrl;
    @SerializedName("profile_image_url_https")
    @Expose
    public String profileImageUrlHttps;
    @SerializedName("profile_link_color")
    @Expose
    public String profileLinkColor;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    public String profileSidebarBorderColor;
    @SerializedName("profile_sidebar_fill_color")
    @Expose
    public String profileSidebarFillColor;
    @SerializedName("profile_text_color")
    @Expose
    public String profileTextColor;
    @SerializedName("profile_use_background_image")
    @Expose
    public Boolean profileUseBackgroundImage;
    @SerializedName("profile_banner_url")
    @Expose
    public String profileBannerUrl;
    @SerializedName("protected")
    @Expose
    public Boolean _protected;
    @SerializedName("screen_name")
    @Expose
    public String screenName;
    @SerializedName("show_all_inline_media")
    @Expose
    public Boolean showAllInlineMedia;
    @SerializedName("status")
    @Expose
    public Status status;
    @SerializedName("statuses_count")
    @Expose
    public Integer statusesCount;
    @SerializedName("time_zone")
    @Expose
    public String timeZone;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("utc_offset")
    @Expose
    public Integer utcOffset;
    @SerializedName("verified")
    @Expose
    public Boolean verified;
}
