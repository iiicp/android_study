package com.iiicp.androidstudy.recyclerview;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iiicp.androidstudy.R;

public class LinearRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_list_view);

        RecyclerView rc = findViewById(R.id.rc_linear);
        rc.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        rc.setAdapter(new LinearRecyclerViewAdapter(LinearRecyclerViewActivity.this,
                new LinearRecyclerViewAdapter.OnItemClickListener() {
                    @Override
                    public void OnClick(int position) {
                        Toast.makeText(LinearRecyclerViewActivity.this, "点击了 " + position,
                                Toast.LENGTH_SHORT).show();
                    }
                }));
    }
}