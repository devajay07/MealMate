package com.example.mealmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class SprintScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sprint_screen);

        // Get a reference to the brand_name TextView
        TextView brandNameTextView = findViewById(R.id.brand_name);

        // Define the animation
        Animation animation = new TranslateAnimation(0, 0, brandNameTextView.getHeight(), 0);
        animation.setDuration(3000); // Set the duration of the animation in milliseconds

        // Apply the animation to the brand_name TextView
        brandNameTextView.startAnimation(animation);


        // Delay the operation by 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}