package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	 @Query("SELECT a FROM Usuario a where a.correo = :correo and a.clave = :clave ")
	 Usuario login(@Param("correo")String correo,@Param("clave") String clave);
}
