package com.example.politkeniklp3i;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class HumasActivity extends AppCompatActivity {

    private ImageButton move_apa_itu_humas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hubungan_masyarakat);

        Button backButton = findViewById(R.id.move_back);
        backButton.setOnClickListener(v -> finish());

       move_apa_itu_humas = findViewById(R.id.move_apa_itu_humas);
       move_apa_itu_humas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(HumasActivity.this, ApaItuHumasActivity.class);
               startActivity(intent);
           }
       });

    }
}