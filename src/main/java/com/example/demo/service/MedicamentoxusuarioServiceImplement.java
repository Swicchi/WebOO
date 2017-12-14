package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Medicamentoxusuario;
import com.example.demo.domain.Usuario;
import com.example.demo.repository.MedicamentoxusuarioRepository;
@Service
public class MedicamentoxusuarioServiceImplement implements MedicamentoxusuarioService{
	private MedicamentoxusuarioRepository medicamentoxusuarioRepository;
	
	@Autowired
	public void setMedicamentoxusuarioRepository(MedicamentoxusuarioRepository medxuserRepository) {
		medicamentoxusuarioRepository = medxuserRepository;
	}
	
	public Medicamentoxusuario findById(Integer id) {
		return medicamentoxusuarioRepository.findOne(id);
	}
	public Iterable<Medicamentoxusuario> findAll(){
		return medicamentoxusuarioRepository.findAll();
	}
	public Medicamentoxusuario add(Medicamentoxusuario inv) {
		return medicamentoxusuarioRepository.save(inv);
	}
	public Medicamentoxusuario edit(Medicamentoxusuario inv) {
		return medicamentoxusuarioRepository.save(inv);
	}
	public void delete(Integer id) {
		medicamentoxusuarioRepository.delete(id);
	}


	public Iterable<Medicamentoxusuario> findAllxUser(Usuario usuario) {
		// TODO Auto-generated method stub
		return medicamentoxusuarioRepository.findAllxUser(usuario);
	}
}
