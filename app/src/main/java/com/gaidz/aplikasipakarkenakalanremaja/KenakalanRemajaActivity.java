package com.gaidz.aplikasipakarkenakalanremaja;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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
        setTitle("Kenakalan Remaja");

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
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "0");
            startActivity(intent);
        });

        btnBalapLiar.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "1");
            startActivity(intent);
        });

        btnPencuri.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "2");
            startActivity(intent);
        });

        btnSeksBebas.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "3");
            startActivity(intent);
        });

        btnMerokok.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "4");
            startActivity(intent);
        });

        btnPerkelahian.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "5");
            startActivity(intent);
        });

        btnGengMotor.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "6");
            startActivity(intent);
        });

        btnMabuk.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "7");
            startActivity(intent);
        });

        btnBullying.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "8");
            startActivity(intent);
        });
    }
}