package com.iiicp.androidstudy.listview;

import com.bumptech.glide.Glide;
import com.iiicp.androidstudy.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListViewAdapter extends BaseAdapter {

    private final Context mContext;
    private final LayoutInflater mLayoutInflater;

    MyListViewAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private static class ViewHolder {
        public ImageView mIv;
        public TextView mTv1, mTv2, mTv3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_listview_item, null);
            holder = new ViewHolder();
            holder.mIv = convertView.findViewById(R.id.iv_0);
            holder.mTv1 = convertView.findViewById(R.id.tv_1);
            holder.mTv2 = convertView.findViewById(R.id.tv_2);
            holder.mTv3 = convertView.findViewById(R.id.tv_3);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mTv1.setText("这是标题");
        holder.mTv2.setText("这是时间111");
        holder.mTv3.setText("这是内容");
        Glide.with(mContext).load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png").into(holder.mIv);

        return convertView;
    }
}
