package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Administrador;
import com.example.demo.domain.Farmacia;
@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Integer> {

}
