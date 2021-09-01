package com.hendro.recyclerviewsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.res.Configuration;
import android.os.Bundle;

import com.hendro.recyclerviewsederhana.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Teman> temanArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();

        setDataTeman();
        tampilkanRecyclerView();
    }

    private void tampilkanRecyclerView() {
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        RVAdapter rvAdapter = new RVAdapter(getApplicationContext(), temanArrayList);
        binding.recyclerView.setAdapter(rvAdapter);
    }

    private void setDataTeman(){
        temanArrayList.add(new Teman("Andi", "08220000000", "Jati Makmur"));
        temanArrayList.add(new Teman("Ishak", "08130000000", "Jati Waringin"));
        temanArrayList.add(new Teman("Yuni", "08220000000", "Pondok Gede"));
        temanArrayList.add(new Teman("Marshel", "08210000000", "Batu, Malang"));
        temanArrayList.add(new Teman("Kiki", "08120000000", "Depok"));
        temanArrayList.add(new Teman("Bambang", "08540000000", "Cibubur"));
        temanArrayList.add(new Teman("Baskoro", "08750000000", "Bogor"));
        temanArrayList.add(new Teman("Raisha", "08560000000", "Ciputat"));
        temanArrayList.add(new Teman("Ateng", "08120000000", "Tangerang Selatan"));
        temanArrayList.add(new Teman("Amanda", "08230000000", "Pasar Minggu"));
        temanArrayList.add(new Teman("Kukuh", "08570000000", "Pejaten"));
        temanArrayList.add(new Teman("Indri", "08770000000", "Bambu Apus"));
    }
}