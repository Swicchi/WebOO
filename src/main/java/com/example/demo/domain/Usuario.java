package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUsuario;

	private String apellidoMaterno;

	private String apellidoPaterno;

	private String clave;

	private String correo;

	private String direccion;

	private String nombre;

	private String rut;

	private int telefono;

	//bi-directional many-to-one association to Medicamentoxusuario
	@OneToMany(mappedBy="usuario")
	private List<Medicamentoxusuario> medicamentoxusuarios;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Medicamentoxusuario> getMedicamentoxusuarios() {
		return this.medicamentoxusuarios;
	}

	public void setMedicamentoxusuarios(List<Medicamentoxusuario> medicamentoxusuarios) {
		this.medicamentoxusuarios = medicamentoxusuarios;
	}

	public Medicamentoxusuario addMedicamentoxusuario(Medicamentoxusuario medicamentoxusuario) {
		getMedicamentoxusuarios().add(medicamentoxusuario);
		medicamentoxusuario.setUsuario(this);

		return medicamentoxusuario;
	}

	public Medicamentoxusuario removeMedicamentoxusuario(Medicamentoxusuario medicamentoxusuario) {
		getMedicamentoxusuarios().remove(medicamentoxusuario);
		medicamentoxusuario.setUsuario(null);

		return medicamentoxusuario;
	}

}