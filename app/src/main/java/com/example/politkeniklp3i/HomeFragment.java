package com.example.politkeniklp3i;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

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

        // Data gambar
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://www.lp3i.ac.id/wp-content/uploads/2023/03/Krw-ldks.jpg");
        arrayList.add("https://www.lp3i.ac.id/wp-content/uploads/2022/03/2.jpg");
        arrayList.add("https://www.lp3i.ac.id/wp-content/uploads/2025/02/IMG_3539-scaled-e1739860812874.jpg");
        arrayList.add("https://www.lp3i.ac.id/wp-content/uploads/2023/03/Krw-ldks.jpg");

        // Inisialisasi adapter
        ImageAdapter adapter = new ImageAdapter(getContext(), arrayList);
        recyclerView.setAdapter(adapter);

        // Klik Item
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
