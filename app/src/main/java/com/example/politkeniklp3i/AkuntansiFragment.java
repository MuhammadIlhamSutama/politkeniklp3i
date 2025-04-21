package com.example.politkeniklp3i;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AkuntansiFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_akuntansi, container, false);

        // ImageButton 1
        ImageButton buttonAkuntansi = view.findViewById(R.id.move_apa_itu_humas);
        buttonAkuntansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AkuntansiPeminatanFragment akuntansiFragment = new AkuntansiPeminatanFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, akuntansiFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        // ImageButton 2
        ImageButton buttonVisiMisi = view.findViewById(R.id.move_visi_misi);
        buttonVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AkuntansiVisiMisiFragment akuntansiFragment = new AkuntansiVisiMisiFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, akuntansiFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        // ImageButton 3
        ImageButton buttonProfileLulusan = view.findViewById(R.id.move_profile_lulusan);
        buttonProfileLulusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AkuntansiProfilLulusanFragment akuntansiFragment = new AkuntansiProfilLulusanFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, akuntansiFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();            }
        });

        // ImageButton 4
        ImageButton buttonKompetensi = view.findViewById(R.id.move_kompetensi);
        buttonKompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AkuntansiKompetensiFragment akuntansiFragment = new AkuntansiKompetensiFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, akuntansiFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();               }
        });

        // ImageButton 5
        ImageButton buttonCPL = view.findViewById(R.id.move_cpl);
        buttonCPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AkuntansiCplFragment akuntansiFragment = new AkuntansiCplFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, akuntansiFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();            }
        });

        // ImageButton 6
        ImageButton buttonLokasi = view.findViewById(R.id.move_lokasi);
        buttonLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AkuntansiLokasiFragment akuntansiFragment = new AkuntansiLokasiFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, akuntansiFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();            }
        });

        return view;
    }

}
