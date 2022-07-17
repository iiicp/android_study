package com.iiicp.androidstudy.recyclerview;

import com.iiicp.androidstudy.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LinearRecyclerViewAdapter extends RecyclerView.Adapter<LinearRecyclerViewAdapter.LinearViewHolder> {
    private final Context mContext;
    private final OnItemClickListener mListener;
    LinearRecyclerViewAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }
    @NonNull
    @Override
    public LinearRecyclerViewAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.layout_recycler_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearRecyclerViewAdapter.LinearViewHolder holder, int position) {
        holder.mTextView.setText("我是recycleview的列表");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.OnClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    static class LinearViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface OnItemClickListener {
        void OnClick(int position);
    }
}
