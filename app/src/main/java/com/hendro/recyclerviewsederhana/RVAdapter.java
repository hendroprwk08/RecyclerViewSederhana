package com.hendro.recyclerviewsederhana;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hendro.recyclerviewsederhana.databinding.ItemRecyclerViewBinding;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.GridViewHolder> {
    private ArrayList<Teman> temanArrayList;
    private Context context;
    private ItemRecyclerViewBinding itemRecyclerViewBinding;

    public RVAdapter(Context context, ArrayList<Teman> temanArrayList) {
        this.context = context;
        this.temanArrayList = temanArrayList;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemRecyclerViewBinding = ItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new GridViewHolder(itemRecyclerViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        final String
                nama = temanArrayList.get(position).getNama(),
                alamat = temanArrayList.get(position).getAlamat(),
                telepon = temanArrayList.get(position).getTelepon();

        itemRecyclerViewBinding.tvNama.setText(nama);
        itemRecyclerViewBinding.tvAlamat.setText(alamat);
        itemRecyclerViewBinding.tvTelepon.setText(telepon);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, nama, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return temanArrayList.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ItemRecyclerViewBinding itemRecyclerViewBinding;

        public GridViewHolder(@NonNull ItemRecyclerViewBinding binding) {
            super(binding.getRoot());
            itemRecyclerViewBinding = binding;
        }
    }
}
