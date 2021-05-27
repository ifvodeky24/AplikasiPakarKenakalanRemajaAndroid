package com.gaidz.aplikasipakarkenakalanremaja;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnTentang, btnDiagnosaKenakalanRemaja, btnKenakalanRemaja, btnSolusi, btnTanyaPsikologi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKenakalanRemaja = findViewById(R.id.btn_kenakalan_remaja);
        btnDiagnosaKenakalanRemaja = findViewById(R.id.btn_diagnosa_kenakalan);
        btnSolusi = findViewById(R.id.btn_solusi);
        btnTanyaPsikologi = findViewById(R.id.btn_tanya_psikologi);
        btnTentang = findViewById(R.id.btn_tentang);

        btnKenakalanRemaja.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, KenakalanRemajaActivity.class);
            startActivity(intent);
        });

        btnDiagnosaKenakalanRemaja.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, DiagnosaActivity.class);
                startActivity(intent);
        });

        btnSolusi.setOnClickListener(view -> {
//                Intent intent = new Intent(MainActivity.this, SolusiActivity2.class);
//                startActivity(intent);
        });

        btnTanyaPsikologi.setOnClickListener(view -> {
//                Intent intent = new Intent(MainActivity.this, KenakalanRemaja.class);
//                startActivity(intent);
        });

        btnTentang.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(intent);
        });
    }
}