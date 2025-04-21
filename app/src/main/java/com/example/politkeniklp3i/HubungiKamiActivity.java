package com.example.politkeniklp3i;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
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

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

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


        // Card 1: Buka WhatsApp
        card1.setOnClickListener(v -> {
            String phoneNumber = "621514756666"; // Ganti dengan nomor WA kamu (tanpa +)
            String url = "https://wa.me/" + phoneNumber;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        // Card 2: Buka Gmail
        card2.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:marketing.yayasan@lp3i.ac.id")); // Ganti dengan email tujuan
            intent.putExtra(Intent.EXTRA_SUBJECT, "Halo dari aplikasi!");
            intent.putExtra(Intent.EXTRA_TEXT, "Saya ingin menghubungi Anda...");
            startActivity(intent);
        });

        // Card 3: Buka Google Maps
        card3.setOnClickListener(v -> {
            String location = "Politeknik LP3I Jakarta"; // Bisa juga koordinat: "geo:0,0?q=..."
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
    }
}
