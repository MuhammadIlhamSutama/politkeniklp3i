package com.example.mylp3i;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class AkuntansiPeminatanFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_akuntansi_peminatan, container, false);

        // Inisialisasi FrameLayouts dan Buttons
        FrameLayout frameKeuangan = view.findViewById(R.id.frame_akuntansi_keuangan);
        Button buttonKeuangan = view.findViewById(R.id.button_akuntansi_keuangan);

        FrameLayout framePerpajakan = view.findViewById(R.id.frame_akuntansi_perpajakan);
        Button buttonPerpajakan = view.findViewById(R.id.button_akuntansi_perpajakan);

        FrameLayout frameDigital = view.findViewById(R.id.frame_akuntansi_digital);
        Button buttonDigital = view.findViewById(R.id.button_akuntansi_digital);

        // Logika tombol "Akuntansi Keuangan"
        buttonKeuangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (frameKeuangan.getVisibility() == View.GONE) {
                    frameKeuangan.setVisibility(View.VISIBLE);
                } else {
                    frameKeuangan.setVisibility(View.GONE);
                }
            }
        });

        // Logika tombol "Akuntansi Perpajakan"
        buttonPerpajakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (framePerpajakan.getVisibility() == View.GONE) {
                    framePerpajakan.setVisibility(View.VISIBLE);
                } else {
                    framePerpajakan.setVisibility(View.GONE);
                }
            }
        });

        // Logika tombol "Akuntansi Digital"
        buttonDigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (frameDigital.getVisibility() == View.GONE) {
                    frameDigital.setVisibility(View.VISIBLE);
                } else {
                    frameDigital.setVisibility(View.GONE);
                }
            }
        });

        return view;
    }
}
