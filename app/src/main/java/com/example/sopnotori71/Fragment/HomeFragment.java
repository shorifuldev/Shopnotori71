package com.example.sopnotori71.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sopnotori71.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeFragment extends Fragment {


    private TextView userName;
    private CircleImageView profileImg;
    private RecyclerView showReqRecycler;
    private ImageView requestImgBtn;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        userName = view.findViewById(R.id.userNameTxt);
        profileImg = view.findViewById(R.id.profile_image);
        showReqRecycler = view.findViewById(R.id.showReqRecycler);
        requestImgBtn = view.findViewById(R.id.requestImgBtnId);


        return view;
    }

    private void gettingLayoutIDs() {



    }
}