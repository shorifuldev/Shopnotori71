package com.example.sopnotori71.Activitys;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.sopnotori71.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {


    private AppCompatButton signIn;
    private EditText email,password;
    private TextView forgotpass,signUp;
    private ProgressBar bar;

    FirebaseAuth auth;
    String u_email,u_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);

        gettingLayoutIDs();

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userSignIn();


            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

    }

    private void userSignIn() {
        u_email = email.getText().toString().trim();
        u_password = password.getText().toString().trim();
        if (u_email.isEmpty()){
            email.setError("Email can't be empty!");
            email.requestFocus();
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(u_email).matches()){
            email.setError("Enter the correct Email");
            email.requestFocus();
        }
        else if(u_password.length() < 6){
            password.setError("Minimun length should be 6");
            password.requestFocus();
        }
        else {
            auth.signInWithEmailAndPassword(u_email,u_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Intent intent = new Intent(SignInActivity.this,HomeActivity.class);
                        startActivity(intent);
                        clearInputData();
                    }
                    else {
                        Toast.makeText(SignInActivity.this, "Email OR Password not match", Toast.LENGTH_SHORT).show();
                    }
                }

            });
        }
    }

    private void clearInputData() {
        email.getText().clear();
        password.getText().clear();
    }

    private void gettingLayoutIDs(){

        auth = FirebaseAuth.getInstance();
        signIn = findViewById(R.id.signinBtnId);
        bar = findViewById(R.id.signinprogress);
        email = findViewById(R.id.userEmailId);
        password = findViewById(R.id.userPasswordId);
        forgotpass = findViewById(R.id.forgotpassTxtId);
        signUp = findViewById(R.id.signUpTxtId);
    }
}
