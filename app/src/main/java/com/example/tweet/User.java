package com.example.tweet;


import java.util.List;

public class User {
    private String userId;
    private String username;
    private List<String> followers;
    private List<String> following;

    public User() { }

    public User(String userId, String username, List<String> followers, List<String> following) {
        this.userId = userId;
        this.username = username;
        this.followers = followers;
        this.following = following;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getFollowers() {
        return followers;
    }

    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }

    public List<String> getFollowing() {
        return following;
    }

    public void setFollowing(List<String> following) {
        this.following = following;
    }
}

