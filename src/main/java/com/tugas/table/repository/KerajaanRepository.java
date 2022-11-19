package com.tugas.table.repository;

import com.tugas.table.model.Kerajaan;
import org.springframework.data.jpa.repository.JpaRepository;

//Menampung seluruh data
public interface KerajaanRepository extends JpaRepository<Kerajaan,Long> {
}
