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
}
