package com.example.sopnotori71.Activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sopnotori71.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class SignUpActivity extends AppCompatActivity {

    private AppCompatButton signUp;
    private EditText name,email,password,confirmPassword;
    private TextView signIn;


    public String u_name,u_email,u_password,u_confirmpass;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        gettingLayoutIDs();


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //userRegistation();
                initialize();
                if (validate()){
                    Intent intent = new Intent(SignUpActivity.this, InformationActivity.class);
                    intent.putExtra("name", u_name);
                    intent.putExtra("email", u_email);
                    intent.putExtra("pass", u_password);
                    startActivity(intent);
                }
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initialize(){
        u_name = name.getText().toString().trim();
        u_email = email.getText().toString().trim();
        u_password = password.getText().toString().trim();
        u_confirmpass = confirmPassword.getText().toString().trim();
    }

    private boolean validate(){
        if(u_name.isEmpty()){
            name.setError("Name can't be empty!");
            name.requestFocus();
            return false;
        }
        else if (u_email.isEmpty()){
            email.setError("Email can't be empty!");
            email.requestFocus();
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(u_email).matches()){
            email.setError("Enter the correct Email");
            email.requestFocus();
            return false;
        }
        else if(u_password.isEmpty()){
            password.setError("Password can't be empty!");
            password.requestFocus();
            return false;
        }
        else if(u_password.length() < 6){
            password.setError("Minimun length should be 6");
            password.requestFocus();
            return false;
        }
        else if (u_confirmpass.isEmpty()){
            confirmPassword.setError("Password can't be empty!");
            confirmPassword.requestFocus();
            return false;
        }

        else if(!u_confirmpass.matches(u_password)){
            confirmPassword.setError("Password not match!");
            confirmPassword.requestFocus();
            return false;
        }
        else return true;
    }

    private void clearInputData() {
        name.getText().clear();
        email.getText().clear();
        password.getText().clear();
        confirmPassword.getText().clear();

    }

    private void gettingLayoutIDs() {

        auth = FirebaseAuth.getInstance();

        signUp = findViewById(R.id.signUpBtnId);
        name = findViewById(R.id.userNameId);
        email = findViewById(R.id.userEmailId);
        password = findViewById(R.id.userPasswordId);
        confirmPassword = findViewById(R.id.confirmPasswordId);
        signIn = findViewById(R.id.signInTxtId);


    }
}