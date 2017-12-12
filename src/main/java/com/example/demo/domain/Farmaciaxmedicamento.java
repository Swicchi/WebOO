package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the farmaciaxmedicamento database table.
 * 
 */
@Entity
@NamedQuery(name="Farmaciaxmedicamento.findAll", query="SELECT f FROM Farmaciaxmedicamento f")
public class Farmaciaxmedicamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int precio;

	private int stock;

	//bi-directional many-to-one association to Farmacia
	@ManyToOne
	@JoinColumn(name="id_farmacia")
	private Farmacia farmacia;

	//bi-directional many-to-one association to Medicamento
	@ManyToOne
	@JoinColumn(name="id_medicamento")
	private Medicamento medicamento;

	//bi-directional many-to-one association to Medicamentoxusuario
	@OneToMany(mappedBy="farmaciaxmedicamento")
	private List<Medicamentoxusuario> medicamentoxusuarios;

	public Farmaciaxmedicamento() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Farmacia getFarmacia() {
		return this.farmacia;
	}

	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}

	public Medicamento getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public List<Medicamentoxusuario> getMedicamentoxusuarios() {
		return this.medicamentoxusuarios;
	}

	public void setMedicamentoxusuarios(List<Medicamentoxusuario> medicamentoxusuarios) {
		this.medicamentoxusuarios = medicamentoxusuarios;
	}

	public Medicamentoxusuario addMedicamentoxusuario(Medicamentoxusuario medicamentoxusuario) {
		getMedicamentoxusuarios().add(medicamentoxusuario);
		medicamentoxusuario.setFarmaciaxmedicamento(this);

		return medicamentoxusuario;
	}

	public Medicamentoxusuario removeMedicamentoxusuario(Medicamentoxusuario medicamentoxusuario) {
		getMedicamentoxusuarios().remove(medicamentoxusuario);
		medicamentoxusuario.setFarmaciaxmedicamento(null);

		return medicamentoxusuario;
	}

}