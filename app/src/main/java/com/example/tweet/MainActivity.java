package com.example.tweet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TweetAdapter tweetAdapter;
    private List<Tweet> tweetList;
    private FloatingActionButton fabCreateTweet;
    private ImageButton btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        fabCreateTweet = findViewById(R.id.fabCreateTweet);
        btnProfile = findViewById(R.id.btnProfile);

        tweetList = new ArrayList<>();
        tweetAdapter = new TweetAdapter(this, tweetList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(tweetAdapter);

        btnProfile.setOnClickListener(v -> {
            Log.d("MainActivity", "Profile button clicked");
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
        });


        fabCreateTweet.setOnClickListener(v -> {
            // Handle tweet creation
        });

        loadTweets();
    }

    private void loadTweets() {
        // Dummy data
        tweetList.add(new Tweet("User1", "This is a sample tweet"));
        tweetList.add(new Tweet("User2", "This is another sample tweet"));

        tweetAdapter.notifyDataSetChanged();
    }
}


