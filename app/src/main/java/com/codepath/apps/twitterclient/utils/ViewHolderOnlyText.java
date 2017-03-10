package com.codepath.apps.twitterclient.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.apps.twitterclient.R;

/**
 * Created by Irene on 2017/3/5.
 */

public class ViewHolderOnlyText extends RecyclerView.ViewHolder {
    // Your holder should contain a member variable
    // for any view that will be set as you render a row
    public TextView tvUserName;
    public TextView tvUserScreenName;
    public TextView tvPostTime;
    public TextView tvBody;
    public ImageView ivUserPhoto;
    public TextView tvRetweet;
    public TextView tvFavorite;
    public ImageView ivFavorite;
    public ImageView ivReply;

    // We also create a constructor that accepts the entire item row
    // and does the view lookups to find each subview
    public ViewHolderOnlyText(View itemView) {
        // Stores the itemView in a public final member variable that can be used
        // to access the context from any ViewHolder instance.
        super(itemView);

        tvUserName = (TextView) itemView.findViewById(R.id.tvUserName);
        tvUserScreenName = (TextView) itemView.findViewById(R.id.tvUserScreenName);
        tvPostTime = (TextView) itemView.findViewById(R.id.tvPostTime);
        tvBody = (TextView) itemView.findViewById(R.id.tvBody);
        ivUserPhoto = (ImageView) itemView.findViewById(R.id.ivUserPhoto);
        tvRetweet = (TextView) itemView.findViewById(R.id.tvRetweet);
        tvFavorite = (TextView) itemView.findViewById(R.id.tvLike);
        ivFavorite = (ImageView) itemView.findViewById(R.id.ivLike);
        ivReply = (ImageView) itemView.findViewById(R.id.ivReply);
    }
}
