package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Administrador;
import com.example.demo.repository.AdministradorRepository;
@Service
public class AdministradorServiceImplement implements AdministradorService{
	private AdministradorRepository administradorRepository;
	
	@Autowired
	public void setAdministradorRepository(AdministradorRepository adminRepository) {
		administradorRepository = adminRepository;
	}
	
	public Administrador findById(Integer id) {
		return administradorRepository.findOne(id);
	}
	public Iterable<Administrador> findAll(){
		return administradorRepository.findAll();
	}
	public Administrador add(Administrador inv) {
		return administradorRepository.save(inv);
	}
	public Administrador edit(Administrador inv) {
		return administradorRepository.save(inv);
	}
	public void delete(Integer id) {
		administradorRepository.delete(id);
	}
	public Administrador login(String correo, String clave) {
		return administradorRepository.login(correo, clave);
	}
}
