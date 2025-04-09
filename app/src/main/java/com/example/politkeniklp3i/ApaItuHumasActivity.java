package com.example.politkeniklp3i;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ApaItuHumasActivity extends AppCompatActivity {

    private LinearLayout card1, card2, card3;
    private List<LinearLayout> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_apa_itu_humas);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.lp3i.ac.id/wp-content/uploads/2023/02/5-cara-1-300x190.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.lp3i.ac.id/wp-content/uploads/2025/03/kerja-sambil-kuliah-300x168.webp", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.lp3i.ac.id/wp-content/uploads/2025/03/lulusan-ma-bisa-kerja-apa-300x200.webp", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);

        cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        card1.setOnClickListener(view -> updateCardSelection(card1));
        card2.setOnClickListener(view -> updateCardSelection(card2));
        card3.setOnClickListener(view -> updateCardSelection(card3));

        // Tampilkan fragment default
        updateCardSelection(card1);
    }

    private void updateCardSelection(LinearLayout selectedCard) {
        for (LinearLayout card : cards) {
            card.setBackgroundResource(
                    card.equals(selectedCard) ? R.drawable.bg_card_active : R.drawable.bg_card_inactive
            );
        }

        Fragment fragment = null;

        switch (selectedCard.getId()) {
            case R.id.card1:
                fragment = new FragmentApaItu();
                break;
            case R.id.card2:
                fragment = new FragmentVisi();
                break;
            case R.id.card3:
                fragment = new FragmentMisi();
                break;
        }

        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
