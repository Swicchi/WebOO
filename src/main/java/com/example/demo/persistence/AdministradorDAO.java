package com.example.demo.persistence;

import com.example.demo.transferobject.AdministradorTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Remigio
 */
public class AdministradorDAO {
	private static final String INSERT_QUERY = "INSERT INTO `administrador`( `rut`, `clave`, `nombre`, `apellidoPaterno`, `apellidoMaterno`, `telefono`, `direccion`, `correo`) VALUES(?,?,?,?,?,?,?,?)";
	private static final String DELETE_QUERY = "DELETE FROM `administrador` WHERE idAdministrador=?";
	private static final String UPDATE_QUERY = "UPDATE `administrador` SET`rut`=?,`clave`=?,`nombre`=?,`apellidoPaterno`=?,`apellidoMaterno`=?,`telefono`=?,`direccion`=?,`correo`=? WHERE idAdministrador=? ";
	private static final String READ_QUERY = "SELECT * FROM `administrador` where idAdministrador=?";
	private static final String LOGIN = "SELECT * FROM `administrador` where `clave` = ? and correo = ? ";
	private static final String READ_ALL = "SELECT * FROM `administrador`";
	private static final String DB_NAME = "farmacia";
	private static final String PORT = "3306";
	private static final String URL = "jdbc:mysql://localhost:" + PORT + "/" + DB_NAME;
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection conexion = null;

	public int create(AdministradorTO admin) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(INSERT_QUERY);
			ps.setString(1, admin.getRut());
			ps.setString(2, admin.getClave());
			ps.setString(3, admin.getNombre());
			ps.setString(4, admin.getApellidoPaterno());
			ps.setString(5, admin.getApellidoMaterno());
			ps.setInt(6, admin.getTelefono());
			ps.setString(7, admin.getDireccion());
			ps.setString(8, admin.getCorreo());
			ps.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (conexion != null)
				conexion.close();
		}

		return result;
	}

	public int update(AdministradorTO admin) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(UPDATE_QUERY);
			ps.setString(1, admin.getRut());
			ps.setString(2, admin.getClave());
			ps.setString(3, admin.getNombre());
			ps.setString(4, admin.getApellidoPaterno());
			ps.setString(5, admin.getApellidoMaterno());
			ps.setInt(6, admin.getTelefono());
			ps.setString(7, admin.getDireccion());
			ps.setString(8, admin.getCorreo());
			ps.setInt(9, admin.getIdAdministrador());
			ps.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (conexion != null)
				conexion.close();
		}

		return result;
	}

	public LinkedList<AdministradorTO> readAll() throws SQLException {
		LinkedList<AdministradorTO> list = new LinkedList<>();
		AdministradorTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_ALL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new AdministradorTO();
				result.setRut(rs.getString("rut"));
				result.setClave(rs.getString("clave"));
				result.setNombre(rs.getString("nombre"));
				result.setApellidoPaterno(rs.getString("apellidoPaterno"));
				result.setApellidoMaterno(rs.getString("apellidoMaterno"));
				result.setTelefono(rs.getInt("telefono"));
				result.setDireccion(rs.getString("direccion"));
				result.setCorreo(rs.getString("correo"));
				list.add(result);
			}
		} catch (SQLException ex) {
			Logger.getLogger(AdministradorTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (conexion != null)
				conexion.close();
		}
		return list;
	}

	public AdministradorTO read(AdministradorTO admin) throws SQLException {
		AdministradorTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_QUERY);
			ps.setInt(1, admin.getIdAdministrador());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new AdministradorTO();
				result.setRut(rs.getString("rut"));
				result.setClave(rs.getString("clave"));
				result.setNombre(rs.getString("nombre"));
				result.setApellidoPaterno(rs.getString("apellidoPaterno"));
				result.setApellidoMaterno(rs.getString("apellidoMaterno"));
				result.setTelefono(rs.getInt("telefono"));
				result.setDireccion(rs.getString("direccion"));
				result.setCorreo(rs.getString("correo"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(AdministradorTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			conexion.close();
		}
		return result;
	}

	public boolean delete(AdministradorTO admin) throws SQLException {
		boolean resultado = false;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(DELETE_QUERY);
			ps.setInt(1, admin.getIdAdministrador());
			ps.executeUpdate();
			resultado = true;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (conexion != null)
				conexion.close();
		}
		return resultado;
	}

	private static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/farmacia", "root", "");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
			System.err.println("Quedo la pata hermano!!!");
		}
		return conexion;
	}

	public AdministradorTO login(AdministradorTO admin) throws SQLException {
		// TODO Auto-generated method stub
		AdministradorTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(LOGIN);
			ps.setString(1, admin.getCorreo());
			ps.setString(2, admin.getClave());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new AdministradorTO();
				result.setRut(rs.getString("rut"));
				result.setClave(rs.getString("clave"));
				result.setNombre(rs.getString("nombre"));
				result.setApellidoPaterno(rs.getString("apellidoPaterno"));
				result.setApellidoMaterno(rs.getString("apellidoMaterno"));
				result.setTelefono(rs.getInt("telefono"));
				result.setDireccion(rs.getString("direccion"));
				result.setCorreo(rs.getString("correo"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(AdministradorTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			conexion.close();
		}
		return result;
	}
}
