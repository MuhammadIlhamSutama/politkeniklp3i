package com.example.politkeniklp3i;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class layout11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_layout11_wibi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void pindah35(View view) {
        Intent intent = new Intent(layout11.this,Layout7.class);
        startActivity(intent);
    }

    public void pindah10(View view) {
        Intent intent = new Intent(layout11.this,layout10.class);
        startActivity(intent);
    }

    public void pindah11(View view) {
        Intent intent = new Intent(layout11.this,layout11.class);
        startActivity(intent);
    }

    public void pindah5(View view) {
        Intent intent = new Intent(layout11.this,layout5.class);
        startActivity(intent);
    }
}