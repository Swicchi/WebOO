package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Farmacia;
@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Integer> {
	/*@Modifying
    @Transactional*/
    @Query("SELECT f FROM Farmacia f where f.estadoTurno=1")
    Farmacia readTurno();
}
