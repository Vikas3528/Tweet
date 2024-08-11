package com.example.tweet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.TweetViewHolder> {

    private Context context;
    private List<Tweet> tweetList;

    public TweetAdapter(Context context, List<Tweet> tweetList) {
        this.context = context;
        this.tweetList = tweetList;
    }

    @NonNull
    @Override
    public TweetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tweet, parent, false);
        return new TweetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TweetViewHolder holder, int position) {
        Tweet tweet = tweetList.get(position);
        holder.tvUsername.setText(tweet.getUsername());
        holder.tvContent.setText(tweet.getContent());
    }

    @Override
    public int getItemCount() {
        return tweetList.size();
    }

    public static class TweetViewHolder extends RecyclerView.ViewHolder {

        TextView tvUsername, tvContent;

        public TweetViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.tvUsername);
            tvContent = itemView.findViewById(R.id.tvContent);
        }
    }
}

