package com.desy.projectakhir

object CameraData {
    private val cameraName = arrayListOf(
        "Canon",
        "Nikon",
        "Fujifilm"
    )
    private val cameraImage = arrayListOf(
        R.drawable.cannon,
        R.drawable.nikon,
        R.drawable.fujifilm
    )
    private val cameraType = arrayListOf(
        "Canon EOS 850D",
        "Nikon D3100",
        "Fujifilm XA3"
    )
    private val cameraHarga = arrayListOf(
        "Rp. 20.000",
        "Rp  3.699.000",
        "Rp. 40.000"
    )

    private val listSatu = arrayListOf(
        "EF-S18-55mm f/4-5.6 IS STM",
        "Sensor DX 14.2MP",
        "108 X 67 X 35 mm."
    )
    private val listDua = arrayListOf(
        "Sensor APS-C CMOS 24,1",
        "Menggunakan 3 LCD ",
        "Memori : 128 GB."
    )
    private val listTiga = arrayListOf(
        "megapiksel+ perekaman video 4K",
        "Tampilan Langsung",
        "Lensa : Kit XC16-50mm."
    )
    private val listEmpat = arrayListOf(
        "45 titik AF",
        "Video HD 1080p",
        "view finder."
    )
    private val listLima = arrayListOf(
        "Dual Pixel CMOS AF",
        "Suara & Fokus Otomatis",
        "mirrorless."
    )
    private val listEnam = arrayListOf(
        "Konektivitas Wi-Fi",
        "Fokus 11 titik",
        "Fitur sudah CMOS."
    )
    private val listTujuh = arrayListOf(
        "ergonomik Dan bagus",
        "3 Bingkai perDetik",
        "Sudah Eneble Wifi"
    )
    private val listDelapan = arrayListOf(
        "CMOS format APS-C",
        "ISO 100 hingga 3200 ",
        "Sudah HDMI Pastinya"
    )
    private val listSembilan = arrayListOf(
        "DIGIC 8",
        "Sensor Pembersihan Diri",
        "Menggunakan Port USB"
    )
    private val listSepuluh = arrayListOf(
        "Dual Pixel CMOS AF",
        "EXPEED 2, Mesin Pemroses Gambar",
        "ergonomik,interface mudah digunakan"
    )

    val listData: ArrayList<Camera>
        get() {
            val list = arrayListOf<Camera>()
            for (position in cameraName.indices){
                val camera = Camera()
                camera.nama = cameraName[position]
                camera.photo = cameraImage[position]
                camera.type = cameraType[position]
                camera.harga = cameraHarga[position]
                camera.detail1 = listSatu[position]
                camera.detail2 = listDua[position]
                camera.detail3 = listTiga[position]
                camera.detail4 = listEmpat[position]
                camera.detail5 = listLima[position]
                camera.detail6 = listEnam[position]
                camera.detail7 = listTujuh[position]
                camera.detail8 = listDelapan[position]
                camera.detail9 = listSembilan[position]
                camera.detail10 = listSepuluh[position]
                list.add(camera)
            }
            return list
        }








}