package com.example.demo.service;

import com.example.demo.domain.Medicamento;

public interface MedicamentoService {
	Medicamento findById(Integer id);
	Iterable<Medicamento> findAll();
	Medicamento addAdministrador(Medicamento inv);
	Medicamento editAdministrador(Medicamento inv);
	Medicamento deleteAdministrador(Integer id);
}
