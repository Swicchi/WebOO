package com.example.demo.service;

import com.example.demo.domain.Farmaciaxmedicamento;

public interface FarmaciaxmedicamentoService {
	Farmaciaxmedicamento findById(Integer id);
	Iterable<Farmaciaxmedicamento> findAll();
	Farmaciaxmedicamento addAdministrador(Farmaciaxmedicamento inv);
	Farmaciaxmedicamento editAdministrador(Farmaciaxmedicamento inv);
	Farmaciaxmedicamento deleteAdministrador(Integer id);
}
