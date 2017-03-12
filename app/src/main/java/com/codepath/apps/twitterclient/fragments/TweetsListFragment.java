package com.codepath.apps.twitterclient.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codepath.apps.twitterclient.R;
import com.codepath.apps.twitterclient.activities.DetailActivity;
import com.codepath.apps.twitterclient.adapters.TimeLineAdapter;
import com.codepath.apps.twitterclient.models.Tweet;
import com.codepath.apps.twitterclient.utils.EndlessRecyclerViewScrollListener;
import com.codepath.apps.twitterclient.utils.ItemClickSupport;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irene on 2017/3/6.
 */

public class TweetsListFragment extends Fragment{

    private ArrayList<Tweet> tweets;
    private RecyclerView rvTimeline;
    private TimeLineAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private EndlessRecyclerViewScrollListener scrollListener;
    private SwipeRefreshLayout swipeContainer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tweets = new ArrayList<>();
        adapter = new TimeLineAdapter(getContext(), tweets);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_timeline_list, parent, false);
        rvTimeline = (RecyclerView) v.findViewById(R.id.rvTimeline);
        rvTimeline.setAdapter(adapter);
        // Set layout manager to position the items
        linearLayoutManager = new LinearLayoutManager(getActivity());
        rvTimeline.setLayoutManager(linearLayoutManager);
        scrollListener = new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                // Triggered only when new data needs to be appended to the list
                // Add whatever code is needed to append new items to the bottom of the list
                Log.e("DEBUG", String.valueOf(totalItemsCount));
                loadNextDataFromApi(page);
            }
        };
        // Adds the scroll listener to RecyclerView
        rvTimeline.addOnScrollListener(scrollListener);

        ItemClickSupport.addTo(rvTimeline).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                // do it
                Intent i = new Intent(getContext(), DetailActivity.class);
                Tweet tweet = tweets.get(position);
                i.putExtra("tweet", Parcels.wrap(tweet));
                startActivity(i);
//                startActivityForResult(i,0);

                //Toast.makeText(SearchActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            }
        });

        swipeContainer = (SwipeRefreshLayout) v.findViewById(R.id.swipeContainer);
        // Setup refresh listener which triggers new data loading
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // Your code to refresh the list here.
                // Make sure you call swipeContainer.setRefreshing(false)
                // once the network request has completed successfully.
                Log.e("DEBUG","refresh");
                tweets.clear();
                adapter.notifyDataSetChanged();
                refreshDataFromApi();
            }
        });
        // Configure the refreshing colors
        swipeContainer.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        return v;
    }
    public void addAll(List<Tweet> tweet) {
        tweets.addAll(tweet);
        adapter.notifyDataSetChanged();
        swipeContainer.setRefreshing(false);
    }

    public int getTweetsSize() {
        return tweets.size();
    }

    public Long getTweetsMaxId() {
        if(getTweetsSize() > 0)
            return tweets.get(getTweetsSize()-1).id;
        else
            return null;
    }

    public void insertNewTweet(Tweet tweet) {
        tweets.add(0,tweet);
        adapter.notifyItemInserted(0);
        linearLayoutManager.scrollToPosition(0);
    }

    //need to be overwrite
    public void loadNextDataFromApi(int offset) {
        // Send an API request to retrieve appropriate paginated data
        //  --> Send the request including an offset value (i.e `page`) as a query parameter.
        //  --> Deserialize and construct new model objects from the API response
        //  --> Append the new data objects to the existing set of items inside the array of items
        //  --> Notify the adapter of the new items made with `notifyItemRangeInserted()`
    }

    //need to be overwrite
    public void refreshDataFromApi(){

    }

}
