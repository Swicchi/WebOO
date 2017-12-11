package com.example.demo.service;

import com.example.demo.domain.Usuario;

public interface UsuarioService {
	Usuario findById(Integer id);
	Iterable<Usuario> findAll();
	Usuario addAdministrador(Usuario inv);
	Usuario editAdministrador(Usuario inv);
	Usuario deleteAdministrador(Integer id);
}
