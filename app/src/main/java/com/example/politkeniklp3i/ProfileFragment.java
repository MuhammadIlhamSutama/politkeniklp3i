package com.example.politkeniklp3i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    private boolean isExpanded = false;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Inisialisasi elemen UI
        TextView expandableText = view.findViewById(R.id.expandable_text);
        Button expandButton = view.findViewById(R.id.expand_button);

        // Event Klik Tombol Expand
        expandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isExpanded) {
                    expandableText.setMaxLines(10);
                    expandButton.setText("Lihat Selengkapnya");
                    expandButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_dropdown, 0);
                } else {
                    expandableText.setMaxLines(Integer.MAX_VALUE);
                    expandButton.setText("Sembunyikan");
                    expandButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrowup, 0);
                }
                isExpanded = !isExpanded;
            }
        });

        return view;
    }
}
