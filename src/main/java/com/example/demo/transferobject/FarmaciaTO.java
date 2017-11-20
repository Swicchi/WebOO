package com.example.demo.transferobject;

import java.sql.Time;
import java.util.Date;

public class FarmaciaTO {
	private int id;
	private String ubicacion;
	private int estado;
	private String nombre;
	private int administrador;
	private Time horaEntrada;
	private Time horaDescanso;
	private Time horaReanudacion;
	private Time horaSalida;
	private String telefono;
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Date getHoraDescanso() {
		return horaDescanso;
	}
	public void setHoraDescanso(Time horaDescanso) {
		this.horaDescanso = horaDescanso;
	}
	public Date getHoraReanudacion() {
		return horaReanudacion;
	}
	public void setHoraReanudacion(Time horaReanudacion) {
		this.horaReanudacion = horaReanudacion;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAdministrador() {
		return administrador;
	}
	public void setAdministrador(int administrador) {
		this.administrador = administrador;
	}
	
	
}
