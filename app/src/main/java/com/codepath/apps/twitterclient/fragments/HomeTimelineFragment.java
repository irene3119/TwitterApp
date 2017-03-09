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
 * Created by Irene on 2017/3/7.
 */

public class HomeTimelineFragment extends TweetsListFragment{

    private TwitterClient client;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        client = TwitterApplication.getRestClient(); //singleton client
        populateTimeline();
    }

    //send API request to get the timeline json
    //fill the listview by creating tweet object from json
    private void populateTimeline() {

        Long max_id = null;
        Log.e("DEBUG","tweets size= "+String.valueOf(getTweetsSize()));
        if (getTweetsSize() > 0) {
            max_id = getTweetsMaxId()-1;
            Log.e("DEBUG","maxid= "+String.valueOf(max_id));
        }

        client.getHomeTimeLine(max_id, new TextHttpResponseHandler() {
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
                Log.e("DEBUG", String.valueOf(tweets.size()));
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
