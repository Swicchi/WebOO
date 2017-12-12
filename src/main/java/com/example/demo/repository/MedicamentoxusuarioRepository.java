package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Medicamentoxusuario;
@Repository
public interface MedicamentoxusuarioRepository extends JpaRepository<Medicamentoxusuario, Integer> {

}
