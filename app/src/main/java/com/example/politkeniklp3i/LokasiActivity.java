package com.example.politkeniklp3i;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LokasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lokasi);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Tombol untuk kembali ke halaman sebelumnya
        Button backButton = findViewById(R.id.move_back);
        backButton.setOnClickListener(v -> finish());

        View[] cards = new View[]{
                findViewById(R.id.card1),
                findViewById(R.id.card2),
                findViewById(R.id.card3),
                findViewById(R.id.card4),
                findViewById(R.id.card5),
                findViewById(R.id.card6),
                findViewById(R.id.card7),
                findViewById(R.id.card8)
        };

        String[] mapUrls = new String[]{
                "https://maps.app.goo.gl/capkAjwysdEkPKHW8", // Direktorat
                "https://maps.app.goo.gl/KkUoPFcAuGKRdNpp9", // Pasar Minggu
                "https://maps.app.goo.gl/ebMAurhMyLv5frSU8", // Jakarta Utara
                "https://maps.app.goo.gl/YrXhMXid5RyE3VP68", // Bekasi
                "https://maps.app.goo.gl/9oBLzkjx1YZdZHBP9", // Cikarang
                "https://maps.app.goo.gl/WhJiSGPDtqvwMzkk7", // Cimone
                "https://maps.app.goo.gl/Y1uTypt7MQhrZsBW7", // Depok
                "https://maps.app.goo.gl/SfvHKCV2rBEUexJdA"  // Pondok Cabe
        };

        int delay = 150;

        for (int i = 0; i < cards.length; i++) {
            View card = cards[i];
            String url = mapUrls[i];

            if (card != null) {
                Animation anim = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
                anim.setStartOffset(i * delay);
                card.startAnimation(anim);

                int finalI = i;
                card.setOnClickListener(view -> {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrls[finalI]));
                    startActivity(intent);
                });
            }
        }
    }
}