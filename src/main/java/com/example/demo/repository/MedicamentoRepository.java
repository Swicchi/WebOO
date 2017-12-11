package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Administrador;
import com.example.demo.domain.Medicamento;
@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

}
