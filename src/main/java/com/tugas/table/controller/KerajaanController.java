package com.tugas.table.controller;

import com.tugas.table.model.Kerajaan;
import com.tugas.table.service.KerajaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Untuk Mengkontrol jalannya database
@RestController

//digunakan untuk memetakan permintaan web ke kelas penangan tertentu dan/atau metode penangan.
@RequestMapping ("/kerajaan")
public class KerajaanController {

    //Mengubah atau mengambil data secara otomatis
    @Autowired
    private KerajaanService kerajaanService;

    //menambahkan data
    @PostMapping
    public Kerajaan addKerajaan(@RequestBody Kerajaan kerajaan) {
        return kerajaanService.addKerajaan(kerajaan);
    }
    //Mengambil data
    @GetMapping ("/{id}")
    public Kerajaan getKerajaanById(@PathVariable ("id") Long id) {
        return kerajaanService.getKerajaanById(id);
    }
    //Menaruh data setelah di Edit
    @PutMapping("/{id}")
    public Kerajaan editKerajaanById(@PathVariable ("id") Long id , @RequestBody Kerajaan kerajaan) {
        return kerajaanService.editKerajaanById(id,kerajaan.getKerajaanIslam(),kerajaan.getletak(),kerajaan.getPeninggalan(),kerajaan.getTahunBerdiri(),kerajaan.getRajaTerkenal());
    }
    //mengambil semua data karena mengambilnya tidak menggunakan id
    @GetMapping("/all")
    public List<Kerajaan> getAllKerajaan() {
        return kerajaanService.getAllKerajaan();
    }
    //menghapus data menggunakan id
    @DeleteMapping("/{id}")
    public void deleteKerajaanById(@PathVariable("id") Long id) {
        kerajaanService.deleteKerajaanById(id);
    }
}
