package com.mgbachi_ugo.javad;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InfoRecyclerAdapter extends RecyclerView.Adapter<InfoRecyclerAdapter.ViewHolder> {


    ArrayList<String> mList;

    ArrayList<String> mInfo;



    public InfoRecyclerAdapter(ArrayList<String> list, ArrayList<String> info) {
        mList = list;
        mInfo = info;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_setup, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.mDetailText.setText(mList.get(position));
        holder.mInfoText.setText(mInfo.get(position));


    }

    @Override
    public int getItemCount() {
        return mList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView mDetailText;
        public final TextView mInfoText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mDetailText = itemView.findViewById(R.id.content_textView);
            mInfoText = itemView.findViewById(R.id.info_textView);
        }
    }
}
