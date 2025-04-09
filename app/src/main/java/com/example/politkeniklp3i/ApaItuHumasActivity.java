package com.example.politkeniklp3i;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class ApaItuHumasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_apa_itu_humas);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        // Menambahkan gambar dari URL
        slideModels.add(new SlideModel("https://www.lp3i.ac.id/wp-content/uploads/2023/02/5-cara-1-300x190.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.lp3i.ac.id/wp-content/uploads/2025/03/kerja-sambil-kuliah-300x168.webp", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.lp3i.ac.id/wp-content/uploads/2025/03/lulusan-ma-bisa-kerja-apa-300x200.webp", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}
