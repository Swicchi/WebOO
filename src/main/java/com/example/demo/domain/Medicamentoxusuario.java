package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the medicamentoxusuario database table.
 * 
 */
@Entity
@NamedQuery(name="Medicamentoxusuario.findAll", query="SELECT m FROM Medicamentoxusuario m")
public class Medicamentoxusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Farmaciaxmedicamento
	@ManyToOne
	@JoinColumn(name="idMedicamento")
	private Farmaciaxmedicamento farmaciaxmedicamento;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Medicamentoxusuario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Farmaciaxmedicamento getFarmaciaxmedicamento() {
		return this.farmaciaxmedicamento;
	}

	public void setFarmaciaxmedicamento(Farmaciaxmedicamento farmaciaxmedicamento) {
		this.farmaciaxmedicamento = farmaciaxmedicamento;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}