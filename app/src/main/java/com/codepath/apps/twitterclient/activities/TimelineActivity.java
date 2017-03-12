package com.codepath.apps.twitterclient.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.codepath.apps.twitterclient.R;
import com.codepath.apps.twitterclient.fragments.HomeTimelineFragment;
import com.codepath.apps.twitterclient.fragments.MentionsTimelineFragment;
import com.codepath.apps.twitterclient.models.Tweet;
import com.codepath.apps.twitterclient.models.UserCredential;
import com.codepath.apps.twitterclient.utils.NewTweetFragment;
import com.codepath.apps.twitterclient.utils.TwitterApplication;
import com.codepath.apps.twitterclient.utils.TwitterClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.TextHttpResponseHandler;

import java.lang.reflect.Type;

import cz.msebera.android.httpclient.Header;

//import static com.codepath.apps.twitterclient.R.id.fragment_timeline;

public class TimelineActivity extends AppCompatActivity implements NewTweetFragment.NewTweetFragmentListener{

    private TwitterClient client;
    private UserCredential userCredential;
    private FloatingActionButton composeBtn;
    private NewTweetFragment newTweetFragment;
    private HomeTimelineFragment homeTimelineFragment;
    private MentionsTimelineFragment mentionsTimelineFragment;
    private Tweet tweet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        client = TwitterApplication.getRestClient();
        userCredential = new UserCredential();
        getUserCredential();
        setViews();
//        if(savedInstanceState == null) {
//            fragmentTweetsList = (TweetsListFragment) getSupportFragmentManager().findFragmentById(fragment_timeline);
//        }
    }

    @Override
    protected void onResume() {
        //homeTimelineFragment.updateTweet(tweet);
        Log.e("DEBUG","resume");
        super.onResume();
//        homeTimelineFragment.refreshDataFromApi();
//        Intent i = getIntent();
//        if(i != null)
//        {
//            Log.e("DEBUG","intent not null");
//            if(Parcels.unwrap(i.getParcelableExtra("tweet")) != null) {
//                Log.e("DEBUG","atweet not null");
//                Tweet aTweet = (Tweet) Parcels.unwrap(i.getParcelableExtra("tweet"));
//                homeTimelineFragment.updateTweet(aTweet);
//            }
//
//        }

    }

//    @Override
//    protected void onRestart() {
//        //homeTimelineFragment.updateTweet(tweet);
//        super.onRestart();
//        finish();
//        startActivity(getIntent());
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.miProfile) {
            onProfileView();
        }
//        else if (id==R.id.action_other)
//        {
//            Toast toast=Toast.makeText(this, "Other Clicked.", Toast.LENGTH_LONG);
//            toast.show();
//        }
//        else if (id==R.id.action_Exit)
//        {
//            finish();
//        }
        return super.onOptionsItemSelected(item);
    }

    private void setViews()
    {
        homeTimelineFragment = new HomeTimelineFragment();
        mentionsTimelineFragment = new MentionsTimelineFragment();
        //Get view pager
        ViewPager vpPager = (ViewPager) findViewById(R.id.viewpager);
        //Set ViewPagerAdapter for the pager
        vpPager.setAdapter(new TweetsPagerAdapter(getSupportFragmentManager()));
        //find the sliding tabstrip
        PagerSlidingTabStrip tabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        //attach the tabstrip into viewpager
        tabStrip.setViewPager(vpPager);
        composeBtn = (FloatingActionButton) findViewById(R.id.fbtnCompose);
        composeTweet();

    }

    private void composeTweet() {

        composeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showComposeDialog();
            }
        });
    }

    private void getUserCredential() {
        client.getUserCredential(new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.d("DEBUG", responseString);
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.e("DEBUG",responseString);
                Gson gson = new Gson();
                Type collectionType = new TypeToken<UserCredential>(){}.getType();
                userCredential = gson.fromJson(responseString,collectionType);
            }
        });

    }

    //go to user profile activity
    private void onProfileView() {

        Intent i = new Intent(this, ProfileActivity.class);
        i.putExtra("screen_name",userCredential.screenName);
        startActivity(i);
    }

    //show compose fragment
    private void showComposeDialog() {
        FragmentManager fm = getSupportFragmentManager();
        newTweetFragment = NewTweetFragment.newInstance(null);
        newTweetFragment.show(fm, "compose_fragment");

    }

    @Override
    public void onFinishSettingDialog(Tweet newTweet){
        tweet = newTweet;
        Log.e("DEBUG",tweet.text);
        homeTimelineFragment.updateTweet(tweet);
    }

    //Return the order of fragments for view pagers
    public class TweetsPagerAdapter extends FragmentPagerAdapter {
        final int PAGE_COUNT = 2;
        private String tabTitles[] = {"HOME","MENTIONS"};

        //Adapter gets the manager insert or remove fragment from activity
        public TweetsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        //The order and creation of fragments within the pager
        @Override
        public Fragment getItem(int position) {
            if(position == 0) {
                return homeTimelineFragment;
            } else if(position == 1) {
                return mentionsTimelineFragment;
            } else {
                return null;
            }
        }

        //return the tab title
        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

        @Override
        public int getCount() {
            return tabTitles.length;
        }
    }
}
