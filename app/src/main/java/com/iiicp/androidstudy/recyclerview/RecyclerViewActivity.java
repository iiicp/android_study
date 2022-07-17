package com.iiicp.androidstudy.recyclerview;

import com.iiicp.androidstudy.R;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        Button btn = findViewById(R.id.btn_listview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
                startActivity(i);
            }
        });
    }
}