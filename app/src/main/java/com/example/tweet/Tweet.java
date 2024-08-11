package com.example.tweet;

public class Tweet {
    private String username;
    private String content;

    public Tweet(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }
}

