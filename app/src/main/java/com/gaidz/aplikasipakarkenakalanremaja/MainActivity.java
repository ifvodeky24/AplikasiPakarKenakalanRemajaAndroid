


package com.gaidz.aplikasipakarkenakalanremaja;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private LinearLayout llTentang, llDiagnosaKenakalanRemaja, llKenakalanRemaja, llBantuan;
    private SliderView sliderView;
    private ArrayList<SliderItem> imageSlider = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Aplikasi Pakar Kenakalan Remaja");

        llKenakalanRemaja = findViewById(R.id.ll_kenakalan_remaja);
        llDiagnosaKenakalanRemaja = findViewById(R.id.ll_diagnosa_kenakalan_remaja);
        llBantuan = findViewById(R.id.ll_bantuan);
        llTentang = findViewById(R.id.ll_tentang);
        sliderView = findViewById(R.id.imageSlider);

        imageSlider.addAll(getListImage());

        SliderAdapterExample adapter = new SliderAdapterExample(this, imageSlider);
        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        llKenakalanRemaja.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, KenakalanRemajaActivity.class);
            startActivity(intent);
        });

        llDiagnosaKenakalanRemaja.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DiagnosaActivity.class);
            startActivity(intent);
        });

        llBantuan.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BantuanActivity.class);
            startActivity(intent);
        });

        llTentang.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TentangActivity.class);
            startActivity(intent);
        });
    }

    public ArrayList<SliderItem> getListImage() {
        String[] imageUrl = getResources().getStringArray(R.array.image_url);

        ArrayList<SliderItem> listImage = new ArrayList<>();
        for (String s : imageUrl) {
            SliderItem image = new SliderItem();
            image.setImageUrl(s);
            listImage.add(image);
        }
        return listImage;
    }
}