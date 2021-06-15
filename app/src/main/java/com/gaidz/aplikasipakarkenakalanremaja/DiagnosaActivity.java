package com.gaidz.aplikasipakarkenakalanremaja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

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

//            if (cbMataMerahPupilMengecil.isChecked() && cbMengalamiPerubahanPolaMakan.isChecked() && cbPenurunanBeratBadan.isChecked() && cbMengucapkanKataMembingungkan.isChecked() && cbMenjadiLebihTertutup.isChecked()
//                    && cbBerkurangnyaMinatTerhadapHalDisukai.isChecked() && cbTidakMemilikiMotivasi.isChecked() && cbMenarikDiriCemas.isChecked() && cbSeringBolosSekolah.isChecked() && cbMencuriAtauMenjualBarangYangAda.isChecked()) {
//                Toast.makeText(this, "Narkoba", Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(this, HasilDiagnosaActivity.class);
////            intent.putExtra(DetailKenakalanRemajaActivity.ID, "0");
//                startActivity(intent);
//            } else if (cbTakutTersingkirkanAtauTidakDianggap.isChecked() && cbInginMenyalurkanHobiMinatBakat.isChecked() && cbInginMendapatkanSensasiBalapLiar.isChecked() && cbBanyakMelihatTanyanganDiTelevisi.isChecked()
//                    && cbLebihMenurutiEgo.isChecked() && cbDiawaliDenganRasaIseng.isChecked()) {
//
//            } else if (cbAkibatImpitanEkonomi.isChecked() && cbTerbiasaMendapatkanUangBanyak.isChecked() && cbKurangnyaImanDanPendidikan.isChecked() && cbTidakMendapatkanPekerjaan.isChecked() && cbAdanyaKesempatan.isChecked()) {
//
//            } else if (cbMemilikiRasaInginTahuBesar.isChecked() && cbTidakMendapatkanPendidikanKesehatanReproduksi.isChecked() && cbKurangTanggapnyaKeluargaDanGuru.isChecked() && cbKurangnyaRasaTakutKepadaAllah.isChecked()
//                    && cbAdanyaKesempatan.isChecked()) {
//
//            } else if (cbGigiKuningKarenaNikotin.isChecked() && cbKukuKotorKarenaNikotin.isChecked() && cbMataPedih.isChecked() && cbSeringBatukBatuk.isChecked() && cbMulutDanNafasBauRokok.isChecked()) {
//
//            } else if (cbTidakPekaTerhadapPerasaan.isChecked() && cbMemilikiPerasaanRendahDiri.isChecked() && cbEmosiTidakStabil.isChecked() && cbMudahFrustasi.isChecked() && cbRumahTanggaPenuhKekerasan.isChecked()
//                    && cbOrangTuaPosesif.isChecked()) {
//
//            } else if (cbMempunyaiHobiKebutan.isChecked() && cbKurangHarmonisnyaHubunganIndividu.isChecked() && cbOrangTuaTidakDapatMembangunKomunikasi.isChecked() && cbTerbiasaMenggunakanKekerasan.isChecked() && cbSeringMembolosSekolah.isChecked()
//                    && cbKetergantunganKepadaTemanSebaya.isChecked() && cbSeringBersamaTemanSebayaKeluar.isChecked()) {
//
//            }
        });
    }

    public void onCheckboxClicked(View view) {

    }
}