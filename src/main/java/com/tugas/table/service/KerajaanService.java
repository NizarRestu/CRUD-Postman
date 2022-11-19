package com.tugas.table.service;

import com.tugas.table.model.Kerajaan;

import java.util.List;

public interface KerajaanService {
//Memambahkan data
    Kerajaan addKerajaan(Kerajaan kerajaan);
//Mengambil data
    Kerajaan getKerajaanById(Long id);
//Mengedit data
    Kerajaan editKerajaanById(Long id,String KerajaanIslam,String letak,String Peninggalan,String TahunBerdiri,String RajaTerkenal);
//mengambil seluruh data tidak mengambil mengguakan id
    List<Kerajaan> getAllKerajaan();
//menghapus data menggunakan id
    void deleteKerajaanById(Long id);
}
