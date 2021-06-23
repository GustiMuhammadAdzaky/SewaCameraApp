package com.desy.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCamera: RecyclerView
    private var list: ArrayList<Camera> = arrayListOf()
    private var title: String = "KAMERA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCamera = findViewById(R.id.rv_camera)
        rvCamera.setHasFixedSize(true)

        list.addAll(CameraData.listData)
        showRecyclerGrid()
        setActionBarTitle(title)
    }

    private fun showSelectedCamera(camera: Camera) {

        val moveWithDataIntent = Intent(this@MainActivity, Details::class.java)
        val namaCamera = camera.nama
        val PhotoCamera = camera.photo
        val TypeCamera = camera.type
        val hargaCamera = camera.harga
        val detail1 = camera.detail1
        val detail2 = camera.detail2
        val detail3 = camera.detail3
        val detail4 = camera.detail4
        val detail5 = camera.detail5
        val detail6 = camera.detail6
        val detail7 = camera.detail7
        val detail8 = camera.detail8
        val detail9 = camera.detail9
        val detail10 = camera.detail10


        moveWithDataIntent.putExtra(Details.EXTRA_NAMA_KAMERA, "$namaCamera")
        moveWithDataIntent.putExtra(Details.EXTRA_PHOTO, PhotoCamera)
        moveWithDataIntent.putExtra(Details.EXTRA_TYPE_CAMERA, "$TypeCamera")
        moveWithDataIntent.putExtra(Details.EXTRA_HARGA, "$hargaCamera")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL1, "$detail1")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL2, "$detail2")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL3, "$detail3")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL4, "$detail4")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL5, "$detail5")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL6, "$detail6")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL7, "$detail7")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL8, "$detail8")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL9, "$detail9")
        moveWithDataIntent.putExtra(Details.EXTRA_DETAIL10, "$detail10")



        startActivity(moveWithDataIntent)


    }


    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerGrid() {
        rvCamera.layoutManager = GridLayoutManager(this,1)
        val gridHeroAdapter = CameraAdapter(list)
        rvCamera.adapter = gridHeroAdapter

        gridHeroAdapter.setOnItemClickCallback(object : CameraAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Camera) {
                showSelectedCamera(data)
            }
        })
    }
}
