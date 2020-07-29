package com.aryotech.kajianyuk.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aryotech.kajianyuk.Model.Pamflet;
import com.aryotech.kajianyuk.Model.PamfletDetail;
import com.aryotech.kajianyuk.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPamfletAdapter extends RecyclerView.Adapter<ListPamfletAdapter.ListViewHolder> {

    private ArrayList<Pamflet> listPamflet;
    private Context context;

    public ListPamfletAdapter(ArrayList<Pamflet> listPamflet) {
        this.listPamflet = listPamflet;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_pamflet, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {

        Pamflet pamflet = listPamflet.get(position);
        Glide.with(holder.itemView.getContext())
                .load(pamflet.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(pamflet.getName());
        holder.tvDetail.setText(pamflet.getDetail());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context, PamfletDetail.class);
                intent.putExtra("Key",listPamflet.get(position));
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listPamflet.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPhoto, imgDetail;
        TextView tvName, tvDetail, tvDate, tvDesc;
        LinearLayout linearLayout;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_pamflet);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvDesc = itemView.findViewById(R.id.tv_detail_desc);
            imgDetail = itemView.findViewById(R.id.img_detail_pamflet);
            linearLayout = itemView.findViewById(R.id.linear_layout);
        }
    }
}
