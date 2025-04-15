package com.example.politkeniklp3i;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

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

        // Tombol untuk kembali ke halaman sebelumnya
        Button backButton = findViewById(R.id.move_back);
        backButton.setOnClickListener(v -> finish());

        // Tombol untuk pindah ke ApaItuHumasActivity
        moveApaItuHumas = findViewById(R.id.move_apa_itu_humas);
        moveApaItuHumas.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, ApaItuHumasActivity.class);
            startActivity(intent);
        });

        // Tombol untuk pindah ke Pendaftaran
        movePendaftaran = findViewById(R.id.move_pendaftaran);
        movePendaftaran.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, PendaftaranActivity.class );
            startActivity(intent);
        });

        // Tombol untuk pindah ke lokasi
        moveLokasi = findViewById(R.id.move_lokasi);
        moveLokasi.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, LokasiActivity.class );
            startActivity(intent);
        });

        // Tombol untuk pindah ke Pendaftaran
        moveprodi = findViewById(R.id.move_prodi);
        moveprodi.setOnClickListener(view -> {
            Intent intent = new Intent(HumasActivity.this, ProgramStudiActivity.class );
            startActivity(intent);
        });
    }
}
