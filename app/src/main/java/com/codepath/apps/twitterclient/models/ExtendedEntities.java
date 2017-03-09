package com.codepath.apps.twitterclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Irene on 2017/3/5.
 */

@Parcel
public class ExtendedEntities {

    public ExtendedEntities() {
    }
    @SerializedName("media")
    @Expose
    public List<Medium> media = null;
}
