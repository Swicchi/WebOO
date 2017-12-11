package com.example.demo.service;

import com.example.demo.domain.Medicamentoxusuario;

public interface MedicamentoxusuarioService {
	Medicamentoxusuario findById(Integer id);
	Iterable<Medicamentoxusuario> findAll();
	Medicamentoxusuario addAdministrador(Medicamentoxusuario inv);
	Medicamentoxusuario editAdministrador(Medicamentoxusuario inv);
	Medicamentoxusuario deleteAdministrador(Integer id);
}
