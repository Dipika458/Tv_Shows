package com.blucore.searchtvshows.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blucore.searchtvshows.R;
import com.blucore.searchtvshows.model.DataModel;
import com.bumptech.glide.Glide;

import java.util.List;

public class ShowsListAdapter extends RecyclerView.Adapter<ShowsListAdapter.MyViewHolder> {

    private final List<DataModel.SearchBean> data;
    private Context context;


    public ShowsListAdapter(Context context, List<DataModel.SearchBean> data) {
        this.data=data;
        this.context = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.adapter_show_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(data.get(position).getPoster()).into(holder.image);
        holder.tvName.setText(data.get(position).getTitle());
        holder.tvYear.setText(data.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView tvName,tvYear;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.ivImage);
            tvName=itemView.findViewById(R.id.tvName);
            tvYear=itemView.findViewById(R.id.tvYear);
        }
    }
}


