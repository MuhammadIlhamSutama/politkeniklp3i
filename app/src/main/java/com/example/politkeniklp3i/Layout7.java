package com.example.politkeniklp3i;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Layout7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_layout7_wibi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void pindah25(View view) {
        Intent intent = new Intent(Layout7.this, WibiMainInformatikaActivity.class);
        startActivity(intent);
    }

    public void pindah20(View view) {
        Intent intent = new Intent(Layout7.this,layout8.class);
        startActivity(intent);
    }

    public void pindah30(View view) {
        Intent intent = new Intent(Layout7.this,layout9.class);
        startActivity(intent);
    }

    public void pindah32(View view) {
        Intent intent = new Intent(Layout7.this,layout10.class);
        startActivity(intent);
    }

    public void pindah34(View view) {
        Intent intent = new Intent(Layout7.this,layout11.class);
        startActivity(intent);
    }
}