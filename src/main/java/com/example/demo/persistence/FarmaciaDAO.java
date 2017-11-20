package com.example.demo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.demo.transferobject.FarmaciaTO;
import com.example.demo.transferobject.MedicamentoTO;

public class FarmaciaDAO {
	private static final String INSERT_QUERY = "INSERT INTO `farmacia`( `nombre`, `ubicacion`, `estadoTurno`,`idAdministrador`) VALUES(?,?,?,?)";
	private static final String DELETE_QUERY = "DELETE FROM `farmacia` WHERE idFarmacia=?";
	private static final String UPDATE_QUERY = "UPDATE `farmacia` SET `nombre`=?,`ubicacion`=?,`estadoTurno`=?,`idAdministrador`=? WHERE `idFarmacia`=?";
	private static final String READ_QUERY = "SELECT * FROM `farmacia` where idFarmacia=?";
	private static final String READ_ALL = "SELECT * FROM `farmacia`";
	private static final String DB_NAME = "farmacia";
	private static final String PORT = "3306";
	private static final String URL = "jdbc:mysql://localhost:" + PORT + "/" + DB_NAME;
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection conexion = null;

	public int create(FarmaciaTO farmacia) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement 	ps = conexion.prepareStatement(INSERT_QUERY);
			ps.setString(1, farmacia.getNombre());
			ps.setString(2, farmacia.getUbicacion());
			ps.setInt(3, farmacia.getEstado());
			ps.setInt(4, farmacia.getAdministrador());
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

	public int update(FarmaciaTO farmacia) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(UPDATE_QUERY);
			ps.setString(1, farmacia.getNombre());
			ps.setString(2, farmacia.getUbicacion());
			ps.setInt(3, farmacia.getEstado());
			ps.setInt(4, farmacia.getAdministrador());
			ps.setInt(2, farmacia.getId());
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

	public LinkedList<FarmaciaTO> readAll() throws SQLException {
		LinkedList<FarmaciaTO> list = new LinkedList<>();
		FarmaciaTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_ALL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new FarmaciaTO();
				result.setNombre(rs.getString("nombre"));
				result.setUbicacion(rs.getString("ubicacion"));
				result.setEstado(rs.getInt("estadoTurno"));
				result.setAdministrador(rs.getInt("idAdministrador"));
				result.setId(rs.getInt("idFarmacia"));
				list.add(result);
			}
		} catch (SQLException ex) {
			Logger.getLogger(MedicamentoTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (conexion != null)
				conexion.close();
		}
		return list;
	}

	public FarmaciaTO read(FarmaciaTO farmacia) throws SQLException {
		FarmaciaTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_QUERY);
			ps.setInt(1, farmacia.getId());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new FarmaciaTO();
				result.setNombre(rs.getString("nombre"));
				result.setUbicacion(rs.getString("ubicacion"));
				result.setEstado(rs.getInt("estadoTurno"));
				result.setAdministrador(rs.getInt("idAdministrador"));
				result.setId(rs.getInt("idFarmacia"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(FarmaciaTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			conexion.close();
		}
		return result;
	}

	public boolean delete(FarmaciaTO medicamento) throws SQLException {
		boolean resultado = false;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(DELETE_QUERY);
			ps.setInt(1, medicamento.getId());
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
}
