package com.example.politkeniklp3i;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Layout2_wibi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_layout2_wibi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void pindah5(View view) {
        Intent intent = new Intent(Layout2_wibi.this, WibiMainInformatikaActivity.class);
        startActivity(intent);
    }

    public void pindah7(View view) {
        Intent intent = new Intent(Layout2_wibi.this,layout4_wibi.class);
        startActivity(intent);
    }

    public void pindah10(View view) {
        Intent intent = new Intent(Layout2_wibi.this,layout4_wibi.class);
        startActivity(intent);
    }
    public void pindah11(View view) {
        Intent intent = new Intent(Layout2_wibi.this,layout5.class);
        startActivity(intent);
    }
}