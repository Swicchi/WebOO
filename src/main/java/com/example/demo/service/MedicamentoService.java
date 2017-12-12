package com.example.demo.service;

import com.example.demo.domain.Medicamento;

public interface MedicamentoService {
	Medicamento findById(Integer id);
	Iterable<Medicamento> findAll();
	Medicamento add(Medicamento inv);
	Medicamento edit(Medicamento inv);
	void delete(Integer id);
}
