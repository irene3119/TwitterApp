package com.codepath.apps.twitterclient.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.twitterclient.R;
import com.codepath.apps.twitterclient.fragments.UserTimelineFragment;
import com.codepath.apps.twitterclient.models.UserCredential;
import com.codepath.apps.twitterclient.utils.TwitterApplication;
import com.codepath.apps.twitterclient.utils.TwitterClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.TextHttpResponseHandler;

import java.lang.reflect.Type;

import cz.msebera.android.httpclient.Header;

public class ProfileActivity extends AppCompatActivity {

    TwitterClient client;
    UserCredential user;
    ImageView ivProfilePhoto;
    ImageView ivUserPhoto;
    TextView tvUserName;
    TextView tvUserScreenName;
    TextView tvTag;
    TextView tvFollowing;
    TextView tvFollowers;
    String screenName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setView();
        client = TwitterApplication.getRestClient();
        user = new UserCredential();

        //get info from intent
        Intent i = getIntent();
        screenName = i.getStringExtra("screen_name");
        Log.e("DEBUG","screen_name= "+screenName);

        //get the screen name from the activity that launches this
        if(savedInstanceState == null)
        {
            //create the usertimeline fragment
            UserTimelineFragment userTimelineFragment = UserTimelineFragment.newInstance(screenName);
            //display usertimelinefragment within this activity (dynamic)
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContainer,userTimelineFragment);
            ft.commit(); //change the fragments
        }

        getUserShow();
    }

    public void setView() {

        ivProfilePhoto = (ImageView) findViewById(R.id.ivProfilePhoto);
        ivUserPhoto = (ImageView) findViewById(R.id.ivUserPhoto);
        tvUserName = (TextView) findViewById(R.id.tvUserName);
        tvUserScreenName = (TextView) findViewById(R.id.tvUserScreenName);
        tvTag = (TextView) findViewById(R.id.tvTag);
        tvFollowing = (TextView) findViewById(R.id.tvFollowing);
        tvFollowers = (TextView) findViewById(R.id.tvFollowers);

    }


    public void getUserShow() {
        client.getUserShow(screenName, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.d("DEBUG", responseString);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.e("DEBUG","User Show= "+responseString);
                Gson gson = new Gson();
                Type collectionType = new TypeToken<UserCredential>(){}.getType();
                user = gson.fromJson(responseString,collectionType);
                if(user != null) {
//                    getSupportActionBar().setTitle("@"+user.screenName);
                    setViewContent();
                }
                else {
                    Log.e("DEBUG","NoUserCredential");
                }
            }
        });
    }


    public void setViewContent() {
        Glide.with(this)
                .load(user.profileBannerUrl)
                .centerCrop()
                .into(ivProfilePhoto);

        Glide.with(this)
                .load(user.profileImageUrl)
                .into(ivUserPhoto);

        tvUserName.setText(user.name);
        tvUserScreenName.setText("@"+user.screenName);
        tvTag.setText(user.description);
        tvFollowing.setText(String.valueOf(user.friendsCount));
        tvFollowers.setText(String.valueOf(user.followersCount));
    }


}
