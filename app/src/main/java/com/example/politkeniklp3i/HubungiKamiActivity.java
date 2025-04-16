package com.example.politkeniklp3i;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HubungiKamiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungi_kami);

        // Tombol kembali
        Button backButton = findViewById(R.id.move_back);
        backButton.setOnClickListener(v -> finish());

        // Ambil elemen
        View topLayout = findViewById(R.id.topLayout);
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);

        // Atur elemen invisible dulu
        topLayout.setVisibility(View.INVISIBLE);
        card1.setVisibility(View.INVISIBLE);
        card2.setVisibility(View.INVISIBLE);
        card3.setVisibility(View.INVISIBLE);

        // Load animasi
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Handler handler = new Handler();

        // Tampilkan satu per satu dengan interval
        handler.postDelayed(() -> {
            topLayout.setVisibility(View.VISIBLE);
            topLayout.startAnimation(fadeIn);
        }, 0);

        handler.postDelayed(() -> {
            card1.setVisibility(View.VISIBLE);
            card1.startAnimation(fadeIn);
        }, 400);

        handler.postDelayed(() -> {
            card2.setVisibility(View.VISIBLE);
            card2.startAnimation(fadeIn);
        }, 800);

        handler.postDelayed(() -> {
            card3.setVisibility(View.VISIBLE);
            card3.startAnimation(fadeIn);
        }, 1200);
    }
}
