package com.desy.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity() {

    private var title: String = ""


    companion object {
        const val EXTRA_NAMA_KAMERA = "EXTRA_NAMA_KAMERA"
        const val EXTRA_PHOTO = "EXTRA_PHOTO"
        const val EXTRA_TYPE_CAMERA = "EXTRA_TYPE_KAMERA"
        const val EXTRA_HARGA = "EXTRA_HARGA"
        const val EXTRA_DETAIL1 = "EXTRA_DETAIL1"
        const val EXTRA_DETAIL2 = "EXTRA_DETAIL2"
        const val EXTRA_DETAIL3 = "EXTRA_DETAIL3"
        const val EXTRA_DETAIL4 = "EXTRA_DETAIL4"
        const val EXTRA_DETAIL5 = "EXTRA_DETAIL5"
        const val EXTRA_DETAIL6 = "EXTRA_DETAIL6"
        const val EXTRA_DETAIL7 = "EXTRA_DETAIL7"
        const val EXTRA_DETAIL8 = "EXTRA_DETAIL8"
        const val EXTRA_DETAIL9 = "EXTRA_DETAIL9"
        const val EXTRA_DETAIL10 = "EXTRA_DETAIL10"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val tvDataRecived1: TextView = findViewById(R.id.tv_nama_kamera)
        val tvDataReceived2= findViewById<ImageView>(R.id.img_item_photo)
        val tvDataRecived3: TextView = findViewById(R.id.tv_type_camera)
        val tvDataRecived4: TextView = findViewById(R.id.tv_harga)
        val tvDataRecived5: TextView = findViewById(R.id.tv_detail1)
        val tvDataRecived6: TextView = findViewById(R.id.tv_detail2)
        val tvDataRecived7: TextView = findViewById(R.id.tv_detail3)
        val tvDataRecived8: TextView = findViewById(R.id.tv_detail4)
        val tvDataRecived9: TextView = findViewById(R.id.tv_detail5)
        val tvDataRecived10: TextView = findViewById(R.id.tv_detail6)
        val tvDataRecived11: TextView = findViewById(R.id.tv_detail7)
        val tvDataRecived12: TextView = findViewById(R.id.tv_detail8)
        val tvDataRecived13: TextView = findViewById(R.id.tv_detail9)
        val tvDataRecived14: TextView = findViewById(R.id.tv_detail10)


        val nama = intent.getStringExtra(EXTRA_NAMA_KAMERA)
        val photo = intent.getIntExtra(EXTRA_PHOTO,0)
        val typeCamera = intent.getStringExtra(EXTRA_TYPE_CAMERA)
        val harga = intent.getStringExtra(EXTRA_HARGA)
        val detail1 = intent.getStringExtra(EXTRA_DETAIL1)
        val detail2 = intent.getStringExtra(EXTRA_DETAIL2)
        val detail3 = intent.getStringExtra(EXTRA_DETAIL3)
        val detail4 = intent.getStringExtra(EXTRA_DETAIL4)
        val detail5 = intent.getStringExtra(EXTRA_DETAIL5)
        val detail6 = intent.getStringExtra(EXTRA_DETAIL6)
        val detail7 = intent.getStringExtra(EXTRA_DETAIL7)
        val detail8 = intent.getStringExtra(EXTRA_DETAIL8)
        val detail9 = intent.getStringExtra(EXTRA_DETAIL9)
        val detail10 = intent.getStringExtra(EXTRA_DETAIL10)


        tvDataRecived1.text = nama
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(250, 200))
            .into(tvDataReceived2)
        tvDataRecived3.text = typeCamera
        tvDataRecived4.text = harga
        tvDataRecived5.text = detail1
        tvDataRecived6.text = detail2
        tvDataRecived7.text = detail3
        tvDataRecived8.text = detail4
        tvDataRecived9.text = detail5
        tvDataRecived10.text = detail6
        tvDataRecived11.text = detail7
        tvDataRecived12.text = detail8
        tvDataRecived13.text = detail9
        tvDataRecived14.text = detail10

        setActionBarTitle(title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        btn_set_share.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,"Nih aku mau Share tentang kamera $nama banyak loh keunggulannya diantaranya :$detail1, $detail2, masih banyak lagi loh")
            intent.type = "text/plan"
            startActivity(Intent.createChooser(intent, "share to : "))
        }

    }

    private fun setActionBarTitle(title: String) {
        var namaKamera = intent.getStringExtra(EXTRA_NAMA_KAMERA)
        var title = "Detail $namaKamera"
        supportActionBar?.title = title
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        val benar = super.onBackPressed()
        return benar
    }


}
