package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Irene on 2017/3/5.
 */

@Parcel
public class Medium {

    public Medium() {
    }
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("id_str")
    @Expose
    public String idStr;
    @SerializedName("indices")
    @Expose
    public List<Integer> indices = null;
    @SerializedName("media_url")
    @Expose
    public String mediaUrl;
    @SerializedName("media_url_https")
    @Expose
    public String mediaUrlHttps;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("display_url")
    @Expose
    public String displayUrl;
    @SerializedName("expanded_url")
    @Expose
    public String expandedUrl;
    @SerializedName("type")
    @Expose
    public String type;
//    @SerializedName("sizes")
//    @Expose
//    public Sizes sizes;
    @SerializedName("source_status_id")
    @Expose
    public Long sourceStatusId;
    @SerializedName("source_status_id_str")
    @Expose
    public String sourceStatusIdStr;
    @SerializedName("source_user_id")
    @Expose
    public Long sourceUserId;
    @SerializedName("source_user_id_str")
    @Expose
    public String sourceUserIdStr;
//    @SerializedName("video_info")
//    @Expose
//    public VideoInfo videoInfo;

}
