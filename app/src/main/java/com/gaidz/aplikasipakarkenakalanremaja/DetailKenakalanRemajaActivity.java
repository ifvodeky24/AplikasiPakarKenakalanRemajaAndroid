package com.gaidz.aplikasipakarkenakalanremaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailKenakalanRemajaActivity extends AppCompatActivity {
    private ImageView ivImage;
    private TextView tvTitle;
    private TextView tvDescription, tvDefinition;
    private Button btnSolusi;

    private ArrayList<DataKenakalanRemaja> dataKenakalanRemajaArrayList = new ArrayList<>();

    public static final String ID = "id";
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kenakalan_remaja);
        setTitle("Detail Kenakalan Remaja");

        ivImage = findViewById(R.id.iv_image);
        tvTitle = findViewById(R.id.tv_title);
        tvDescription = findViewById(R.id.tv_description);
        btnSolusi = findViewById(R.id.btn_solusi);
        tvDefinition = findViewById(R.id.tv_definition);

        id = getIntent().getStringExtra(ID);

        dataKenakalanRemajaArrayList.addAll(getListDataKenakalan());

        System.out.println("cekk"+ dataKenakalanRemajaArrayList.get(0).getName());

        tvTitle.setText(dataKenakalanRemajaArrayList.get(Integer.parseInt(id)).getName());
        tvDescription.setText(dataKenakalanRemajaArrayList.get(Integer.parseInt(id)).getDescription());
        tvDefinition.setText(dataKenakalanRemajaArrayList.get(Integer.parseInt(id)).getDefinition());
        Glide.with(this)
                .asBitmap()
                .load(dataKenakalanRemajaArrayList.get(Integer.parseInt(id)).getImage())
                .into(ivImage);

        btnSolusi.setOnClickListener(v -> {
            startActivity(new Intent(this, SolusiActivity.class));
        });
    }

    public ArrayList<DataKenakalanRemaja> getListDataKenakalan() {
        String[] dataId = getResources().getStringArray(R.array.data_id);
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        String[] data_image = getResources().getStringArray(R.array.data_image);
        String[] data_pengertian = getResources().getStringArray(R.array.data_pengertian);

        ArrayList<DataKenakalanRemaja> listDataKenakalan = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            DataKenakalanRemaja hero = new DataKenakalanRemaja();
            hero.setId(dataId[i]);
            hero.setName(dataName[i]);
            hero.setDescription(dataDescription[i]);
            hero.setImage(data_image[i]);
            hero.setDefinition(data_pengertian[i]);
            listDataKenakalan.add(hero);
        }
        return listDataKenakalan;
    }
}