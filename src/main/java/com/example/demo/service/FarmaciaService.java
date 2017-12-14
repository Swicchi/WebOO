package com.example.demo.service;


import com.example.demo.domain.Farmacia;

public interface FarmaciaService {
	Farmacia findById(Integer id);
	Iterable<Farmacia> findAll();
	Farmacia add(Farmacia inv);
	Farmacia edit(Farmacia inv);
	void delete(Integer id);
	void cambiarEstado(Integer id);
	Farmacia readTurno();
}
