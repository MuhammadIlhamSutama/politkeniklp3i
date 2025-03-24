package com.example.politkeniklp3i;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = getIntent().getStringExtra("image");

        Glide.with(this).load(imageUrl).into(imageView);
    }
}
