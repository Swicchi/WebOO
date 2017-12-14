package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Medicamentoxusuario;
import com.example.demo.domain.Usuario;
@Repository
public interface MedicamentoxusuarioRepository extends JpaRepository<Medicamentoxusuario, Integer> {
	 @Query("SELECT m FROM Medicamentoxusuario m where m.usuario = :usuario")
	 Iterable<Medicamentoxusuario> findAllxUser(@Param("usuario")Usuario user);
}
