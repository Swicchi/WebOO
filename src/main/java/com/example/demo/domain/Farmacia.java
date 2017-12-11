package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the farmacia database table.
 * 
 */
@Entity
@NamedQuery(name="Farmacia.findAll", query="SELECT f FROM Farmacia f")
public class Farmacia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idFarmacia;

	private byte estadoTurno;

	private Time horaDescanso;

	private Time horaEntrada;

	private Time horaReanudacion;

	private Time horaTermino;

	private String nombre;

	private String telefono;

	private String ubicacion;

	//bi-directional many-to-one association to Farmaciaxmedicamento
	@OneToMany(mappedBy="farmacia")
	private List<Farmaciaxmedicamento> farmaciaxmedicamentos;

	//bi-directional many-to-one association to Administrador
	@ManyToOne
	@JoinColumn(name="idAdministrador")
	private Administrador administrador;

	public Farmacia() {
	}

	public int getIdFarmacia() {
		return this.idFarmacia;
	}

	public void setIdFarmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public byte getEstadoTurno() {
		return this.estadoTurno;
	}

	public void setEstadoTurno(byte estadoTurno) {
		this.estadoTurno = estadoTurno;
	}

	public Time getHoraDescanso() {
		return this.horaDescanso;
	}

	public void setHoraDescanso(Time horaDescanso) {
		this.horaDescanso = horaDescanso;
	}

	public Time getHoraEntrada() {
		return this.horaEntrada;
	}

	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Time getHoraReanudacion() {
		return this.horaReanudacion;
	}

	public void setHoraReanudacion(Time horaReanudacion) {
		this.horaReanudacion = horaReanudacion;
	}

	public Time getHoraTermino() {
		return this.horaTermino;
	}

	public void setHoraTermino(Time horaTermino) {
		this.horaTermino = horaTermino;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Farmaciaxmedicamento> getFarmaciaxmedicamentos() {
		return this.farmaciaxmedicamentos;
	}

	public void setFarmaciaxmedicamentos(List<Farmaciaxmedicamento> farmaciaxmedicamentos) {
		this.farmaciaxmedicamentos = farmaciaxmedicamentos;
	}

	public Farmaciaxmedicamento addFarmaciaxmedicamento(Farmaciaxmedicamento farmaciaxmedicamento) {
		getFarmaciaxmedicamentos().add(farmaciaxmedicamento);
		farmaciaxmedicamento.setFarmacia(this);

		return farmaciaxmedicamento;
	}

	public Farmaciaxmedicamento removeFarmaciaxmedicamento(Farmaciaxmedicamento farmaciaxmedicamento) {
		getFarmaciaxmedicamentos().remove(farmaciaxmedicamento);
		farmaciaxmedicamento.setFarmacia(null);

		return farmaciaxmedicamento;
	}

	public Administrador getAdministrador() {
		return this.administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

}