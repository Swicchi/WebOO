package com.example.demo.service;

import com.example.demo.domain.Farmacia;

public interface FarmaciaService {
	Farmacia findById(Integer id);
	Iterable<Farmacia> findAll();
	Farmacia addAdministrador(Farmacia inv);
	Farmacia editAdministrador(Farmacia inv);
	Farmacia deleteAdministrador(Integer id);
}
