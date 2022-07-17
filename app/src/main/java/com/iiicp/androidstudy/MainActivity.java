package com.iiicp.androidstudy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_textview);
        btn2 = findViewById(R.id.btn_button);
        btn3 = findViewById(R.id.btn_editText);
        btn4 = findViewById(R.id.btn_radioButton);
        btn5 = findViewById(R.id.btn_checkBox);
        btn6 = findViewById(R.id.btn_imageview);

        setListener();
    }

    private void setListener() {
        OnClick click = new OnClick();
        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
        btn5.setOnClickListener(click);
        btn6.setOnClickListener(click);
    }

    private class OnClick implements View.OnClickListener {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View v) {
            Intent i = null;
            switch (v.getId()) {
                case R.id.btn_textview:
                    i = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    i = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_editText:
                    i = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radioButton:
                    i = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkBox:
                    i = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    i = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
            }
            startActivity(i);
        }
    }
}