package com.example.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        TextView textView2 = findViewById(R.id.textView2);


        User user = new User("John Doe", "Lorem ipsum dolor sit amet.", 1, false);


        if (user.isFollowed()) {
            button.setText("Unfollow");
        } else {
            button.setText("Follow");
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.isFollowed()) {
                    user.setFollowed(false);
                    button.setText("Follow");
                } else {
                    user.setFollowed(true);
                    button.setText("Unfollow");
                }
            }
        });
    }
}