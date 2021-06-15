package com.gaidz.aplikasipakarkenakalanremaja;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DiagnosaActivity extends AppCompatActivity {

    private CheckBox cbMataMerahPupilMengecil, cbMengucapkanKataMembingungkan, cbMenjadiLebihTertutup,
            cbTidakMemilikiMotivasi, cbMencuriAtauMenjualBarangYangAda, cbTakutTersingkirkan,
            cbInginMenyalurkanHobi, cbMeniruTayanganTelevisi, cbLebihMenurutiEgo,
            cbAkibatImpitanEkonomi, cbTerbiasaMendapatkanUangBanyak, cbKurangnyaImanDanPendidikan,
            cbTidakMendapatkanPekerjaan, cbAdanyaKesempatan, cbMempunyaiRasaInginTahuBesar,
            cbKurangTanggapnyaKeluargaDanGuru, cbKurangnyaRasaTakutKepadaAllah, cbGigiKuningKarenaNikotin,
            cbLidahTerasaGetir, cbSeringBatukBatuk, cbMulutDanNafasBauRokok, cbTidakPekaTerhadapPerasaan,
            cbMemilikiPerasaanRendahDiri, cbEmosilabil, cbRumahTanggaPenuhKekerasan,
            cbMempunyaiHobiKebutan, cbKurangHarmonisnyaHubunganDenganLingkungan,
            cbTerbiasaMenggunakanKekerasan, cbSeringMembolosSekolah, cbSuasanaHatiSelaluBerubah,
            cbMataTerlihatSayuDanMerah, cbTidakLagiTertarikMenyalurkanHobi, cbMenjadiMalasDalamPenampilan,
            cbBertemanDenganOrangDicurigai, cbSelaluInginBerkuasa, cbMudahMarahDanTidakMerasaBersalah,
            cbTidakMemilikiEmpati;
    private Button btnDiagnosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        setTitle("Diagnosa");

        btnDiagnosa = findViewById(R.id.btn_diagnosa);
        cbMataMerahPupilMengecil = findViewById(R.id.cb_mata_merah_pupil_mengecil);
        cbMengucapkanKataMembingungkan = findViewById(R.id.cb_mengucapkan_kata_yang_membingungkan);
        cbMenjadiLebihTertutup = findViewById(R.id.cb_menjadi_lebih_tertutup);
        cbTidakMemilikiMotivasi = findViewById(R.id.cb_tidak_memiliki_motivasi);
        cbMencuriAtauMenjualBarangYangAda = findViewById(R.id.cb_mencuri_atau_menjual_barang_yang_ada);
        cbTakutTersingkirkan = findViewById(R.id.cb_takut_tersingkirkan);
        cbInginMenyalurkanHobi = findViewById(R.id.cb_ingin_menyalurkan_hobi);
        cbMeniruTayanganTelevisi = findViewById(R.id.cb_meniru_tayangan_televisi);
        cbLebihMenurutiEgo = findViewById(R.id.cb_lebih_menuruti_ego);
        cbAkibatImpitanEkonomi = findViewById(R.id.cb_akibat_impitan_ekonomi);
        cbTerbiasaMendapatkanUangBanyak = findViewById(R.id.cb_terbiasa_mendapatkan_uang_banyak);
        cbKurangnyaImanDanPendidikan = findViewById(R.id.cb_kurangnya_iman_dan_pendidikan);
        cbTidakMendapatkanPekerjaan = findViewById(R.id.cb_tidak_mendapatkan_pekerjaan);
        cbMempunyaiRasaInginTahuBesar = findViewById(R.id.cb_mempunyai_rasa_ingin_tahu_besar);
        cbKurangTanggapnyaKeluargaDanGuru = findViewById(R.id.cb_kurang_tanggapnya_keluarga_dan_guru);
        cbKurangnyaRasaTakutKepadaAllah = findViewById(R.id.cb_kurangnya_rasa_takut_kepada_allah);
        cbAdanyaKesempatan = findViewById(R.id.cb_adanya_kesempatan);
        cbGigiKuningKarenaNikotin = findViewById(R.id.cb_gigi_kuning_karena_nikotin);
        cbSeringBatukBatuk = findViewById(R.id.cb_sering_batuk_batuk);
        cbMulutDanNafasBauRokok = findViewById(R.id.cb_mulut_dan_nafas_bau_rokok);
        cbLidahTerasaGetir = findViewById(R.id.cb_lidah_terasa_getir);
        cbTidakPekaTerhadapPerasaan = findViewById(R.id.cb_tidak_peka_terhadap_perasaan);
        cbMemilikiPerasaanRendahDiri = findViewById(R.id.cb_memiliki_perasaan_rendah_diri);
        cbEmosilabil = findViewById(R.id.cb_emosi_labil_dan_mudah_frustasi);
        cbRumahTanggaPenuhKekerasan = findViewById(R.id.cb_rumah_tangga_penuh_kekerasan);
        cbMempunyaiHobiKebutan = findViewById(R.id.cb_mempunyai_hobi_kebutan);
        cbKurangHarmonisnyaHubunganDenganLingkungan = findViewById(R.id.cb_kurang_harmonisnya_hubungan_dengan_lingkungan);
        cbTerbiasaMenggunakanKekerasan = findViewById(R.id.cb_terbiasa_menggunakan_kekerasan);
        cbSeringMembolosSekolah = findViewById(R.id.cb_sering_membolos_sekolah);
        cbSuasanaHatiSelaluBerubah = findViewById(R.id.cb_suasana_hati_selalu_berubah);
        cbMataTerlihatSayuDanMerah = findViewById(R.id.cb_mata_terlihat_sayu_dan_merah);
        cbTidakLagiTertarikMenyalurkanHobi = findViewById(R.id.cb_tidak_lagi_tertarik_menyalurkan_hobi);
        cbMenjadiMalasDalamPenampilan = findViewById(R.id.cb_menjadi_malas_dalam_penampilan);
        cbBertemanDenganOrangDicurigai = findViewById(R.id.cb_berteman_dengan_orang_dicurigai);
        cbSelaluInginBerkuasa = findViewById(R.id.cb_selalu_ingin_berkuasa);
        cbMudahMarahDanTidakMerasaBersalah = findViewById(R.id.cb_mudah_marah_dan_tidak_merasa_bersalah);
        cbTidakMemilikiEmpati = findViewById(R.id.cb_tidak_memiliki_empati);

        btnDiagnosa.setOnClickListener(v -> {
            if (cbMataMerahPupilMengecil.isChecked() && cbMengucapkanKataMembingungkan.isChecked() && cbMenjadiLebihTertutup.isChecked() && cbTidakMemilikiMotivasi.isChecked() && cbMencuriAtauMenjualBarangYangAda.isChecked()) {
                Toast.makeText(this, "Narkoba", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "0");
                startActivity(intent);
            } else if (cbTakutTersingkirkan.isChecked() && cbInginMenyalurkanHobi.isChecked() && cbMeniruTayanganTelevisi.isChecked() && cbLebihMenurutiEgo.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "1");
                startActivity(intent);
            } else if (cbAkibatImpitanEkonomi.isChecked() && cbTerbiasaMendapatkanUangBanyak.isChecked() && cbKurangnyaImanDanPendidikan.isChecked() && cbTidakMendapatkanPekerjaan.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "2");
                startActivity(intent);
            } else if (cbMempunyaiRasaInginTahuBesar.isChecked() && cbKurangnyaRasaTakutKepadaAllah.isChecked() && cbKurangTanggapnyaKeluargaDanGuru.isChecked() && cbKurangnyaRasaTakutKepadaAllah.isChecked()
                    && cbAdanyaKesempatan.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "3");
                startActivity(intent);
            } else if (cbGigiKuningKarenaNikotin.isChecked() && cbSeringBatukBatuk.isChecked() && cbMulutDanNafasBauRokok.isChecked() && cbLidahTerasaGetir.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "4");
                startActivity(intent);
            } else if (cbTidakPekaTerhadapPerasaan.isChecked() && cbMemilikiPerasaanRendahDiri.isChecked() && cbEmosilabil.isChecked() && cbRumahTanggaPenuhKekerasan.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "5");
                startActivity(intent);
            } else if (cbMempunyaiHobiKebutan.isChecked() && cbKurangHarmonisnyaHubunganDenganLingkungan.isChecked() && cbTerbiasaMenggunakanKekerasan.isChecked() && cbSeringMembolosSekolah.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "6");
                startActivity(intent);
            } else if (cbSuasanaHatiSelaluBerubah.isChecked() && cbMataTerlihatSayuDanMerah.isChecked() && cbTidakLagiTertarikMenyalurkanHobi.isChecked()
                    && cbMenjadiMalasDalamPenampilan.isChecked() && cbBertemanDenganOrangDicurigai.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "7");
                startActivity(intent);
            } else if (cbSelaluInginBerkuasa.isChecked() && cbMudahMarahDanTidakMerasaBersalah.isChecked() && cbTidakMemilikiEmpati.isChecked()) {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "8");
                startActivity(intent);
            } else {
                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
                intent.putExtra(HasilDiagnosaActivity.CODE, "9");
                startActivity(intent);
            }
        });
    }

    public void onCheckboxClicked(View view) {

    }
}