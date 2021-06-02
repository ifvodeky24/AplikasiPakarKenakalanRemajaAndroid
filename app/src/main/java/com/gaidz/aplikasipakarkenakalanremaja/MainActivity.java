package com.gaidz.aplikasipakarkenakalanremaja;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnTentang, btnDiagnosaKenakalanRemaja, btnKenakalanRemaja, btnBantuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Aplikasi Pakar Kenakalan Remaja");

        btnKenakalanRemaja = findViewById(R.id.btn_kenakalan_remaja);
        btnDiagnosaKenakalanRemaja = findViewById(R.id.btn_diagnosa_kenakalan);
        btnBantuan = findViewById(R.id.btn_bantuan);
        btnTentang = findViewById(R.id.btn_tentang);

        btnKenakalanRemaja.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, KenakalanRemajaActivity.class);
            startActivity(intent);
        });

        btnDiagnosaKenakalanRemaja.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DiagnosaActivity.class);
            startActivity(intent);
        });

        btnBantuan.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BantuanActivity.class);
            startActivity(intent);
        });

        btnTentang.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TentangActivity.class);
            startActivity(intent);
        });
    }
}