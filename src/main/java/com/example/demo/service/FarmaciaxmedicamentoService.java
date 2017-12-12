package com.example.demo.service;

import com.example.demo.domain.Farmaciaxmedicamento;

public interface FarmaciaxmedicamentoService {
	Farmaciaxmedicamento findById(Integer id);
	Iterable<Farmaciaxmedicamento> findAll();
	Farmaciaxmedicamento add(Farmaciaxmedicamento inv);
	Farmaciaxmedicamento edit(Farmaciaxmedicamento inv);
	void delete(Integer id);
}
