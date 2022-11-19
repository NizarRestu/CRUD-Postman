package com.tugas.table.model;

import javax.persistence.*;

//mendefinisikan bahwa kelas dapat dipetakan ke tabel.
@Entity
//Membuat tabel
@Table (name = "kerajaan_islam")
public class Kerajaan {
    @Id
    //Membuat id tidak kosong otomatis menambah dan tidak sama
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Membuat Kolom Di Tabel
    @Column (name = "Kerajaan_Islam")
    private String kerajaanIslam;
    @Column (name = "letak")
    private String letak;
    @Column (name = "Tahun_Berdiri")
    private String tahunBerdiri;
    @Column (name = "Raja_Terkenal")
    private String rajaTerkenal;
    @Column (name = "Peninggalan")
    private String peninggalan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //Getter and Setter
//mengambil dan memperbarui nilai variabel di luar kelas enkapsulasi.
    public String getKerajaanIslam() {
        return kerajaanIslam;
    }

    public void setKerajaanIslam(String kerajaanIslam) {
        this.kerajaanIslam = kerajaanIslam;
    }

    public String getletak() {
        return letak;
    }

    public void setletak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalan() {
        return peninggalan;
    }

    public void setPeninggalan(String peninggalan) {
        this.peninggalan = peninggalan;
    }

// mengembalikan representasi String dari objek.
    @Override
    public String toString() {
        return "Kerajaan{" +
                "id=" + id +
                ", kerajaanIslam='" + kerajaanIslam + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalan='" + peninggalan + '\'' +
                '}';
    }
}
