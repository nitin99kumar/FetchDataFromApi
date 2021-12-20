package com.example.newdatafetchfromapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewHolder> {

    private static Context context;
    List<DataFile> dataList;

    public MainAdapter(Context context, List<DataFile> data) {
        this.context = context;
        this.dataList = data;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_layout,parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DataFile dataa = dataList.get(position);

//        holder.setImgView(dataa.getUrlToImage());
        holder.setTitleView(dataa.getTitle());
        holder.setDesc(dataa.getDescription());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

//        ImageView imgView;
        TextView titleView;
        TextView descView;
        View view;

        public viewHolder(@NonNull View itemView) {

            super(itemView);
            view = itemView;
        }

//        public void setImgView(String url) {
//            imgView = view.findViewById(R.id.imageView2);
//            Glide.with(context).load(url).into(imgView);
//        }

        public void setTitleView(String title) {
            titleView = view.findViewById(R.id.title);
            titleView.setText(title);
        }

        public void setDesc(String desc) {
            descView = view.findViewById(R.id.Title_description);
            descView.setText(desc);
        }




    }

}
