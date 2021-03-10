package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
    EditText et_name, et_email, et_password;
    Button btn_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_registration = findViewById(R.id.btn_registration);


        btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et_name.getText())){
                    et_name.setError("write in full");
                    return;
                }
                if (TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("write in full");
                    return;
                }
                if (TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("write in full");
                    return;
                }


                Intent registrationIntent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(registrationIntent);
            }
        });
    }
}