package com.example.sopnotori71.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sopnotori71.Activitys.ProfileEditActivity;
import com.example.sopnotori71.R;
import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileFragment extends Fragment {

    private ImageView backBtn;
    private CircleImageView profileImg;
    private TextView name,bloodgroup,ageTxt,genderTxt,mailTxt,phoneTxt,policy,rateUs,aboutUs,logout,deleteAccount;
    private Button profileEditBtn;
    FirebaseAuth auth;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        auth = FirebaseAuth.getInstance();

        profileImg = view.findViewById(R.id.profileImgId);
        name = view.findViewById(R.id.nameId);
        bloodgroup = view.findViewById(R.id.bloodgroupTxtId);
        ageTxt = view.findViewById(R.id.ageTxtId);
        genderTxt = view.findViewById(R.id.genderTxtId);
        mailTxt = view.findViewById(R.id.mailTxtId);
        phoneTxt = view.findViewById(R.id.phoneTxtId);
        profileEditBtn = view.findViewById(R.id.profileEditBtnId);
        policy = view.findViewById(R.id.policyId);
        rateUs = view.findViewById(R.id.rateUsId);
        aboutUs = view.findViewById(R.id.aboutUsId);
        logout = view.findViewById(R.id.logoutId);
        deleteAccount = view.findViewById(R.id.deleteAccountId);


        profileEditBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ProfileEditActivity.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                getActivity().finish();
            }
        });


        return view;
    }
}