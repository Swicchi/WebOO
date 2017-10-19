package com.example.demo.persistence;

import com.example.demo.transferobject.UsuarioTO;

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
public class UsuarioDAO {
	private static final String INSERT_QUERY = "INSERT INTO `usuario`( `rut`, `clave`, `nombre`, `apellidoPaterno`, `apellidoMaterno`, `telefono`, `direccion`, `correo`) VALUES(?,?,?,?,?,?,?,?)";
	private static final String DELETE_QUERY = "DELETE FROM `usuario` WHERE idUsuario=?";
	private static final String UPDATE_QUERY = "UPDATE `usuario` SET`rut`=?,`clave`=?,`nombre`=?,`apellidoPaterno`=?,`apellidoMaterno`=?,`telefono`=?,`direccion`=?,`correo`=? WHERE idUsuario=? ";
	private static final String READ_QUERY = "SELECT * FROM `usuario` where idUsuario=?";
	private static final String LOGIN = "SELECT * FROM `usuario` where `correo` = ? and clave = ? ";
	private static final String READ_ALL = "SELECT * FROM `usuario`";
	private static final String DB_NAME = "farmacia";
	private static final String PORT = "3306";
	private static final String URL = "jdbc:mysql://localhost:" + PORT + "/" + DB_NAME;
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection conexion = null;

	public int create(UsuarioTO user) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(INSERT_QUERY);
			ps.setString(1, user.getRut());
			ps.setString(2, user.getClave());
			ps.setString(3, user.getNombre());
			ps.setString(4, user.getApellidoPaterno());
			ps.setString(5, user.getApellidoMaterno());
			ps.setInt(6, user.getTelefono());
			ps.setString(7, user.getDireccion());
			ps.setString(8, user.getCorreo());
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

	public int update(UsuarioTO user) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(UPDATE_QUERY);
			ps.setString(1, user.getRut());
			ps.setString(2, user.getClave());
			ps.setString(3, user.getNombre());
			ps.setString(4, user.getApellidoPaterno());
			ps.setString(5, user.getApellidoMaterno());
			ps.setInt(6, user.getTelefono());
			ps.setString(7, user.getDireccion());
			ps.setString(8, user.getCorreo());
			ps.setInt(9, user.getIdUsuario());
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

	public LinkedList<UsuarioTO> readAll() throws SQLException {
		LinkedList<UsuarioTO> list = new LinkedList<>();
		UsuarioTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_ALL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new UsuarioTO();
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
			Logger.getLogger(UsuarioTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (conexion != null)
				conexion.close();
		}
		return list;
	}

	public UsuarioTO read(UsuarioTO user) throws SQLException {
		UsuarioTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_QUERY);
			ps.setInt(1, user.getIdUsuario());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new UsuarioTO();
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
			Logger.getLogger(UsuarioTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			conexion.close();
		}
		return result;
	}

	public boolean delete(UsuarioTO user) throws SQLException {
		boolean resultado = false;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(DELETE_QUERY);
			ps.setInt(1, user.getIdUsuario());
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

	public UsuarioTO login(UsuarioTO user) throws SQLException {
		// TODO Auto-generated method stub
		UsuarioTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(LOGIN);
			ps.setString(1, user.getCorreo());
			ps.setString(2, user.getClave());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new UsuarioTO();
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
			Logger.getLogger(UsuarioTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			conexion.close();
		}
		return result;
	}
}
