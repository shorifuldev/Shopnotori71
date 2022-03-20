package com.example.sopnotori71.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.sopnotori71.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileEditActivity extends AppCompatActivity {
    private ImageView backBtn,camera;
    private CircleImageView profileImg;
    private EditText nameEditTxt,bloodgropuEditTxt,genderEditTxt,passwordEditTxt;
    private Button cancelBtn,saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        gettingLayoutIDs();
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private void gettingLayoutIDs() {

        backBtn = findViewById(R.id.backbtnId);
        camera = findViewById(R.id.cameraId);
        profileImg = findViewById(R.id.profileImg);
        nameEditTxt = findViewById(R.id.nameEditTxtId);
        bloodgropuEditTxt = findViewById(R.id.bloodgropuEditTxtId);
        genderEditTxt = findViewById(R.id.genderEditTxtId);
        passwordEditTxt = findViewById(R.id.passwordEditTxtId);
        cancelBtn = findViewById(R.id.cancelBtnId);
        saveBtn = findViewById(R.id.saveBtnId);

    }
}