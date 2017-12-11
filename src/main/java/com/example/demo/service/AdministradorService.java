package com.example.demo.service;

import com.example.demo.domain.Administrador;

public interface AdministradorService {
	Administrador findById(Integer id);
	Iterable<Administrador> findAll();
	Administrador addAdministrador(Administrador inv);
	Administrador editAdministrador(Administrador inv);
	Administrador deleteAdministrador(Integer id);
}
