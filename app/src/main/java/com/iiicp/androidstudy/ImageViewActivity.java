package com.iiicp.androidstudy;

import com.bumptech.glide.Glide;

import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView mIV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIV = findViewById(R.id.iv_04);
        Glide.with(this).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fcdn.duitang"
                + ".com%2Fuploads%2Fitem%2F201511%2F07%2F20151107235818_xuZvd"
                + ".jpeg&refer=http%3A%2F%2Fcdn.duitang.com&app=2002&size=f9999,"
                + "10000&q=a80&n=0&g=0n&fmt=auto?sec=1660628085&t"
                + "=ef8654cc8965c5f8a12377ae9f292476").centerCrop().into(mIV);
    }
}