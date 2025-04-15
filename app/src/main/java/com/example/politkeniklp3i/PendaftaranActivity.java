package com.example.politkeniklp3i;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PendaftaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pendaftaran);

        // Tombol untuk kembali ke halaman sebelumnya
        Button backButton = findViewById(R.id.move_back);
        backButton.setOnClickListener(v -> finish());

        Button openWebsiteButton = findViewById(R.id.buttonRegister);
        openWebsiteButton.setOnClickListener(v -> {
            String url = "https://pmb.lp3i.ac.id/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CardView card1 = findViewById(R.id.card1);
        CardView card2 = findViewById(R.id.card2);
        CardView card3 = findViewById(R.id.card3);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left_1);
        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left_2);
        Animation anim3 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left_3);

        card1.startAnimation(anim1);
        card2.startAnimation(anim2);
        card3.startAnimation(anim3);

    }

}