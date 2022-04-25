package com.example.assignment_mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String code = "1234";
    private TextView txt_code;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_0;
    private Button btn_back;
    private Button btn_open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        txt_code = findViewById(R.id.text_view);
        btn_1 = findViewById(R.id.button_1);
        btn_2 = findViewById(R.id.button_2);
        btn_3 = findViewById(R.id.button_3);
        btn_4 = findViewById(R.id.button_4);
        btn_5 = findViewById(R.id.button_5);
        btn_6 = findViewById(R.id.button_6);
        btn_7 = findViewById(R.id.button_7);
        btn_8 = findViewById(R.id.button_8);
        btn_9 = findViewById(R.id.button_9);
        btn_0 = findViewById(R.id.button_0);
        btn_open = findViewById(R.id.button_open);
        btn_back = findViewById(R.id.button_back);

    }

    private void setText(int n){
        String oldText = txt_code.getText().toString();
        if(oldText.length() >= 4){
            return;
        }
        txt_code.setText(oldText + n);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(1);
            }
        }
        );
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(2);
            }
        }
        );
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(3);
            }
        }
        );
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(4);
            }
        }
        );
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(5);
            }
        }
        );
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(6);
            }
        }
        );
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(7);
            }
        }
        );
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(8);
            }
        }
        );
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(9);
            }
        }
        );
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(0);
            }
        }
        );
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldText = txt_code.getText().toString();
                if(oldText.length() > 0){
                    txt_code.setText(oldText.substring(0, oldText.length() - 1));
                }
            }
        }
        );
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldText = txt_code.getText().toString();
                if(oldText.equals(code)){
                    Intent intent = new Intent(getApplicationContext(), WelcmeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Key", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );
    }
}