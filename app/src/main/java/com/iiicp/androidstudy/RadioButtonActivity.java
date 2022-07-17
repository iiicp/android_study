package com.iiicp.androidstudy;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        // 给RadioGroup进行加事件
        RadioGroup btn = findViewById(R.id.rg_1);
        btn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton btn = group.findViewById(checkedId);
                Toast.makeText(RadioButtonActivity.this, btn.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}