package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Farmaciaxmedicamento;
import com.example.demo.repository.FarmaciaxmedicamentoRepository;
@Service
public class FarmaciaxmedicamentoServiceImplement implements FarmaciaxmedicamentoService{
	private FarmaciaxmedicamentoRepository farmaciaxmedicamentoRepository;
	
	@Autowired
	public void setFarmaciaxmedicamentoRepository(FarmaciaxmedicamentoRepository farmRepository) {
		farmaciaxmedicamentoRepository = farmRepository;
	}
	
	public Farmaciaxmedicamento findById(Integer id) {
		return farmaciaxmedicamentoRepository.findOne(id);
	}
	public Iterable<Farmaciaxmedicamento> findAll(){
		return farmaciaxmedicamentoRepository.findAll();
	}
	public Farmaciaxmedicamento add(Farmaciaxmedicamento inv) {
		return farmaciaxmedicamentoRepository.save(inv);
	}
	public Farmaciaxmedicamento edit(Farmaciaxmedicamento inv) {
		return farmaciaxmedicamentoRepository.save(inv);
	}
	public void delete(Integer id) {
		farmaciaxmedicamentoRepository.delete(id);
	}
}
