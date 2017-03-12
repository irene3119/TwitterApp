package com.codepath.apps.twitterclient.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.twitterclient.R;
import com.codepath.apps.twitterclient.models.Tweet;
import com.codepath.apps.twitterclient.utils.NewTweetFragment;
import com.codepath.apps.twitterclient.utils.TwitterApplication;
import com.codepath.apps.twitterclient.utils.TwitterClient;

import org.parceler.Parcels;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailActivity extends AppCompatActivity implements NewTweetFragment.NewTweetFragmentListener{


    private ImageView ivUserPhoto;
    private TextView tvUserName;
    private TextView tvUserScreenName;
    private TextView tvBody;
    private ImageView ivMediaPhoto;
    private TextView tvPostTime;
    private TextView tvRetweet;
    private ImageView ivFavorite;
    private TextView tvFavorite;
    private ImageView ivReply;

    private NewTweetFragment newTweetFragment;

    TwitterClient client;

    Tweet tweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        client = TwitterApplication.getRestClient(); //singleton client

        tweet = (Tweet) Parcels.unwrap(getIntent().getParcelableExtra("tweet"));

        setViews();

    }

    public void setViews() {
        ivUserPhoto = (ImageView) findViewById(R.id.ivUserPhoto);
        tvUserName = (TextView) findViewById(R.id.tvUserName);
        tvUserScreenName = (TextView) findViewById(R.id.tvUserScreenName);
        tvBody = (TextView) findViewById(R.id.tvBody);
        ivMediaPhoto = (ImageView) findViewById(R.id.ivMediaPhoto);
        tvPostTime = (TextView) findViewById(R.id.tvPostTime);
        tvRetweet = (TextView) findViewById(R.id.tvRetweet);
        tvFavorite = (TextView) findViewById(R.id.tvLike);
        ivFavorite = (ImageView) findViewById(R.id.ivLike);
        ivReply = (ImageView) findViewById(R.id.ivReply);

        Glide.with(this)
                .load(tweet.user.profileImageUrl)
                .into(ivUserPhoto);

        tvUserName.setText(tweet.user.name);
        tvUserScreenName.setText("@"+tweet.user.screenName);
        tvBody.setText(tweet.text);

        if(tweet.extendedEntities != null && tweet.extendedEntities.media != null)
        {
            for(int i = 0; i < tweet.extendedEntities.media.size(); i++)
            {
                if(tweet.extendedEntities.media.get(i).type.equals("photo"))
                {
                    Glide.with(this)
                            .load(tweet.extendedEntities.media.get(i).mediaUrl)
                            .into(ivMediaPhoto);
                }
            }
        }
        tvPostTime.setText(formatTimestamp(tweet.createdAt));
        if(tweet.retweetCount != null)
            tvRetweet.setText(String.valueOf(tweet.retweetCount));

        tvFavorite.setText(String.valueOf(tweet.favoriteCount));

        if(tweet.favorited)
            ivFavorite.setImageResource(R.drawable.ic_favorite_red);
        else
            ivFavorite.setImageResource(R.drawable.ic_favorite);

        ivReply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showComposeDialog();
            }
        });

    }

    public String formatTimestamp(String rawJsonDate) {

        String twitterFormat = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
        String newFormat = "yyyy/MM/dd HH:mm";
        String result = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(twitterFormat);
            Date origin = sdf.parse(rawJsonDate);
            SimpleDateFormat df = new SimpleDateFormat(newFormat);
            result = df.format(origin);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;

    }

    //show reply fragment
    public void showComposeDialog() {
        FragmentManager fm = getSupportFragmentManager();
        newTweetFragment = NewTweetFragment.newInstance(tweet);
        newTweetFragment.show(fm, "reply_fragment");

    }

    @Override
    public void onFinishSettingDialog(Tweet newTweet){
//        tweet = newTweet;
        Log.e("DEBUG","Detail reply:"+newTweet.text);
        Intent intent = new Intent(this, TimelineActivity.class);
        intent.putExtra("tweet", Parcels.wrap(newTweet));
//        finish();
//        i.putExtra("tweet", Parcels.wrap(newTweet));
//        finish();
        startActivity(intent);
    }
}
