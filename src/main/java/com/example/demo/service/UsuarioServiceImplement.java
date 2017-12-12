package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Usuario;
import com.example.demo.repository.UsuarioRepository;
@Service
public class UsuarioServiceImplement implements UsuarioService{
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	public void setUsuarioRepository(UsuarioRepository userRepository) {
		usuarioRepository = userRepository;
	}
	
	public Usuario findById(Integer id) {
		return usuarioRepository.findOne(id);
	}
	public Iterable<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	public Usuario add(Usuario inv) {
		return usuarioRepository.save(inv);
	}
	public Usuario edit(Usuario inv) {
		return usuarioRepository.save(inv);
	}
	public void delete(Integer id) {
		usuarioRepository.delete(id);
	}
}
