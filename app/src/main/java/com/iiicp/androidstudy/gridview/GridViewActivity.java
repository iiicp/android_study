package com.iiicp.androidstudy.gridview;

import com.iiicp.androidstudy.R;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView mGv = findViewById(R.id.gv_1);
        mGv.setAdapter(new GridViewAdapter(GridViewActivity.this));

        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this, "点击了 "+position, Toast.LENGTH_SHORT).show();
            }
        });

        mGv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position,
                                           long id) {
                Toast.makeText(GridViewActivity.this, "长按了 "+position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
