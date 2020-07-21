package com.example.moviesonex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

//public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
//    String[] mData;
//    LayoutInflater inflater;
//    View view;
//
//
//    public MyRecyclerViewAdapter(Context context, String[] mData) {
//        inflater = LayoutInflater.from(context);
//        this.mData = mData;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = inflater.inflate (R.layout.recyclerview_item,parent,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.tv.setText(mData[position]);
//    }
//
//    @Override
//    public int getItemCount() {
//        return mData.length;
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        TextView tv;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            tv = itemView.findViewById(R.id.image_view);
//
//        }
//    }
//}
//
//
//


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    int[] mData;
    LayoutInflater inflater;
    View view;


    public MyRecyclerViewAdapter(Context context, int[] mData) {
        inflater = LayoutInflater.from(context);
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate (R.layout.recyclerview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(mData[position]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);

        }
    }
}
