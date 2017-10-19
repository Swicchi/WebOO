package com.example.demo.persistence;

import com.example.demo.transferobject.MedicamentoTO;

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
public class MedicamentoDAO {
	private static final String INSERT_QUERY = "INSERT INTO `medicamento`( `nombre`) VALUES(?)";
	private static final String DELETE_QUERY = "DELETE FROM `medicamento` WHERE idMedicamento=?";
	private static final String UPDATE_QUERY = "UPDATE `medicamento` SET` `nombre`=?  WHERE idMedicamento=? ";
	private static final String READ_QUERY = "SELECT * FROM `medicamento` where idMedicamento=?";
	private static final String READ_ALL = "SELECT * FROM `medicamento`";
	private static final String DB_NAME = "farmacia";
	private static final String PORT = "3306";
	private static final String URL = "jdbc:mysql://localhost:" + PORT + "/" + DB_NAME;
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection conexion = null;

	public int create(MedicamentoTO medicamento) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement 	ps = conexion.prepareStatement(INSERT_QUERY);
			ps.setString(1, medicamento.getNombre());
			
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

	public int update(MedicamentoTO medicamento) throws SQLException {

		int result = 0;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(UPDATE_QUERY);
			ps.setString(1, medicamento.getNombre());
			ps.setInt(2, medicamento.getIdMedicamento());
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

	public LinkedList<MedicamentoTO> readAll() throws SQLException {
		LinkedList<MedicamentoTO> list = new LinkedList<>();
		MedicamentoTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_ALL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new MedicamentoTO();
				result.setNombre(rs.getString("nombre"));
				result.setIdMedicamento(rs.getInt("idMedicamento"));
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

	public MedicamentoTO read(MedicamentoTO medicamento) throws SQLException {
		MedicamentoTO result = null;

		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_QUERY);
			ps.setInt(1, medicamento.getIdMedicamento());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new MedicamentoTO();
				result.setNombre(rs.getString("nombre"));
				result.setIdMedicamento(rs.getInt("idMedicamento"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(MedicamentoTO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			conexion.close();
		}
		return result;
	}

	public boolean delete(MedicamentoTO medicamento) throws SQLException {
		boolean resultado = false;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(DELETE_QUERY);
			ps.setInt(1, medicamento.getIdMedicamento());
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