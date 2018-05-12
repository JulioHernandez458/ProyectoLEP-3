package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MatriculaModel {
	
	public ArrayList<MatriculasGS> getAll(){
		Connection conn = null;
		ArrayList<MatriculasGS> matricula = new ArrayList<MatriculasGS>();
		try {
			conn = new ConexionBDD().getConnection();
			 String sql = "Select * from Matricula";
 	

			  ResultSet rs = conn.createStatement().executeQuery(sql);
	            while (rs.next()) {       
	                MatriculasGS a = new MatriculasGS();
	                a.setId_matricula(rs.getInt("id_matricula"));
	                a.setCarnet(rs.getString("carnet"));
	                a.setId_grado(rs.getString("id_grado"));
	                
	                
	                

	                matricula.add(a);
	            }

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return matricula;
		
	}
	
	public void insertD(MatriculasGS matricula) {
		Connection conn = null;
		try {
			conn = new ConexionBDD().getConnection();
			String insert = "INSERT INTO matricula (carnet,id_grado) "
					+ " values (?,?,?)";
		    
			PreparedStatement ps = conn.prepareStatement(insert);

			
			ps.setString(2, matricula.getCarnet());
			ps.setString(3, matricula.getId_grado());
			
			
		
			
			//Ejecutamos el query en la base de datos
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// Codigo que siempre se ejecutara
			// Se debe cerrar siempre la conexion a BDD
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	

}



