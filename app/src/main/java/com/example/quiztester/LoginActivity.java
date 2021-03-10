package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText et_email, et_password;
    Button btn_login, btn_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login = findViewById(R.id.btn_login);
        btn_registration = findViewById(R.id.btn_registration);

        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);

        btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrationIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(registrationIntent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("write in full");
                    return;
                }
                if (TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("write in full");
                    return;
                }
                if (et_email.getText().toString().equals("user@gmail.com") &&
                        et_password.getText().toString().equals("123123")) {

                    Intent registrationIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(registrationIntent);

                }else
                    Toast.makeText(LoginActivity.this, "email or password is error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}