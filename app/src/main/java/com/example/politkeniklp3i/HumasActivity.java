package com.example.politkeniklp3i;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HumasActivity extends AppCompatActivity {

    private ImageButton moveApaItuHumas;
    private ImageButton movePendaftaran;
    private ImageButton moveLokasi;
    private ImageButton moveprodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hubungan_masyarakat);

        // Animasi
        CardView card1 = findViewById(R.id.image_button_home);
        CardView card2 = (CardView) findViewById(R.id.move_pendaftaran).getParent().getParent();
        CardView card3 = (CardView) findViewById(R.id.move_lokasi).getParent().getParent();
        CardView card4 = (CardView) findViewById(R.id.move_prodi).getParent().getParent();

        Animation fromLeft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        Animation fromRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);

        card1.startAnimation(fromLeft);
        card2.startAnimation(fromLeft);
        card3.startAnimation(fromRight);
        card4.startAnimation(fromRight);

        // Tombol kembali
        Button backButton = findViewById(R.id.move_back);
        backButton.setOnClickListener(v -> finish());

        // Navigasi
        moveApaItuHumas = findViewById(R.id.move_apa_itu_humas);
        moveApaItuHumas.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, ApaItuHumasActivity.class);
            startActivity(intent);
        });

        movePendaftaran = findViewById(R.id.move_pendaftaran);
        movePendaftaran.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, PendaftaranActivity.class );
            startActivity(intent);
        });

        moveLokasi = findViewById(R.id.move_lokasi);
        moveLokasi.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, LokasiActivity.class );
            startActivity(intent);
        });

        moveprodi = findViewById(R.id.move_prodi);
        moveprodi.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, ProgramStudiActivity.class );
            startActivity(intent);
        });
    }
}
