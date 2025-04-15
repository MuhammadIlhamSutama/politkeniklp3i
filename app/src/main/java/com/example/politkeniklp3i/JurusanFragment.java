package com.example.politkeniklp3i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import android.content.Intent;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class JurusanFragment extends Fragment {

    private ImageButton move_humas;


    private RecyclerView recyclerView;
    private JurusanAdapter adapter;
    private List<JurusanModel> jurusanList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jurusan, container, false);

        move_humas=view.findViewById(R.id.move_humas);
        move_humas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                Intent intent=new Intent(getActivity(), HumasActivity.class);
                startActivity(intent);
            }
        });
        ImageButton adbis = view.findViewById(R.id.move_adbis);
        ImageButton mi = view.findViewById(R.id.move_mi);
        ImageButton bisdig = view.findViewById(R.id.bisdig);
        ImageButton humas = view.findViewById(R.id.move_humas);
        ImageButton akuntansi = view.findViewById(R.id.move_akuntansi);

        Animation anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in_left);

        adbis.startAnimation(anim);
        mi.startAnimation(anim);
        bisdig.startAnimation(anim);
        humas.startAnimation(anim);
        akuntansi.startAnimation(anim);
        return view;
    }
}
