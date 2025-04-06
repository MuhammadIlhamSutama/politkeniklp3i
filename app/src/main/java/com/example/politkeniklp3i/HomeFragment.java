package com.example.politkeniklp3i;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.example.politkeniklp3i.ImageViewActivity;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        // Buat list berita
        ArrayList<NewsItem> newsList = new ArrayList<>();
        newsList.add(new NewsItem(
                "https://www.lp3i.ac.id/wp-content/uploads/2025/03/HUT-LP3I-300x169.webp",
                "HUT ke-36 LP3I: Melangkah Maju Cetak Profesional yang Unggul",
                "28 Maret 2025"));
        newsList.add(new NewsItem(
                "https://www.lp3i.ac.id/wp-content/uploads/2022/12/Gambar1-300x150.jpg",
                "Bersatu dalam Empati, Keluarga Besar LP3I Turut Serta dalam Membantu Korban Gempa ...",
                "01 Desember 2022"));
        newsList.add(new NewsItem(
                "https://www.lp3i.ac.id/wp-content/uploads/2023/09/100-1-240x300.png",
                "Beasiswa LP3I Untuk Milangkala Karawang Tahun Akademik 2023/2024",
                "19 Desember 2023"));
        newsList.add(new NewsItem(
                "https://www.lp3i.ac.id/wp-content/uploads/2023/03/Krw-ldks.jpg",
                "Pentingnya Mengadakan Latihan Dasar Kepemimpinan Student of LP3I",
                "05 April 2021"));

        // Pasang adapter
        ImageAdapter adapter = new ImageAdapter(getContext(), newsList);
        recyclerView.setAdapter(adapter);

        // Tangani klik item
        adapter.setOnItemClickListener(new ImageAdapter.OnItemClickListener() {
            @Override
            public void onClick(ImageView imageView, String url) {
                Intent intent = new Intent(getActivity(), ImageViewActivity.class);
                intent.putExtra("image", url);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(getActivity(), imageView, "image");
                    startActivity(intent, options.toBundle());
                } else {
                    startActivity(intent);
                }
            }
        });

        return view;
    }
}
