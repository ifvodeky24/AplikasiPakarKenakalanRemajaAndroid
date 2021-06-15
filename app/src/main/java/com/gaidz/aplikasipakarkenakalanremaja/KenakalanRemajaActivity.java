package com.gaidz.aplikasipakarkenakalanremaja;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class KenakalanRemajaActivity extends AppCompatActivity {
    private LinearLayout llNarkoba, llBalapLiar, llPencuri, llSeksBebas, llMerokok,
            llPerkelahian, llGengMotor, llMabuk, llBullying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenakalan_remaja);
        setTitle("Kenakalan Remaja");

        llNarkoba = findViewById(R.id.ll_narkoba);
        llBalapLiar = findViewById(R.id.ll_balap_liar);
        llPencuri = findViewById(R.id.ll_pencuri);
        llSeksBebas = findViewById(R.id.ll_seks_bebas);
        llMerokok = findViewById(R.id.ll_merokok);
        llPerkelahian = findViewById(R.id.ll_perkelahian_remaja);
        llGengMotor = findViewById(R.id.ll_geng_motor);
        llMabuk = findViewById(R.id.ll_mabuk_mabukan);
        llBullying = findViewById(R.id.ll_bullying);

        llNarkoba.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "0");
            startActivity(intent);
        });

        llBalapLiar.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "1");
            startActivity(intent);
        });

        llPencuri.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "2");
            startActivity(intent);
        });

        llSeksBebas.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "3");
            startActivity(intent);
        });

        llMerokok.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "4");
            startActivity(intent);
        });

        llPerkelahian.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "5");
            startActivity(intent);
        });

        llGengMotor.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "6");
            startActivity(intent);
        });

        llMabuk.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "7");
            startActivity(intent);
        });

        llBullying.setOnClickListener(view -> {
            Intent intent = new Intent(this, DetailKenakalanRemajaActivity.class);
            intent.putExtra(DetailKenakalanRemajaActivity.ID, "8");
            startActivity(intent);
        });
    }
}