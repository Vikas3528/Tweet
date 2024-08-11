package com.example.tweet;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imgProfilePicture;
    private TextView tvUsername, tvBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgProfilePicture = findViewById(R.id.imgProfilePicture);
        tvUsername = findViewById(R.id.tvUsername);
        tvBio = findViewById(R.id.tvBio);

        loadUserProfile();
    }

    private void loadUserProfile() {
        // Dummy data
        tvUsername.setText("John Doe");
        tvBio.setText("Android Developer | Tech Enthusiast");
    }
}

