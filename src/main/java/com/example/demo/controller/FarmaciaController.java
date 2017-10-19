package com.example.demo.controller;

import java.sql.SQLException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.persistence.*;
import com.example.demo.transferobject.*;
import org.springframework.stereotype.Controller;


@Controller
public class FarmaciaController {
	@RequestMapping(value = "/")
	public String index() {
		return "login.jsp";
	}

	@RequestMapping(value= "/loginAdmin", method= RequestMethod.POST)
	public String greeting(@RequestParam(value="user", required=false, defaultValue="World") String correo,@RequestParam(value="pass",
	required=false, defaultValue="World") String pass, Model model) throws SQLException {
		AdministradorTO admin= new AdministradorTO();
		admin.setCorreo(correo);
		admin.setClave(pass);
		AdministradorDAO adminDao = new AdministradorDAO();
		AdministradorTO result =adminDao.login(admin);
		if(result!=null) {
		model.addAttribute("name",result.getNombre());
		model.addAttribute("app",result.getApellidoPaterno());
		model.addAttribute("apm",result.getApellidoMaterno());
		return "index.jsp";
		}
		return "login.jsp";
	}
	@RequestMapping(value = "/registroUsuario")
	public String registro() {
		return "agregar-usuarios.jsp";
	}
	@RequestMapping(value= "/addUser", method= RequestMethod.POST)
	public String addUser(@RequestParam(value="nombres-usuarios", required=false, defaultValue="World") String nombre,
			@RequestParam(value="apellido-paterno-usuarios",	required=false, defaultValue="World") String app,
			@RequestParam(value="apellido-materno-usuarios",	required=false, defaultValue="World") String apm,
			@RequestParam(value="rut-usuarios",	required=false, defaultValue="World") String rut,
			@RequestParam(value="email-usuarios",	required=false, defaultValue="World") String email,
			@RequestParam(value="direccion-usuarios",	required=false, defaultValue="World") String dir,
			@RequestParam(value="telefono-usuarios",	required=false, defaultValue="World") int tel,
			@RequestParam(value="contrasena-usuarios",	required=false, defaultValue="World") String pass,Model model) throws SQLException {
		UsuarioTO user= new UsuarioTO();
		user.setCorreo(email);
		user.setClave(pass);
		user.setRut(rut);
		user.setNombre(nombre);
		user.setApellidoPaterno(app);
		user.setApellidoMaterno(apm);
		user.setTelefono(tel);
		user.setDireccion(dir);
		
		UsuarioDAO userDao = new UsuarioDAO();
		int result =userDao.create(user);
		if(result ==1) {
		model.addAttribute("name",nombre);
		model.addAttribute("app",app);
		model.addAttribute("apm",apm);
		return "ver-usuarios.jsp";
		}
		return "agregar-usuarios.jsp";
	}
}
