package com.codepath.apps.twitterclient.fragments;

import android.os.Bundle;
import android.util.Log;

import com.codepath.apps.twitterclient.models.Tweet;
import com.codepath.apps.twitterclient.utils.TwitterApplication;
import com.codepath.apps.twitterclient.utils.TwitterClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.TextHttpResponseHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Irene on 2017/3/10.
 */

public class FavoriteTimelineFragment extends TweetsListFragment{

    private TwitterClient client;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        client = TwitterApplication.getRestClient(); //singleton client
        populateTimeline();
    }

    public static FavoriteTimelineFragment newInstance(String screenName) {
        FavoriteTimelineFragment favoriteTimelineFragment = new FavoriteTimelineFragment();
        Bundle args = new Bundle();
        args.putString("screen_name", screenName);
        favoriteTimelineFragment.setArguments(args);
        return favoriteTimelineFragment;
    }

    //send API request to get the timeline json
    //fill the listview by creating tweet object from json
    private void populateTimeline() {
        String screenName = getArguments().getString("screen_name");
        Long maxId = null;
        Log.e("DEBUG","tweets size= "+String.valueOf(getTweetsSize()));
        if (getTweetsSize() > 0) {
            maxId = getTweetsMaxId()-1;
            Log.e("DEBUG","maxid= "+String.valueOf(maxId));
        }

        client.getFavoriteTimeLine(screenName,maxId, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.d("DEBUG", responseString);
//                swipeContainer.setRefreshing(false);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.e("DEBUG",responseString);
                Gson gson = new Gson();
                Type collectionType = new TypeToken<List<Tweet>>(){}.getType();
                List<Tweet> tweets = new ArrayList<Tweet>();
                tweets.addAll((Collection<? extends Tweet>) gson.fromJson(responseString.toString(),collectionType));

                if(tweets.size() > 0)
                {
                    addAll(tweets);
                }
                //adapter.notifyDataSetChanged();
                //tweets = gson.fromJson(responseString,collectionType);

            }
        });
    }

    @Override
    public void loadNextDataFromApi(int offset) {
        populateTimeline();
    }

    public void refreshDataFromApi() {
        populateTimeline();
    }
}
