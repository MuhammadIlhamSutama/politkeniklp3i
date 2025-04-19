package com.example.uts;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Layout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_layout2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void pindah5(View view) {
        Intent intent = new Intent(Layout2.this, WibiMain.class);
        startActivity(intent);
    }

    public void pindah7(View view) {
        Intent intent = new Intent(Layout2.this,layout4.class);
        startActivity(intent);
    }

    public void pindah10(View view) {
        Intent intent = new Intent(Layout2.this,layout4.class);
        startActivity(intent);
    }
    public void pindah11(View view) {
        Intent intent = new Intent(Layout2.this,layout5.class);
        startActivity(intent);
    }
}