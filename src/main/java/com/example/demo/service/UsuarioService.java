package com.example.demo.service;

import com.example.demo.domain.Usuario;

public interface UsuarioService {
	Usuario findById(Integer id);
	Iterable<Usuario> findAll();
	Usuario add(Usuario inv);
	Usuario edit(Usuario inv);
	void delete(Integer id);
}
