package com.gaidz.aplikasipakarkenakalanremaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KenakalanRemajaActivity extends AppCompatActivity {
    private Button btnNarkoba;
    private Button btnBalapLiar;
    private Button btnPencuri;
    private Button btnSeksBebas;
    private Button btnMerokok;
    private Button btnPerkelahian;
    private Button btnGengMotor;
    private Button btnMabuk;
    private Button btnBullying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenakalan_remaja);

        btnNarkoba = findViewById(R.id.btn_narkoba);
        btnBalapLiar = findViewById(R.id.btn_balap_liar);
        btnPencuri = findViewById(R.id.btn_pencuri);
        btnSeksBebas = findViewById(R.id.btn_seks_bebas);
        btnMerokok = findViewById(R.id.btn_merokok);
        btnPerkelahian = findViewById(R.id.btn_perkelahian_remaja);
        btnGengMotor = findViewById(R.id.btn_geng_motor);
        btnMabuk = findViewById(R.id.btn_mabuk_mabukan);
        btnBullying = findViewById(R.id.btn_bullying);

        btnNarkoba.setOnClickListener(view -> {
                Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
                startActivity(intent);
        });

        btnBalapLiar.setOnClickListener(view -> {

        });

        btnPencuri.setOnClickListener(view -> {

        });

        btnSeksBebas.setOnClickListener(view -> {

        });

        btnMerokok.setOnClickListener(view -> {

        });

        btnPerkelahian.setOnClickListener(view -> {

        });

        btnGengMotor.setOnClickListener(view -> {

        });

        btnMabuk.setOnClickListener(view -> {

        });

        btnBullying.setOnClickListener(view -> {

        });
    }
}