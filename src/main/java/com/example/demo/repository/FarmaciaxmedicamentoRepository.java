package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Administrador;
import com.example.demo.domain.Farmacia;
import com.example.demo.domain.Farmaciaxmedicamento;
@Repository
public interface FarmaciaxmedicamentoRepository extends JpaRepository<Farmaciaxmedicamento, Integer> {

}
