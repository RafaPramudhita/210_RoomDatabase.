package com.example.myroomsatu.view.route

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composable.
     */
    val route: String

    /**
     * Judul yang akan ditampilkan di layar halaman.
     */
    val title: String
}
