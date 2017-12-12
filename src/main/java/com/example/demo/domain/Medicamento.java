package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the medicamento database table.
 * 
 */
@Entity
@NamedQuery(name="Medicamento.findAll", query="SELECT m FROM Medicamento m")
public class Medicamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_medicamento")
	private int idMedicamento;

	@Column(name="nombre_comercial")
	private String nombreComercial;

	@Column(name="nombre_generico")
	private String nombreGenerico;

	//bi-directional many-to-one association to Farmaciaxmedicamento
	@OneToMany(mappedBy="medicamento")
	private List<Farmaciaxmedicamento> farmaciaxmedicamentos;

	public Medicamento() {
	}

	public int getIdMedicamento() {
		return this.idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreGenerico() {
		return this.nombreGenerico;
	}

	public void setNombreGenerico(String nombreGenerico) {
		this.nombreGenerico = nombreGenerico;
	}

	public List<Farmaciaxmedicamento> getFarmaciaxmedicamentos() {
		return this.farmaciaxmedicamentos;
	}

	public void setFarmaciaxmedicamentos(List<Farmaciaxmedicamento> farmaciaxmedicamentos) {
		this.farmaciaxmedicamentos = farmaciaxmedicamentos;
	}

	public Farmaciaxmedicamento addFarmaciaxmedicamento(Farmaciaxmedicamento farmaciaxmedicamento) {
		getFarmaciaxmedicamentos().add(farmaciaxmedicamento);
		farmaciaxmedicamento.setMedicamento(this);

		return farmaciaxmedicamento;
	}

	public Farmaciaxmedicamento removeFarmaciaxmedicamento(Farmaciaxmedicamento farmaciaxmedicamento) {
		getFarmaciaxmedicamentos().remove(farmaciaxmedicamento);
		farmaciaxmedicamento.setMedicamento(null);

		return farmaciaxmedicamento;
	}

}