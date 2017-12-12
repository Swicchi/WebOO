package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Medicamento;
import com.example.demo.repository.MedicamentoRepository;
@Service
public class MedicamentoServiceImplement implements MedicamentoService{
	private MedicamentoRepository medicamentoRepository;
	
	@Autowired
	public void setMedicamentoRepository(MedicamentoRepository medRepository) {
		medicamentoRepository = medRepository;
	}
	
	public Medicamento findById(Integer id) {
		return medicamentoRepository.findOne(id);
	}
	public Iterable<Medicamento> findAll(){
		return medicamentoRepository.findAll();
	}
	public Medicamento add(Medicamento inv) {
		return medicamentoRepository.save(inv);
	}
	public Medicamento edit(Medicamento inv) {
		return medicamentoRepository.save(inv);
	}
	public void delete(Integer id) {
		medicamentoRepository.delete(id);
	}
}
