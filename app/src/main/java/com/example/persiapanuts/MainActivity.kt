package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.seputarcovid,"SICOVI","Seputar Covid-19","Virus Corona atau severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2) adalah virus yang menyerang sistem pernapasan. Penyakit karena infeksi virus ini disebut Covid-\n" +
                "19. Virus Corona bisa menyebabkan gangguan ringan pada sistem pernapasan, infeksi paru- paru yang berat, hingga kematian."))

        data?.add(DataModel(R.drawable.panduan,"SICOVI","Panduan Isolasi Mandiri", "\n" +
                "Protokol Isolasi Mandiri\n" +
                "Ada beberapa protokol isolasi mandiri yang bisa dilakukan di rumah yaitu:\n" +
                "1. Selalu memakai masker dan membuang masker bekas ditempat yang ditentukan\n" +
                "2. Jika sakit (ada gejala demam, flu dan batuk Maka tetap di rumah. \uF02AJangan pergi bekerja, sekolah, ke pasar atau ke ruang publik untuk mencegah penularan masyarakat.\n" +
                "3. Manfaatkan fasilitas telemedicine atau sosmed kesehatan hindari transportasi publik. Beritahu dokter dan perawat tentang keluhan dan gejala, serta riwayat bekerja ke daerah terjangkit atau kontak dengan pasien Covid-19. "))

        data?.add(DataModel(R.drawable.vaksinasi,"SICOVI","Vaksinasi Covid-19", "Layanan konsultasi ini dapat di konsultasikan melalui aplikasi ini, dengan menyampaikan keluhan anda di layanan konsultasi."))

        data?.add(DataModel(R.drawable.perilaku,"SICOVI","Panduan Perilaku Cegah Covid-19", "Informasi Rumah Sakit dapat di kunjungi dibeberapa rumah sakit di daerah anda, seperti : RS.Kardinah, RS.Mitra Keluarga, RS.Mitra Siaga, RSI PKU Muhammadiyah Singkil, RSI Harapan Anda."))

        data?.add(DataModel(R.drawable.kriteriaa,"SICOVI","Pelayanan Kriteria Individu", "Informasi obat yang tersedia : Cefixime, Antalgin, Parasetamol, Amoxilin, Sandimun, Komik, Antasida, Tb 4 Merah, Trmadol, Amitriprilyn 25, Neuprobion Putih."))

        data?.add(DataModel(R.drawable.tahapann,"SICOVI","Tahapan Seputar Covid-19", "Informasi Gawat Darurat dapat anda peroleh dengan No.Telp : 0883850083"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

    private fun DataModel(gambar: Int, lokasi: String, nama: String) {

    }
}