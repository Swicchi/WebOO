package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Farmacia;
@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Integer> {
	/*@Modifying
    @Transactional*/
    @Query("SELECT f FROM Farmacia f where f.estadoTurno=1 ORDER BY f.idFarmacia")
    Farmacia readTurno();
    @Transactional
    @Modifying
    @Query("UPDATE Farmacia f SET f.estadoTurno=f.estadoTurno*-1 where f.idFarmacia=:id")
    void cambiarEstado(@Param("id")Integer id);
}
