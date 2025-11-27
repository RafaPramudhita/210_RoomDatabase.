package com.example.myroomsatu.viewmodel.provider

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroomsatu.repositori.AplikasiSiswa
import com.example.myroomsatu.viewmodel.EntryViewModel
import com.example.myroomsatu.viewmodel.HomeViewModel

object PenyediaViewModel {

    val Factory = viewModelFactory {
        initializer {
            val app = aplikasiSiswa()
            HomeViewModel(repositoriSiswa = app.container.repositoriSiswa)
        }
        initializer {
            val app = aplikasiSiswa()
            EntryViewModel(repositoriSiswa = app.container.repositoriSiswa)
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek [Application]
 * dan mengembalikan sebuah instance dari [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
