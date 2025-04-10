package com.example.politkeniklp3i;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentVisi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentVisi extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private boolean isExpanded = false;
    private String mParam1;
    private String mParam2;

    public FragmentVisi() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentVisi.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentVisi newInstance(String param1, String param2) {
        FragmentVisi fragment = new FragmentVisi();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_visi, container, false);
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