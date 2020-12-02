package com.example.a252;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView text_login, text_password, text_answer;
    EditText ed_login, ed_password;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_login = findViewById(R.id.text_login);
        text_password = findViewById(R.id.text_password);
        text_answer = findViewById(R.id.text_answer);
        ed_login = findViewById(R.id.login);
        ed_password = findViewById(R.id.password);
        enter = findViewById(R.id.button_enter);
        enter.setOnClickListener(this);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        String str_login = getResources().getString(R.string.login);
        String str_password = getResources().getString(R.string.password);
        if (str_login.equals("1")) {
            if (str_password.equals("1")) {
                text_answer.setText(R.string.True);
                text_answer.setTextColor(getResources().getColor(R.color.green));
            } else {
                text_answer.setText(R.string.False);
                text_answer.setTextColor(getResources().getColor(R.color.red));
            }
        } else {
            text_answer.setText(R.string.False);
            text_answer.setTextColor(getResources().getColor(R.color.red));
        }
    }
}