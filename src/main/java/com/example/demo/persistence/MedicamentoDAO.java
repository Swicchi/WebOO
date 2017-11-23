package com.example.demo.persistence;

import com.example.demo.transferobject.FarmaciaXMedicamentoTO;
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
	private static final String INSERT_QUERY = "INSERT INTO `medicamento`( `nombreComercial`, `nombreGenerico`) VALUES(?,?)";
	private static final String DELETE_QUERY = "DELETE FROM `medicamento` WHERE idMedicamento=?";
	private static final String UPDATE_QUERY = "UPDATE `medicamento` SET `nombreComercial`=?,`nombreGenerico`=? WHERE `idMedicamento`=?";
	private static final String READ_QUERY = "SELECT * FROM `medicamento` where idMedicamento=?";
	private static final String READ_ALL = "SELECT * FROM `medicamento`";
	private static final String READ_MEDICAMENTO = "SELECT *, farmacia.nombre AS nombreFarmacia FROM `medicamento` JOIN `farmaciaxmedicamento` ON medicamento.idMedicamento = farmaciaxmedicamento.idMedicamento JOIN `farmacia` ON farmaciaxmedicamento.idFarmacia = farmacia.idFarmacia where `nombreComercial`=?  OR `nombreGenerico`=?";
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
			ps.setString(1, medicamento.getNombreComercial());
			ps.setString(2, medicamento.getNombreGenerico());
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
			ps.setString(1, medicamento.getNombreComercial());
			ps.setString(2, medicamento.getNombreGenerico());
			ps.setInt(3, medicamento.getIdMedicamento());
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
				result.setNombreComercial(rs.getString("nombreComercial"));
				result.setNombreGenerico(rs.getString("nombreGenerico"));
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
				result.setNombreComercial(rs.getString("nombreComercial"));
				result.setNombreGenerico(rs.getString("nombreGenerico"));
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
	
	public LinkedList<FarmaciaXMedicamentoTO> readConsulta(MedicamentoTO medicamento) throws SQLException {
		LinkedList<FarmaciaXMedicamentoTO> list = new LinkedList<>();
		FarmaciaXMedicamentoTO result = null;
		try {
			conexion = getConnection();
			PreparedStatement ps = conexion.prepareStatement(READ_MEDICAMENTO);
			ps.setString(1, medicamento.getNombreComercial());
			ps.setString(2, medicamento.getNombreComercial());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = new FarmaciaXMedicamentoTO();
				result.setNombreGenerico(rs.getString("nombreGenerico"));
				result.setNombreComercial(rs.getString("nombreComercial"));
				result.setIdMedicamento(rs.getInt("idMedicamento"));
				result.setIdFarmacia(rs.getInt("idFarmacia"));
				result.setNombreFarmacia(rs.getString("nombreFarmacia"));
				result.setUbicacion(rs.getString("ubicacion"));
				result.setPrecio(rs.getInt("precio"));
				result.setStock(rs.getInt("stock"));
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