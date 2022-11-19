package com.tugas.table.service;

import com.tugas.table.model.Kerajaan;
import com.tugas.table.repository.KerajaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//digunakan untuk menandai kelas sebagai penyedia layanan
@Service
public class KerajaanServiceImpl implements KerajaanService{
    //Mengubah atau mengambil data secara otomatis
    @Autowired
    KerajaanRepository kerajaanRepository;
//  menunjukkan bahwa metode kelas anak menimpa metode kelas dasar
    //Menjalankan Fungsi Method  addKerajaan(parameter)
    @Override
    public Kerajaan addKerajaan(Kerajaan kerajaan) {
        return kerajaanRepository.save(kerajaan);
    }
    //  menunjukkan bahwa metode kelas anak menimpa metode kelas dasar
    //Menjalankan Fungsi Method  getKerajaanById(parameter)
    @Override
    public Kerajaan getKerajaanById(Long id) {
        return kerajaanRepository.findById(id).get();
    }
    //  menunjukkan bahwa metode kelas anak menimpa metode kelas dasar
    //Menjalankan Fungsi Method  editKerajaanById(parameter)
    @Override
    public Kerajaan editKerajaanById(Long id, String kerajaanIslam, String letak, String Peninggalan, String TahunBerdiri, String RajaTerkenal) {
        Kerajaan kerajaan = kerajaanRepository.findById(id).get();
        kerajaan.setKerajaanIslam(kerajaanIslam);
        kerajaan.setletak(letak);
        kerajaan.setPeninggalan(Peninggalan);
        kerajaan.setRajaTerkenal(RajaTerkenal);
        kerajaan.setTahunBerdiri(TahunBerdiri);
        return kerajaanRepository.save(kerajaan);
    }
    //  menunjukkan bahwa metode kelas anak menimpa metode kelas dasar
    //Menjalankan Fungsi Method  getAllKerajaan(parameter)
    @Override
    public List<Kerajaan> getAllKerajaan() {
        return kerajaanRepository.findAll();
    }
    //  menunjukkan bahwa metode kelas anak menimpa metode kelas dasar
    //Menjalankan Fungsi Method  deleteKerajaanById(parameter)
    @Override
    public void deleteKerajaanById(Long id) {
        kerajaanRepository.deleteById(id);
    }
}
