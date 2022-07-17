package com.iiicp.androidstudy.gridview;

import com.bumptech.glide.Glide;
import com.iiicp.androidstudy.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    GridViewAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 20;
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
        public TextView mTv;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_grid_item, null);
            holder = new ViewHolder();
            holder.mIv = convertView.findViewById(R.id.iv);
            holder.mTv = convertView.findViewById(R.id.tv);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mTv.setText("大树");
        Glide.with(mContext).load("https://img2.baidu.com/it/u=1579925377,1914989861&fm=253&fmt=auto&app=138&f=JPEG?w=750&h=500").into(holder.mIv);
        return convertView;
    }
}
