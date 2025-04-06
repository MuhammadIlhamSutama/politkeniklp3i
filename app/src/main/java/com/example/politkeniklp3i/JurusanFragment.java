package com.example.politkeniklp3i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        return view;
    }
}
