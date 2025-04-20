package com.example.politkeniklp3i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.content.Intent;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JurusanFragment extends Fragment {

    private ImageButton move_humas;
    private ImageButton move_mi;


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

        move_mi=view.findViewById(R.id.move_mi);
        move_mi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                Intent intent=new Intent(getActivity(), WibiMainInformatikaActivity.class);
                startActivity(intent);
            }
        });


        ImageButton adbis = view.findViewById(R.id.move_adbis);
        ImageButton mi = view.findViewById(R.id.move_mi);
        ImageButton bisdig = view.findViewById(R.id.bisdig);
        ImageButton humas = view.findViewById(R.id.move_humas);
        ImageButton akuntansi = view.findViewById(R.id.move_akuntansi);

        ImageButton[] buttons = {adbis, mi, bisdig, humas, akuntansi};

        for (int i = 0; i < buttons.length; i++) {
            Animation anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in_left);
            anim.setStartOffset(i * 100); // Delay bertahap 100ms per tombol
            buttons[i].startAnimation(anim);
        }
        return view;
    }
}
