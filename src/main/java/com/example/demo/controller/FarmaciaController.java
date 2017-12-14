package com.example.demo.controller;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.*;
import com.example.demo.persistence.*;
import com.example.demo.service.*;
import com.example.demo.transferobject.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class FarmaciaController {
	@Autowired
	private FarmaciaService farmaciaService;
	@Autowired
	private AdministradorService administradorService;
	@Autowired
	private FarmaciaxmedicamentoService farmaciaxmedicamentoService;
	@Autowired
	private MedicamentoService medicamentoService;
	@Autowired
	private MedicamentoxusuarioService medicamentoxusuarioService;
	@Autowired
	private UsuarioService usuarioService;
	
	private Medicamentoxusuario medicamentoU = new Medicamentoxusuario(); 
	@RequestMapping(value = "/")
	public String index(Model model) throws SQLException {

		Farmacia farmacia = farmaciaService.readTurno();
		if(farmacia != null) {
			model.addAttribute("turno",farmacia.getNombre());
			model.addAttribute("id",farmacia.getIdFarmacia());
		}
		
		return "index";
	}
	@RequestMapping(value = "/inicio")
	public String inicio(Model model) throws SQLException {

		Farmacia farmacia = farmaciaService.readTurno();
		if(farmacia != null) {
			model.addAttribute("turno",farmacia.getNombre());
			model.addAttribute("id",farmacia.getIdFarmacia());
		}
		
		return "index";
	}
	@RequestMapping(value = "/farmacias")
	public String farmacia(Model model) throws SQLException {
		Iterable<Farmacia> farmacias = farmaciaService.findAll();
		if(farmacias!=null) {
		model.addAttribute("list",farmacias);
		}
		return "farmacias";
	}
	@RequestMapping(value = "/medicamentos")
	public String medicamentos(Model model) throws SQLException {
		Iterable<Medicamento> medicamentos = medicamentoService.findAll();
		if(medicamentos!=null) {
		model.addAttribute("list",medicamentos);
		}
		return "medicamentos";
	}
	@RequestMapping(value = "/main")
	public String main() {
		return "main";
	}
	@RequestMapping(value= "/loginAdmin", method= RequestMethod.POST)
	public String greeting(@RequestParam(value="user", required=false) String correo,@RequestParam(value="pass",
	required=false) String pass, Model model) throws SQLException {
		/*AdministradorTO admin= new AdministradorTO();
		admin.setCorreo(correo);
		admin.setClave(pass);
		AdministradorDAO adminDao = new AdministradorDAO();*/
		Administrador result =administradorService.login(correo,pass);
		if(result!=null) {
			return main();
		}
		model.addAttribute("error","Datos incorrectos");
		return "login";
	}
	@RequestMapping(value= "/loginUsuario", method= RequestMethod.POST)
	public String loginuser(@RequestParam(value="user", required=false) String correo,@RequestParam(value="pass",
	required=false) String pass, Model model) throws SQLException {
		/*AdministradorTO admin= new AdministradorTO();
		admin.setCorreo(correo);
		admin.setClave(pass);
		AdministradorDAO adminDao = new AdministradorDAO();*/
		Usuario result =usuarioService.login(correo,pass);
		if(result!=null) {
			medicamentoU.setUsuario(result);
			Medicamentoxusuario medu = medicamentoxusuarioService.add(medicamentoU);
			model.addAttribute("medu",medu);
			model.addAttribute("user",result);
			model.addAttribute("error","Medicamento solicitado");
			return "solicitud";
		}
		model.addAttribute("error","Datos incorrectos");
		return "login3";
	}
	@RequestMapping(value = "/registro")
	public String registro() {
		return "registro";
	}
	@RequestMapping(value = "/verfarmacia", method= RequestMethod.GET)
	public String farmacia(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		/*FarmaciaTO far= new FarmaciaTO();
		far.setId(id);
		FarmaciaDAO farmDAO = new FarmaciaDAO();*/
		/*far = farmDAO.read(far);*/
		Farmacia far = farmaciaService.findById(id);
		if(far!=null) {
			model.addAttribute("farmacia",far);
		}
		return "farmaciadetalle";
	}
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}@RequestMapping(value = "/loginuser", method= RequestMethod.GET)
	public String login3(@RequestParam(value="id", required=false) int id,Model model) throws SQLException {
		Farmaciaxmedicamento farmed = farmaciaxmedicamentoService.findById(id);
		medicamentoU.setFarmaciaxmedicamento(farmed);
		if (model.containsAttribute("user")) {
			System.out.println("index!********************");
			/*Map modelmap = model.asMap();
			Usuario user = (Usuario)modelmap.get("user");
			medicamentoU.setUsuario(user);
			medicamentoxusuarioService.add(medicamentoU);
			model.addAttribute("error","Medicamento solicitado");*/
			return this.medicamentos(model);
		}
		model.addAttribute("error","Requiere inicio de sesión");
		return "login3";
	}
	@RequestMapping(value = "/agregarUsuarios")
	public String agregarUser() {
		return "agregar-usuarios";
	}
	@RequestMapping(value = "/agregarMedicamentos")
	public String agregarMedicamentos() {
		return "agregar-medicamentos";
	}
	@RequestMapping(value = "/agregarFarmacias")
	public String agregarfar(Model model) {
		Iterable<Administrador> admins = administradorService.findAll();
		if(admins!=null) {
		
			model.addAttribute("list",admins);
		return "agregar-farmacias";
	}
		model.addAttribute("error","no hay administradores");
		return "main";
	}
	@RequestMapping(value = "/agregarAdministradores")
	public String agregaradm() {
		return "agregar-administradores";
	}
	@RequestMapping(value= "/nuevouser", method= RequestMethod.POST)
	public String nuevoUser(@RequestParam(value="nombres-usuarios", required=false, defaultValue="World") String nombre,
			@RequestParam(value="apellido-paterno-usuarios",	required=false, defaultValue="World") String app,
			@RequestParam(value="apellido-materno-usuarios",	required=false, defaultValue="World") String apm,
			@RequestParam(value="rut-usuarios",	required=false, defaultValue="World") String rut,
			@RequestParam(value="email-usuarios",	required=false, defaultValue="World") String email,
			@RequestParam(value="direccion-usuarios",	required=false, defaultValue="World") String dir,
			@RequestParam(value="telefono-usuarios",	required=false, defaultValue="World") int tel,
			@RequestParam(value="contrasena-usuarios",	required=false, defaultValue="World") String pass,Model model) throws SQLException {
		Usuario user= new Usuario();
		user.setCorreo(email);
		user.setClave(pass);
		user.setRut(rut);
		user.setNombre(nombre);
		user.setApellidoPaterno(app);
		user.setApellidoMaterno(apm);
		user.setTelefono(tel);
		user.setDireccion(dir);
		
		/*UsuarioDAO userDao = new UsuarioDAO();
		int result =userDao.create(user);*/
		Usuario result = usuarioService.add(user);
		if(result !=null) {
			medicamentoU.setUsuario(result);
			Medicamentoxusuario medu = medicamentoxusuarioService.add(medicamentoU);
			model.addAttribute("medu",medu);	
			model.addAttribute("user",result);
			model.addAttribute("error","Medicamento solicitado");
			return "solicitud";
		}
		model.addAttribute("error","No se agregó registro");
		return "agregar-usuarios";
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
		Usuario user= new Usuario();
		user.setCorreo(email);
		user.setClave(pass);
		user.setRut(rut);
		user.setNombre(nombre);
		user.setApellidoPaterno(app);
		user.setApellidoMaterno(apm);
		user.setTelefono(tel);
		user.setDireccion(dir);
		
		/*UsuarioDAO userDao = new UsuarioDAO();
		int result =userDao.create(user);*/
		Usuario result = usuarioService.add(user);
		if(result !=null) {
			model.addAttribute("error","Se agregó registro");
			return this.verUsuarios(model);
		}
		model.addAttribute("error","No se agregó registro");
		return "agregar-usuarios";
	}
	@RequestMapping(value= "/addAdmin", method= RequestMethod.POST)
	public String addAdmin(@RequestParam(value="nombres-administradores", required=false, defaultValue="World") String nombre,
			@RequestParam(value="apellido-paterno-administradores",	required=false, defaultValue="World") String app,
			@RequestParam(value="apellido-materno-administradores",	required=false, defaultValue="World") String apm,
			@RequestParam(value="rut-administradores",	required=false, defaultValue="World") String rut,
			@RequestParam(value="email-administradores",	required=false, defaultValue="World") String email,
			@RequestParam(value="direccion-administradores",	required=false, defaultValue="World") String dir,
			@RequestParam(value="telefono-administradores",	required=false, defaultValue="World") int tel,
			@RequestParam(value="contrasena-administradores",	required=false, defaultValue="World") String pass,Model model) throws SQLException {
		Administrador admin= new Administrador();
		admin.setCorreo(email);
		admin.setClave(pass);
		admin.setRut(rut);
		admin.setNombre(nombre);
		admin.setApellidoPaterno(app);
		admin.setApellidoMaterno(apm);
		admin.setTelefono(tel);
		admin.setDireccion(dir);
		
		/*UsuarioDAO userDao = new UsuarioDAO();
		int result =userDao.create(user);*/
		Administrador result = administradorService.add(admin);
		if(result !=null) {
			model.addAttribute("error","Se agregó registro");
			return this.verAdministradores(model);
		}
		model.addAttribute("error","No se agregó registro");
		return "agregar-administradores";
	}
	@RequestMapping(value= "/modAdmin", method= RequestMethod.POST)
	public String modAdmin(@RequestParam(value="nombres-administradores", required=false, defaultValue="World") String nombre,
			@RequestParam(value="apellido-paterno-administradores",	required=false, defaultValue="World") String app,
			@RequestParam(value="apellido-materno-administradores",	required=false, defaultValue="World") String apm,
			@RequestParam(value="rut-administradores",	required=false, defaultValue="World") String rut,
			@RequestParam(value="email-administradores",	required=false, defaultValue="World") String email,
			@RequestParam(value="direccion-administradores",	required=false, defaultValue="World") String dir,
			@RequestParam(value="telefono-administradores",	required=false, defaultValue="World") int tel,
			@RequestParam(value="id",	required=false, defaultValue="World") int id,
			@RequestParam(value="contrasena-administradores",	required=false, defaultValue="World") String pass,Model model) throws SQLException {
		Administrador admin= new Administrador();
		admin.setCorreo(email);
		admin.setClave(pass);
		admin.setRut(rut);
		admin.setNombre(nombre);
		admin.setApellidoPaterno(app);
		admin.setApellidoMaterno(apm);
		admin.setTelefono(tel);
		admin.setDireccion(dir);
		admin.setIdAdministrador(id);
		/*UsuarioDAO userDao = new UsuarioDAO();
		int result =userDao.create(user);*/
		Administrador result = administradorService.add(admin);
		if(result !=null) {
			model.addAttribute("error","Se modificó registro");
			return this.verAdministradores(model);
		}
		model.addAttribute("error","No se modificó registro");
		return this.editadmin(id,model);
	}
	@RequestMapping(value= "/modUser", method= RequestMethod.POST)
	public String moduser(@RequestParam(value="nombres-usuarios", required=false, defaultValue="World") String nombre,
			@RequestParam(value="apellido-paterno-usuarios",	required=false, defaultValue="World") String app,
			@RequestParam(value="apellido-materno-usuarios",	required=false, defaultValue="World") String apm,
			@RequestParam(value="rut-usuarios",	required=false, defaultValue="World") String rut,
			@RequestParam(value="email-usuarios",	required=false, defaultValue="World") String email,
			@RequestParam(value="direccion-usuarios",	required=false, defaultValue="World") String dir,
			@RequestParam(value="telefono-usuarios",	required=false, defaultValue="World") int tel,
			@RequestParam(value="id",	required=false, defaultValue="World") int id,
			@RequestParam(value="contrasena-usuarios",	required=false, defaultValue="World") String pass,Model model) throws SQLException {
		Usuario user= new Usuario();
		user.setCorreo(email);
		user.setClave(pass);
		user.setRut(rut);
		user.setNombre(nombre);
		user.setApellidoPaterno(app);
		user.setApellidoMaterno(apm);
		user.setTelefono(tel);
		user.setDireccion(dir);
		user.setIdUsuario(id);
		
		/*UsuarioDAO userDao = new UsuarioDAO();
		int result =userDao.update(user);*/
		Usuario result = usuarioService.edit(user);
		if(result !=null) {
			model.addAttribute("error","Se modificó registro");
			return this.verUsuarios(model);
		}
		model.addAttribute("error","No se modificó registro");
		return editarUser(id,model);
	}
	@RequestMapping(value= "/addMedic", method= RequestMethod.POST)
	public String addMedicamento(@RequestParam(value="nombre-comercial") String nombreComercial,@RequestParam(value="nombre-generico") String nombreGenerico,Model model) throws SQLException {
		Medicamento med= new Medicamento();
		med.setNombreComercial(nombreComercial);
		med.setNombreGenerico(nombreGenerico);
		Medicamento result =medicamentoService.add(med);
		/*MedicamentoDAO medDao = new MedicamentoDAO();
		int result =medDao.create(med);*/
		if(result !=null) {
			
			model.addAttribute("error","Se agregó registro");
			return verMedicamento(model);
		}
		model.addAttribute("error","No se agregó registro");
		return "agregar-medicamentos";
	}
	@RequestMapping(value= "/modMedic", method= RequestMethod.POST)
	public String modMedicamento(@RequestParam(value="nombre-comercial") String nombreComercial,@RequestParam(value="nombre-generico") String nombreGenerico,@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		Medicamento med= new Medicamento();
		med.setNombreComercial(nombreComercial);
		med.setNombreGenerico(nombreGenerico);
		med.setIdMedicamento(id);
		/*MedicamentoDAO medDao = new MedicamentoDAO();
		int result =medDao.update(med);*/
		Medicamento result = medicamentoService.edit(med);
		if(result !=null) {
			model.addAttribute("error","Se modificó registro");
			return verMedicamento(model);
			
		}
		model.addAttribute("med",med);
		model.addAttribute("error","No se modificó registro");
		return editarMedicamento(id,model);
	}
	
	@RequestMapping(value= "/addFarm", method= RequestMethod.POST)
	public String addFarmacia(@RequestParam(value="nombres-farmacia") String nom,@RequestParam(value="direccion-farmacia") String dir,@RequestParam(value="telefono-farmacia") String telefono,@RequestParam(value="idadmin") int id,Model model) throws SQLException {
		Farmacia farm= new Farmacia();
		farm.setNombre(nom);
		farm.setUbicacion(dir);
		farm.setTelefono(telefono);
		farm.setAdministrador(administradorService.findById(id));
		Farmacia result =farmaciaService.add(farm);
		/*MedicamentoDAO medDao = new MedicamentoDAO();
		int result =medDao.create(med);*/
		if(result !=null) {
			
			model.addAttribute("error","Se agregó registro");
			return verFarmacias(model);
		}
		model.addAttribute("error","No se agregó registro");
		return "agregar-farmacias";
	}
	@RequestMapping(value= "/modFarm", method= RequestMethod.POST)
	public String modFarmacia(@RequestParam(value="nombres-farmacia") String nom,@RequestParam(value="direccion-farmacia") String dir,@RequestParam(value="telefono-farmacia") String telefono,@RequestParam(value="id", required=false, defaultValue="World") int id,@RequestParam(value="idadmin") int ida,Model model) throws SQLException {
		Farmacia farm= new Farmacia();
		farm.setNombre(nom);
		farm.setUbicacion(dir);
		farm.setTelefono(telefono);
		farm.setIdFarmacia(id);
		farm.setAdministrador(administradorService.findById(ida));
		Farmacia result =farmaciaService.add(farm);
		/*MedicamentoDAO medDao = new MedicamentoDAO();
		int result =medDao.update(med);*/
		
		if(result !=null) {
			model.addAttribute("error","Se modificó registro");
			return verFarmacias(model);
			
		}
		model.addAttribute("med",farm);
		model.addAttribute("error","No se modificó registro");
		return editfarm(id, model);
	}
	
	@RequestMapping(value= "/verMedicamentos")
	public String verMedicamento(Model model) throws SQLException {
		/*LinkedList<MedicamentoTO> med= new LinkedList<>();

		MedicamentoDAO medDao = new MedicamentoDAO();
		med = medDao.readAll();*/
		Iterable<Medicamento> medicamentos = medicamentoService.findAll();
		if(medicamentos!=null) {
		
			model.addAttribute("list",medicamentos);
			return "ver-medicamentos";
		}
		model.addAttribute("error","No hay datos");
		return "ver-medicamentos";
	}
	@RequestMapping(value= "/verUsuarios")
	public String verUsuarios(Model model) throws SQLException {
		/*LinkedList<UsuarioTO> user= new LinkedList<>();

		UsuarioDAO userDao = new UsuarioDAO();
		user = userDao.readAll();*/
		Iterable<Usuario> usuarios = usuarioService.findAll();
		if(usuarios!=null) {
		
			model.addAttribute("list",usuarios);
			return "ver-usuarios";
		}
		model.addAttribute("error","No hay datos");
		return "ver-usuarios";
	}
	@RequestMapping(value= "/verAdministradores")
	public String verAdministradores(Model model) throws SQLException {
		/*LinkedList<UsuarioTO> user= new LinkedList<>();

		UsuarioDAO userDao = new UsuarioDAO();
		user = userDao.readAll();*/
		Iterable<Administrador> admins = administradorService.findAll();
		if(admins!=null) {
		
			model.addAttribute("list",admins);
			return "ver-administradores";
		}
		model.addAttribute("error","No hay datos");
		return "ver-administradores";
	}
	@RequestMapping(value= "/verfarmacias")
	public String verFarmacias(Model model) throws SQLException {
		/*LinkedList<UsuarioTO> user= new LinkedList<>();

		UsuarioDAO userDao = new UsuarioDAO();
		user = userDao.readAll();*/
		Iterable<Farmacia> farm = farmaciaService.findAll();
		if(farm!=null) {
		
			model.addAttribute("list",farm);
			return "ver-farmacias";
		}
		model.addAttribute("error","No hay datos");
		return "ver-farmacias";
	}
	@RequestMapping(value= "/verMedicamentosSol")
	public String verMed(Model model) throws SQLException {
		/*LinkedList<UsuarioTO> user= new LinkedList<>();

		UsuarioDAO userDao = new UsuarioDAO();
		user = userDao.readAll();*/
		Iterable<Medicamentoxusuario> med = medicamentoxusuarioService.findAll();
		if(med!=null) {
		
			model.addAttribute("list",med);
			return "ver-solicitudes";
		}
		model.addAttribute("error","No hay datos");
		return "ver-solicitudes";
	}
	@RequestMapping(value= "/editmed", method= RequestMethod.GET)
	public String editarMedicamento(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		/*MedicamentoTO med= new MedicamentoTO();
		med.setIdMedicamento(id);
		MedicamentoDAO medDao = new MedicamentoDAO();
		med = medDao.read(med);
		if(med!=null) {*/
		Medicamento med = medicamentoService.findById(id);
		if(med!=null) {
		model.addAttribute("med",med);
		return "modificar-medicamentos";
		}
		return "modificar-medicamentos";
	}
	@RequestMapping(value= "/deletemed", method= RequestMethod.GET)
	public String eliminarMedicamento(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		
		medicamentoService.delete(id);
		model.addAttribute("error","Se eliminó registro");
		return this.verMedicamento(model);
	}
	@RequestMapping(value= "/deletefarm", method= RequestMethod.GET)
	public String deletefarm(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		
		farmaciaService.delete(id);
		model.addAttribute("error","Se eliminó registro");
		return this.verFarmacias(model);
	}
	@RequestMapping(value= "/estadofarm", method= RequestMethod.GET)
	public String estadofarm(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		
		farmaciaService.cambiarEstado(id);
		model.addAttribute("error","Se actualizó registro");
		return this.verFarmacias(model);
	}
	@RequestMapping(value= "/deleteadmin", method= RequestMethod.GET)
	public String deleteadmin(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		
		administradorService.delete(id);
		model.addAttribute("error","Se eliminó registro");
		return this.verAdministradores(model);
	}
	@RequestMapping(value= "/edituser", method= RequestMethod.GET)
	public String editarUser(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		/*UsuarioTO user= new UsuarioTO();
		user.setIdUsuario(id);
		UsuarioDAO userDao = new UsuarioDAO();
		user = userDao.read(user);*/
		Usuario user = usuarioService.findById(id);
		if(user!=null) {
		model.addAttribute("user",user);
		return "modificar-usuarios";
		}
		return "modificar-usuarios";
	}
	@RequestMapping(value= "/editadmin", method= RequestMethod.GET)
	public String editadmin(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		/*UsuarioTO user= new UsuarioTO();
		user.setIdUsuario(id);
		UsuarioDAO userDao = new UsuarioDAO();
		user = userDao.read(user);*/
		Administrador admin = administradorService.findById(id);
		if(admin!=null) {
		model.addAttribute("admin",admin);
		return "modificar-administradores";
		}
		return "modificar-administradores";
	}
	@RequestMapping(value= "/editfarm", method= RequestMethod.GET)
	public String editfarm(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		/*UsuarioTO user= new UsuarioTO();
		user.setIdUsuario(id);
		UsuarioDAO userDao = new UsuarioDAO();
		user = userDao.read(user);*/
		Farmacia farm = farmaciaService.findById(id);
		if(farm!=null) {
		model.addAttribute("farmacia",farm);
		return "modificar-farmacias";
		}
		return "modificar-farmacias";
	}
	@RequestMapping(value= "/deleteuser", method= RequestMethod.GET)
	public String eliminarUser(@RequestParam(value="id", required=false, defaultValue="World") int id,Model model) throws SQLException {
		/*UsuarioTO user= new UsuarioTO();
		user.setIdUsuario(id);
		UsuarioDAO userDao = new UsuarioDAO();
		
		
		if( userDao.delete(user)) {
			
		return this.verUsuarios(model);
		}
		model.addAttribute("error","No se elimino registro");*/
		usuarioService.delete(id);
		model.addAttribute("error","Se eliminó registro");
		return this.verUsuarios(model);
	}
	
	@RequestMapping(value= "/muestraMedicamento", method= RequestMethod.POST)
	public String verConsultaMedicamento(@RequestParam(value="name") String name,Model model) throws SQLException {
		MedicamentoTO med= new MedicamentoTO();
		LinkedList<FarmaciaXMedicamentoTO> meds= new LinkedList<>();
		med.setNombreComercial(name);
		System.out.println(med.getNombreComercial());
		MedicamentoDAO medDao = new MedicamentoDAO();
		meds = medDao.readConsulta(med);
		if(meds.size()>0) {
			model.addAttribute("list",meds);
			return "muestraMedicamento";
		}
		System.out.println(meds.size());
		model.addAttribute("error","No se encontro registro");
		return this.index(model);
	}
}
