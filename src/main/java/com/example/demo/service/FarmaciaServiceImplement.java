package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Farmacia;
import com.example.demo.repository.FarmaciaRepository;
@Service
public class FarmaciaServiceImplement implements FarmaciaService{
	private FarmaciaRepository farmaciaRepository;
	
	@Autowired
	public void setFarmaciaRepository(FarmaciaRepository farmRepository) {
		farmaciaRepository = farmRepository;
	}
	
	public Farmacia findById(Integer id) {
		return farmaciaRepository.findOne(id);
	}
	public Iterable<Farmacia> findAll(){
		return farmaciaRepository.findAll();
	}
	public Farmacia add(Farmacia inv) {
		return farmaciaRepository.save(inv);
	}
	public Farmacia edit(Farmacia inv) {
		return farmaciaRepository.save(inv);
	}
	public void delete(Integer id) {
		farmaciaRepository.delete(id);
	}
	public Farmacia readTurno() {
		return farmaciaRepository.readTurno();
	};
}
