package com.example.sopnotori71.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.sopnotori71.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class InformationActivity extends AppCompatActivity {

    private CircleImageView profileImg;
    private ImageView cameraProfileImg;
    private EditText phoneNumber,address;
    private Spinner spinner_bloodGroup,spinner_gender,spinner_date,spinner_month,spinner_years,spinner_date_ld,spinner_month_ld,spinner_years_ld;
    private AppCompatButton finishBtn;

    private String name, email, password, phone, u_address, u_blood, u_gender, u_dob, u_last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        email = intent.getStringExtra("email");
        password = intent.getStringExtra("pass");

        gettingLayoutIDs();

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initialize();
            }
        });

    }

    private void initialize(){

        phone = phoneNumber.getText().toString();
        u_address = address.getText().toString();
        u_blood = spinner_bloodGroup.getSelectedItem().toString();
        u_gender = spinner_gender.getSelectedItem().toString();
        u_dob = spinner_date.getSelectedItem().toString() + "-" + spinner_month.getSelectedItem().toString() + "-" + spinner_years.getSelectedItem().toString();
        u_last = spinner_date_ld.getSelectedItem().toString() + "-" + spinner_month_ld.getSelectedItem().toString() + "-" + spinner_years_ld.getSelectedItem().toString();



    }

    private void gettingLayoutIDs() {
        profileImg = findViewById(R.id.profile_image);
        cameraProfileImg = findViewById(R.id.cameraProfileImg);
        phoneNumber = findViewById(R.id.phoneId);
        address = findViewById(R.id.addressId);
        spinner_bloodGroup = findViewById(R.id.blood_spinnerId);
        spinner_gender = findViewById(R.id.gender_spinnerId);
        spinner_date = findViewById(R.id.date_spinnerId);
        spinner_month = findViewById(R.id.month_spinnerId);
        spinner_years = findViewById(R.id.year_spinnerId);
        spinner_date_ld = findViewById(R.id.ld_date_spinnerId);
        spinner_month_ld = findViewById(R.id.ld_month_spinnerId);
        spinner_years_ld = findViewById(R.id.ld_year_spinnerId);
        finishBtn = findViewById(R.id.finishBtnId);



    }
}