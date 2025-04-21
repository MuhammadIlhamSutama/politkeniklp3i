package com.example.mylp3i;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AkuntansiProfilLulusanFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_akuntansi_profil_lulusan, container, false);
    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Hilangkan bottom navigation bar
//        requireActivity().findViewById(R.id.bottom_navigation).setVisibility(View.GONE);
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//
//        // Tampilkan kembali bottom navigation bar saat keluar dari fragment ini
//        requireActivity().findViewById(R.id.bottom_navigation).setVisibility(View.VISIBLE);
//    }

}