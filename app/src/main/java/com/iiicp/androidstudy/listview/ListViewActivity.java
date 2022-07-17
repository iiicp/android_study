package com.iiicp.androidstudy.listview;
import com.iiicp.androidstudy.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class ListViewActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView mLV = findViewById(R.id.lv_1);
        mLV.setAdapter(new MyListViewAdapter(ListViewActivity.this));

        mLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "点击了 " + position, Toast.LENGTH_SHORT).show();
            }
        });

        mLV.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position,
                                           long id) {
                Toast.makeText(ListViewActivity.this, "长按了 " + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
