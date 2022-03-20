package com.example.sopnotori71.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sopnotori71.R;

public class DonatorFragment extends Fragment {

    private RecyclerView showActivedonatorRecycler;
    public DonatorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_donator, container, false);

        showActivedonatorRecycler = view.findViewById(R.id.showActivedonatorRecycler);

        return view;
    }
}