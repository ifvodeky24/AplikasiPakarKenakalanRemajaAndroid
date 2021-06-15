package com.gaidz.aplikasipakarkenakalanremaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilDiagnosaActivity extends AppCompatActivity {

    public static final String CODE = "code";

    private String code;

    TextView tvHasil;
    Button btnTujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_diagnosa);
        setTitle("Hasil Diagnosa");

        tvHasil = findViewById(R.id.tv_hasil);
        btnTujuan = findViewById(R.id.btn_tujuan);

        code = getIntent().getStringExtra(CODE);

        switch (code) {
            case "0":
                btnTujuan.setText("Narkoba");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "0");
                    startActivity(intent);
                });
                break;
            case "1":
                btnTujuan.setText("Balap Liar");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "1");
                    startActivity(intent);
                });
                break;
            case "2":
                btnTujuan.setText("Pencuri");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "2");
                    startActivity(intent);
                });
                break;
            case "3":
                btnTujuan.setText("Seks Bebas");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "3");
                    startActivity(intent);
                });
                break;
            case "4":
                btnTujuan.setText("Merokok");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "4");
                    startActivity(intent);
                });
                break;
            case "5":
                btnTujuan.setText("Perkelahian Remaja");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "5");
                    startActivity(intent);
                });
                break;
            case "6":
                btnTujuan.setText("Geng Motor");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "6");
                    startActivity(intent);
                });
                break;
            case "7":
                btnTujuan.setText("Mabuk-Mabukan");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "7");
                    startActivity(intent);
                });
                break;
            case "8":
                btnTujuan.setText("Bullying");
                btnTujuan.setOnClickListener(v -> {
                    Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                    intent.putExtra(DetailKenakalanRemajaActivity.ID, "8");
                    startActivity(intent);
                });
                break;
            case "9":
                tvHasil.setVisibility(View.VISIBLE);
                btnTujuan.setVisibility(View.GONE);
                break;
        }
    }
}