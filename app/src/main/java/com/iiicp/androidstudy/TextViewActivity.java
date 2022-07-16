package com.iiicp.androidstudy;

import android.graphics.Paint;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        TextView mTv4 = findViewById(R.id.text_04);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTv4.getPaint().setAntiAlias(true);

        TextView mTv5 = findViewById(R.id.text_05);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        TextView mTv6 = findViewById(R.id.text_06);
        mTv6.setText(Html.fromHtml("<u>博学之，审视之，慎思之，明辨之</u>"));
    }
}