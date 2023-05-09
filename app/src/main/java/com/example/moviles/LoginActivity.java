package com.example.moviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private boolean passwordShowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        final ImageView passwordIcon = findViewById(R.id.passwordIcon);
        final TextView signUpBtn = findViewById(R.id.signUpBtn);
        final AppCompatButton signInBtn = findViewById(R.id.signInBtn);


        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MapsActivity.class));
                finish();
            }
        });
        passwordIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // checking if password is showing or not
                if(passwordShowing){
                    passwordShowing = false;
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordIcon.setImageResource(R.drawable.password);
                }
                else{
                    passwordShowing = true;
                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    // passwordIcon.setImageResource(R.drawable.password);
                }
                //move the cursor at last of the text
                password.setSelection(password.length());
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}