package com.codepath.apps.twitterclient.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.twitterclient.R;
import com.codepath.apps.twitterclient.models.Tweet;
import com.codepath.apps.twitterclient.models.UserCredential;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.TextHttpResponseHandler;

import org.parceler.Parcels;

import java.lang.reflect.Type;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Irene on 2017/3/4.
 */

public class NewTweetFragment extends DialogFragment {

    private TwitterClient client;
    private TextView tvUserName;
    private TextView tvUserScreenName;
    private EditText etBody;
    private TextView tvCharCount;
    private ImageView ivUserPhoto;
    private Button btnTweet;

    private Tweet tweet;
    private UserCredential user;

    private NewTweetFragmentListener mCallback;


    public NewTweetFragment() {
        // Empty constructor is required for DialogFragment
        // Make sure not to add arguments to the constructor
        // Use `newInstance` instead as shown below

    }

    public static NewTweetFragment newInstance(UserCredential user) {
        NewTweetFragment frag = new NewTweetFragment();
        if(user!= null)
        {
            Bundle args = new Bundle();
            args.putParcelable("User", Parcels.wrap(user));
            frag.setArguments(args);
        }
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("DEBUG","fragment creation");
        client = TwitterApplication.getRestClient(); //singleton client
        return inflater.inflate(R.layout.compose_item, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Get field from view
        tvUserName = (TextView) view.findViewById(R.id.tvUserName);
        tvUserScreenName = (TextView) view.findViewById(R.id.tvUserScreenName);
        tvCharCount = (TextView) view.findViewById(R.id.tvCharCount);
        etBody = (EditText) view.findViewById(R.id.etBody);
        ivUserPhoto = (ImageView) view.findViewById(R.id.ivUserPhoto);
        btnTweet = (Button) view.findViewById(R.id.btTweet);

        etBody.addTextChangedListener(mTextEditorWatcher);

        // Fetch arguments from bundle and set title
        if(getArguments() != null)
        {
            user = (UserCredential) Parcels.unwrap(getArguments().getParcelable("User"));
        }
        tvUserName.setText(user.name);
        tvUserScreenName.setText("@"+user.screenName);
        Glide.with(getContext())
                .load(user.profileImageUrl)
                .into(ivUserPhoto);
        tvCharCount.setText("140");



        btnTweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Onclick", etBody.getText().toString());
                tweet = new Tweet();
                tweet.text = etBody.getText().toString();
                Log.e("DEBUG","newtweet=" + tweet.text);

                client.postStatus(tweet.text, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                        Log.e("DEBUG", responseString);
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {
                        Gson gson = new Gson();
                        Type collectionType = new TypeToken<Tweet>(){}.getType();
                        tweet = gson.fromJson(responseString,collectionType);

                        NewTweetFragmentListener listener = (NewTweetFragmentListener) getActivity();

                        listener.onFinishSettingDialog(tweet);
                        dismiss();
                    }
                });



            }
        });


        //getDialog().setTitle("New Tweet");
        // Show soft keyboard automatically and request focus to field

        getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            if (context instanceof NewTweetFragmentListener){
                mCallback = (NewTweetFragmentListener) context;
            }
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }


    // Defines the listener interface
    public interface NewTweetFragmentListener {
        void onFinishSettingDialog(Tweet tweet);
    }

    private final TextWatcher mTextEditorWatcher = new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //This sets a textview to the current length
            tvCharCount.setText(String.valueOf(140 - s.length()));
        }

        public void afterTextChanged(Editable s) {
        }
    };
}
