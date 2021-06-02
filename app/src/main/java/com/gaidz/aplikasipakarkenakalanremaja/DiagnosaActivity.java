package com.gaidz.aplikasipakarkenakalanremaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DiagnosaActivity extends AppCompatActivity {

    private CheckBox cbMataMerahPupilMengecil, cbMengalamiPerubahanPolaMakan, cbPenurunanBeratBadan;
    private CheckBox cbMengucapkanKataMembingungkan, cbMenjadiLebihTertutup, cbBerkurangnyaMinatTerhadapHalDisukai;
    private CheckBox cbTidakMemilikiMotivasi, cbMenarikDiriCemas, cbSeringBolosSekolah;
    private CheckBox cbMencuriAtauMenjualBarangYangAda, cbTakutTersingkirkanAtauTidakDianggap, cbInginMenyalurkanHobiMinatBakat;
    private CheckBox cbInginMendapatkanSensasiBalapLiar, cbBanyakMelihatTanyanganDiTelevisi, cbLebihMenurutiEgo;
    private CheckBox cbDiawaliDenganRasaIseng, cbAkibatImpitanEkonomi, cbTerbiasaMendapatkanUangBanyak;
    private CheckBox cbKurangnyaImanDanPendidikan, cbTidakMendapatkanPekerjaan, cbAdanyaKesempatan;
    private CheckBox cbMemilikiRasaInginTahuBesar, cbTidakMendapatkanPendidikanKesehatanReproduksi, cbKurangTanggapnyaKeluargaDanGuru;
    private CheckBox cbKurangnyaRasaTakutKepadaAllah, cbGigiKuningKarenaNikotin, cbKukuKotorKarenaNikotin;
    private CheckBox cbMataPedih, cbSeringBatukBatuk, cbMulutDanNafasBauRokok;
    private CheckBox cbTidakPekaTerhadapPerasaan, cbMemilikiPerasaanRendahDiri, cbEmosiTidakStabil;
    private CheckBox cbMudahFrustasi, cbRumahTanggaPenuhKekerasan, cbOrangTuaPosesif;
    private CheckBox cbMempunyaiHobiKebutan, cbKurangHarmonisnyaHubunganIndividu, cbOrangTuaTidakDapatMembangunKomunikasi;
    private CheckBox cbTerbiasaMenggunakanKekerasan, cbSeringMembolosSekolah, cbKetergantunganKepadaTemanSebaya;
    private CheckBox cbSeringBersamaTemanSebayaKeluar;
    private Button btnDiagnosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        setTitle("Diagnosa");

        btnDiagnosa = findViewById(R.id.btn_diagnosa);
        cbMataMerahPupilMengecil = findViewById(R.id.cb_mata_merah_pupil_mengecil);
        cbMengalamiPerubahanPolaMakan = findViewById(R.id.cb_mengalami_perubahan_pola_makan);
        cbPenurunanBeratBadan = findViewById(R.id.cb_penurunan_berat_badan);
        cbMengucapkanKataMembingungkan = findViewById(R.id.cb_mengucapkan_kata_yang_membingungkan);
        cbMenjadiLebihTertutup = findViewById(R.id.cb_menjadi_lebih_tertutup);
        cbBerkurangnyaMinatTerhadapHalDisukai = findViewById(R.id.cb_berkurangnya_minat_terhadap_hal_disukai);
        cbTidakMemilikiMotivasi = findViewById(R.id.cb_tidak_memiliki_motivasi);
        cbMenarikDiriCemas = findViewById(R.id.cb_menarik_diri_cemas);
        cbSeringBolosSekolah = findViewById(R.id.cb_sering_bolos_sekolah);
        cbMencuriAtauMenjualBarangYangAda = findViewById(R.id.cb_mencuri_atau_menjual_barang_yang_ada);
        cbTakutTersingkirkanAtauTidakDianggap = findViewById(R.id.cb_takut_tersingkirkan_atau_tidak_dianggap);
        cbInginMenyalurkanHobiMinatBakat = findViewById(R.id.cb_ingin_menyalurkan_hobi_minat_bakat);
        cbInginMendapatkanSensasiBalapLiar = findViewById(R.id.cb_ingin_mendapatkan_sensasi_balap_liar);
        cbBanyakMelihatTanyanganDiTelevisi = findViewById(R.id.cb_banyak_melihat_tanyangan_di_televisi);
        cbLebihMenurutiEgo = findViewById(R.id.cb_lebih_menuruti_ego);
        cbDiawaliDenganRasaIseng = findViewById(R.id.cb_diawali_dengan_rasa_iseng);
        cbAkibatImpitanEkonomi = findViewById(R.id.cb_akibat_impitan_ekonomi);
        cbTerbiasaMendapatkanUangBanyak = findViewById(R.id.cb_terbiasa_mendapatkan_uang_banyak);
        cbKurangnyaImanDanPendidikan = findViewById(R.id.cb_kurangnya_iman_dan_pendidikan);
        cbTidakMendapatkanPekerjaan = findViewById(R.id.cb_tidak_mendapatkan_pekerjaan);
        cbAdanyaKesempatan = findViewById(R.id.cb_adanya_kesempatan);
        cbMemilikiRasaInginTahuBesar = findViewById(R.id.cb_memiliki_rasa_ingin_tahu_besar);
        cbTidakMendapatkanPendidikanKesehatanReproduksi = findViewById(R.id.cb_tidak_mendapatkan_pendidikan_kesehatan_reproduksi);
        cbKurangTanggapnyaKeluargaDanGuru = findViewById(R.id.cb_kurang_tanggapnya_keluarga_dan_guru);
        cbKurangnyaRasaTakutKepadaAllah = findViewById(R.id.cb_kurangnya_rasa_takut_kepada_allah);
        cbGigiKuningKarenaNikotin = findViewById(R.id.cb_gigi_kuning_karena_nikotin);
        cbKukuKotorKarenaNikotin = findViewById(R.id.cb_kuku_kotor_karena_nikotin);
        cbMataPedih = findViewById(R.id.cb_mata_pedih);
        cbSeringBatukBatuk = findViewById(R.id.cb_sering_batuk_batuk);
        cbMulutDanNafasBauRokok = findViewById(R.id.cb_mulut_dan_nafas_bau_rokok);
        cbTidakPekaTerhadapPerasaan = findViewById(R.id.cb_tidak_peka_terhadap_perasaan);
        cbMemilikiPerasaanRendahDiri = findViewById(R.id.cb_memiliki_perasaan_rendah_diri);
        cbEmosiTidakStabil = findViewById(R.id.cb_emosi_tidak_stabil);
        cbMudahFrustasi = findViewById(R.id.cb_mudah_frustasi);
        cbRumahTanggaPenuhKekerasan = findViewById(R.id.cb_rumah_tangga_penuh_kekerasan);
        cbOrangTuaPosesif = findViewById(R.id.cb_orang_tua_posesif);
        cbMempunyaiHobiKebutan = findViewById(R.id.cb_mempunyai_hobi_kebutan);
        cbKurangHarmonisnyaHubunganIndividu = findViewById(R.id.cb_kurang_harmonisnya_hubungan_individu);
        cbOrangTuaTidakDapatMembangunKomunikasi = findViewById(R.id.cb_orang_tua_tidak_dapat_membangun_komunikasi);
        cbTerbiasaMenggunakanKekerasan = findViewById(R.id.cb_terbiasa_menggunakan_kekerasan);
        cbSeringMembolosSekolah = findViewById(R.id.cb_sering_membolos_sekolah);
        cbKetergantunganKepadaTemanSebaya = findViewById(R.id.cb_ketergantungan_kepada_teman_sebaya);
        cbSeringBersamaTemanSebayaKeluar = findViewById(R.id.cb_sering_bersama_teman_sebaya_keluar);

        btnDiagnosa.setOnClickListener(v -> {

            Intent intent = new Intent(this, HasilDiagnosaActivity.class);
//            intent.putExtra(DetailKenakalanRemajaActivity.ID, "0");
            startActivity(intent);
        });
    }
}