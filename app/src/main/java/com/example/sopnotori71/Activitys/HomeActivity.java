package com.example.sopnotori71.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.sopnotori71.Fragment.DonatorFragment;
import com.example.sopnotori71.Fragment.HomeFragment;
import com.example.sopnotori71.Fragment.ProfileFragment;
import com.example.sopnotori71.R;

public class HomeActivity extends AppCompatActivity {

    private Button home,donator,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gettingLayoutIDs();

        replaceFragment(new HomeFragment());

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new HomeFragment());
            }
        });
        donator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DonatorFragment());
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new ProfileFragment());
            }
        });


    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayoutId,fragment);
        fragmentTransaction.commit();

    }


    private void gettingLayoutIDs() {
        home = findViewById(R.id.home);
        donator = findViewById(R.id.Donator);
        profile = findViewById(R.id.Profile);

    }
}