package com.example.demo.service;

import com.example.demo.domain.Administrador;

public interface AdministradorService {
	Administrador findById(Integer id);
	Iterable<Administrador> findAll();
	Administrador add(Administrador inv);
	Administrador edit(Administrador inv);
	void delete(Integer id);
	Administrador login(String correo,String clave);
}
