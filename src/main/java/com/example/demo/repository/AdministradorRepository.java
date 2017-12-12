package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Administrador;
@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {
	 @Query("SELECT a FROM Administrador a where a.correo = :correo and a.clave = :clave ")
	 Administrador login(@Param("correo")String correo,@Param("clave") String clave);
}
