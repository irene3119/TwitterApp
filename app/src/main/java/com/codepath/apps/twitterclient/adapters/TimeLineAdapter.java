package com.codepath.apps.twitterclient.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.codepath.apps.twitterclient.R;
import com.codepath.apps.twitterclient.activities.ProfileActivity;
import com.codepath.apps.twitterclient.models.Tweet;
import com.codepath.apps.twitterclient.utils.PatternEditableBuilder;
import com.codepath.apps.twitterclient.utils.ViewHolderOnlyText;
import com.codepath.apps.twitterclient.utils.ViewHolderPhoto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Created by Irene on 2017/3/4.
 */

public class TimeLineAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<Tweet> mTweets;
    // Store the context for easy access
    private Context mContext;

    private final int TWEET_TEXT = 0;
    private final int TWEET_PHOTO = 1;

    // Pass in the contact array into the constructor
    public TimeLineAdapter(Context context, List<Tweet> tweets) {
        mTweets = tweets;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // Inflate the custom layout
        //View tweetView_1 = inflater.inflate(R.layout.tweet_item, parent, false);

        switch (viewType) {
            case TWEET_TEXT:
                View v1 = inflater.inflate(R.layout.tweet_item, parent, false);
                viewHolder = new ViewHolderOnlyText(v1);
                break;
            case TWEET_PHOTO:
                View v2 = inflater.inflate(R.layout.tweet_photo_item, parent, false);
                viewHolder = new ViewHolderPhoto(v2);
                break;
            default:
                View v = inflater.inflate(R.layout.tweet_item, parent, false);
                viewHolder = new ViewHolderOnlyText(v);
                break;
        }

        // Return a new holder instance
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        switch (viewHolder.getItemViewType()) {
            case TWEET_TEXT:
                ViewHolderOnlyText vh1 = (ViewHolderOnlyText) viewHolder;
                configureViewHolderOnlyText(vh1, position);
                break;
            case TWEET_PHOTO:
                ViewHolderPhoto vh2 = (ViewHolderPhoto) viewHolder;
                configureViewHolderPhoto(vh2, position);
                break;
            default:
                ViewHolderOnlyText vh = (ViewHolderOnlyText) viewHolder;
                configureViewHolderOnlyText(vh, position);
                break;
        }


    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mTweets.size();
    }

    //Returns the view type of the item at position for the purposes of view recycling.
    @Override
    public int getItemViewType(int position) {
        if (mTweets.get(position).extendedEntities != null && mTweets.get(position).extendedEntities.media != null) {
            for(int i = 0; i < mTweets.get(position).extendedEntities.media.size(); i++)
            {
                if(mTweets.get(position).extendedEntities.media.get(i).type.equals("photo"))
                {
                    return TWEET_PHOTO;
                }
            }
        }
        return TWEET_TEXT;
    }

    private void configureViewHolderOnlyText(ViewHolderOnlyText vh1, int position) {
        // Get the data model based on position
        final Tweet tweet = mTweets.get(position);

        // Set item views based on your views and data model
        TextView tvUserName = vh1.tvUserName;
        tvUserName.setText(tweet.user.name);
        TextView tvUserScreenName = vh1.tvUserScreenName;
        tvUserScreenName.setText("@"+tweet.user.screenName);
        TextView tvPostTime = vh1.tvPostTime;
        tvPostTime.setText(getRelativeTimeAgo(tweet.createdAt));
        TextView tvBody = vh1.tvBody;
        tvBody.setText(tweet.text);

        new PatternEditableBuilder().
                addPattern(Pattern.compile("\\@(\\w+)"), Color.BLUE,
                        new PatternEditableBuilder.SpannableClickedListener() {
                            @Override
                            public void onSpanClicked(String text) {
//                                Toast.makeText(getContext(), "Clicked username: " + text,
//                                        Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getContext(), ProfileActivity.class);
                                i.putExtra("screen_name", text.substring(1));
                                getContext().startActivity(i);
                            }
                        }).into(tvBody);

        new PatternEditableBuilder().
                addPattern(Pattern.compile("\\#(\\w+)"), Color.BLUE,
                        new PatternEditableBuilder.SpannableClickedListener() {
                            @Override
                            public void onSpanClicked(String text) {
                                Toast.makeText(getContext(), "Clicked hashtag: " + text,
                                        Toast.LENGTH_SHORT).show();
//                                Intent i = new Intent(getContext(), ProfileActivity.class);
//                                i.putExtra("screen_name", text.substring(1));
//                                getContext().startActivity(i);
                            }
                        }).into(tvBody);

        ImageView ivUserPhoto = vh1.ivUserPhoto;
        Glide.with(mContext)
                .load(tweet.user.profileImageUrl)
                .into(ivUserPhoto);
        ivUserPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ProfileActivity.class);
                i.putExtra("screen_name", tweet.user.screenName);
                getContext().startActivity(i);
            }
        });
    }

    private void configureViewHolderPhoto(ViewHolderPhoto vh1, int position) {
        // Get the data model based on position
        Tweet tweet = mTweets.get(position);

        // Set item views based on your views and data model
        TextView tvUserName = vh1.tvUserName;
        tvUserName.setText(tweet.user.name);
        TextView tvUserScreenName = vh1.tvUserScreenName;
        tvUserScreenName.setText("@"+tweet.user.screenName);
        TextView tvPostTime = vh1.tvPostTime;
        tvPostTime.setText(getRelativeTimeAgo(tweet.createdAt));
        TextView tvBody = vh1.tvBody;
        tvBody.setText(tweet.text);
        ImageView ivUserPhoto = vh1.ivUserPhoto;
        Glide.with(mContext)
                .load(tweet.user.profileImageUrl)
                .into(ivUserPhoto);
        ImageView ivMediaPhoto = vh1.ivMediaPhoto;

        if(tweet.extendedEntities != null && tweet.extendedEntities.media != null)
        {
            for(int i = 0; i < tweet.extendedEntities.media.size(); i++)
            {
                if(tweet.extendedEntities.media.get(i).type.equals("photo"))
                {
                    Glide.with(mContext)
                            .load(tweet.extendedEntities.media.get(i).mediaUrl)
                            .into(ivMediaPhoto);
                }
            }
        }
    }


    // getRelativeTimeAgo("Mon Apr 01 21:16:23 +0000 2014");
    public String getRelativeTimeAgo(String rawJsonDate) {
        String twitterFormat = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
        SimpleDateFormat sf = new SimpleDateFormat(twitterFormat, Locale.ENGLISH);
        sf.setLenient(true);

        String relativeDate = "";
        try {
            long dateMillis = sf.parse(rawJsonDate).getTime();
            relativeDate = DateUtils.getRelativeTimeSpanString(dateMillis,
                    System.currentTimeMillis(), DateUtils.SECOND_IN_MILLIS).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return relativeDate;
    }
}
