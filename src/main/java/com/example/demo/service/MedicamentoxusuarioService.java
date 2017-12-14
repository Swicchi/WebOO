package com.example.demo.service;

import com.example.demo.domain.Medicamentoxusuario;
import com.example.demo.domain.Usuario;

public interface MedicamentoxusuarioService {
	Medicamentoxusuario findById(Integer id);
	Iterable<Medicamentoxusuario> findAll();
	Medicamentoxusuario add(Medicamentoxusuario inv);
	Medicamentoxusuario edit(Medicamentoxusuario inv);
	void delete(Integer id);
	Iterable<Medicamentoxusuario> findAllxUser(Usuario usuario);
}
